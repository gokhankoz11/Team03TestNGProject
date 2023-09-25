package techproed03.tests.US01_US02.US01;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.pages.FakeMailPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US01_TC01 {
    @Test
    public void testCase01() {
        AlloverPage homePage=new AlloverPage();
        FakeMailPage fakeMailPage=new FakeMailPage();

        //  Kullanici Web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //Register butonuna tiklarRegister butonuna tiklar
        homePage.registerLinkAyse.click();

        //fake mail alir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        fakeMailPage.constentAyse.click();

        //Username kutusuna bir kullanici adi girer
        //Your Email address kutusuna gecerli bir email girer
        //Password kutusuna bir sifre girer
        String fakeMail= fakeMailPage.fakeMailAyse.getText();
        List<String> windows=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(0));
        homePage.emailTabAyse.sendKeys(fakeMail);

        int indexOfPoint=fakeMail.indexOf(".");
        String userName=fakeMail.substring(0,indexOfPoint);
        homePage.usernameTabAyse.sendKeys(userName);

        homePage.passwordTabAyse.sendKeys(ConfigReader.getProperty("password"));

        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();

        //SIGN UP butonuna tiklar
        homePage.signUpAyse.click();

        //Kayit isleminin gerceklestigini dogrular, Homepage e gider
        Assert.assertTrue(homePage.welcomeHeadAyse.isDisplayed());
    }
}
