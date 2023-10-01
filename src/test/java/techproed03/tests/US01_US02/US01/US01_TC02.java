package techproed03.tests.US01_US02.US01;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.pages.FakeMailPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTiklaVeFakeMailAl;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US01_TC02 {
    @Test
    public void testBosUserName() {
        AlloverPage homePage = new AlloverPage();
        FakeMailPage fakeMailPage = new FakeMailPage();
        SiteyeGitRegisterTiklaVeFakeMailAl kayitIslemleri = new SiteyeGitRegisterTiklaVeFakeMailAl();
        kayitIslemleri.siteyeGitVeRegisterTikla();

        // Username kutusunu bos birakir
        //Your Email address kutusuna gecerli bir email girer
        //Password kutusuna bir sifre girer
        String fakeMail = fakeMailPage.fakeMailAyse.getText();
        ReusableMethods.extentTest.info("Fake mail'in text bölümü alindi");
        List<String> windows = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(0));
        homePage.emailTabAyse.sendKeys(fakeMail);
        ReusableMethods.extentTest.info("Kullanici fakemail sitesinde olusturulmus emaili alarak," +
                "Allover tab ine dönüs yapti ve bu maili mail kutusuna girdi");

        //kullanici password girer
        homePage.passwordTabAyse.sendKeys(ConfigReader.getProperty("passwordAyse"));
        ReusableMethods.extentTest.info("Kullanici password girdi");

        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();
        ReusableMethods.extentTest.info("Kullanici ilgili checkbox i secti");

        //SIGN UP butonuna tiklar
        homePage.signUpAyse.click();
        ReusableMethods.extentTest.info("Kullanici sign up butonuna tikladi");

        //Kayit isleminin gerceklesmedigini dogrular, loginpop up görünmeye devam eder
        Assert.assertTrue(homePage.loginPopupAyse.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici kayit islemini tamamladi");
        ReusableMethods.extentReport.flush();

    }
}
