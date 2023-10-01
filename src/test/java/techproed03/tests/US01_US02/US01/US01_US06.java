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

public class US01_US06 {
    @Test
    public void mailWIthoutQueue() {
        AlloverPage homePage=new AlloverPage();
        FakeMailPage fakeMailPage=new FakeMailPage();
        SiteyeGitRegisterTiklaVeFakeMailAl kayitIslemleri=new SiteyeGitRegisterTiklaVeFakeMailAl();
        kayitIslemleri.siteyeGitVeRegisterTikla();

        //Username kutusuna bir kullanici adi girer
        //Your Email address kutusuna gecerli bir email girer
        //Password kutusuna bir sifre girer
        String fakeMail= fakeMailPage.fakeMailAyse.getText();
        ReusableMethods.extentTest.info("Fake mail'in text bölümü alindi");
        List<String> windows=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(0));
        ReusableMethods.extentTest.info("Kullanici Allover eCommerce sayfasina geri döndü");

        int indexOfPoint=fakeMail.indexOf(".");
        String userName=fakeMail.substring(0,indexOfPoint);
        homePage.usernameTabAyse.sendKeys(userName);
        ReusableMethods.extentTest.info("Kullanici Username girdi");

        int indexOfMailSymbol=fakeMail.indexOf("@");
        String emailWithoutQueue=fakeMail.substring(0,(indexOfMailSymbol-1));
        homePage.emailTabAyse.sendKeys(emailWithoutQueue);
        ReusableMethods.extentTest.info("Kullanici email eklentisi bulunmayan bir email girdi");

        //password gir
        homePage.passwordTabAyse.sendKeys(ConfigReader.getProperty("passwordAyse"));
        ReusableMethods.extentTest.info("Kullanici bir password girdi");

        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();
        ReusableMethods.extentTest.info("Kullanici ilgili checkbox i secti");

        //SIGN UP butonuna tiklar
        homePage.signUpAyse.click();
        ReusableMethods.extentTest.info("Kullanici sign up butonuna tikladi");

        //Kayit isleminin gerceklesmedigini gorur.login popup i hala aciktir
        Assert.assertTrue(homePage.loginPopupAyse.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici kayit islemini tamamlamadi ve pop up görünmeye devam etti");
        ReusableMethods.extentReport.flush();

    }
}
