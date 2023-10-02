package techproed03.tests.US10_US11.US11;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US10_US11.US10.ExtentReport;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;


public class US11_TC01_VendorSignIn extends ExtentReport {



    @Test
    public void test1_VendorSignIn() {
        extentTest = extentReports.createTest("VendorSigIn US11_TC01","Vendor sign in, Vendor olarak Sign in yapılabilmeli");

        // 1 Vendor anasayfaya gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlHkn"));
        ReusableMethods.bekle(2);

        extentTest.info("Anasayfaya gidildi");
        AlloverPage page = new AlloverPage();

        // 2 Sign In butonuna tıklar
        ReusableMethods.click(page.signInHkn);
        extentTest.info("Sign in butonuna tıklandı");

        ReusableMethods.bekle(1);

        //3 Sign in pop-up penceresinde bulunan "SIGN-IN" butonunun görünür ve ulaşılabilir olduğunu doğrula
        page.signInPopUpHkn.isEnabled();//Ulasilabilir
        extentTest.info("Sign In PopUp penceresinin erişilebildiği doğrulandı");
        ReusableMethods.bekle(1);

        //4 "Username or email address" alanına kayıtlı bir mail adresi girer.
        page.usernameKutusuHkn.sendKeys(ConfigReader.getProperty("userNameHkn"));
        extentTest.info("Kayıtlı bir email adresi girildi");

        ReusableMethods.bekle(1);

        //5 "Password" alanına kayıtlı bir şifre girer.
        page.passwordHkn.sendKeys(ConfigReader.getProperty("passwordHkn"));
        extentTest.info("Kayıtlı bir password girildi");

        ReusableMethods.bekle(1);

        //6 "Popup sign in butonuna tıklar.
        page.signInButtonHkn.click();
        ReusableMethods.bekle(1);
        extentTest.info("PopUp penceresi Sign In butonuna tıklandı");

        ReusableMethods.bekle(1);

        //7 "Sign out butonuna tıkla (Sign in yapıldığını doğrula)
        Assert.assertTrue(page.signOutButonuHkn.isDisplayed());
        page.signOutButonuHkn.click();
        extentTest.info("Sign out butonuna tıklandı");

        ReusableMethods.bekle(1);

        //8 My Account yazısının göründüğünü doğrula
        Assert.assertTrue(page.myAccountYazisiHkn.isDisplayed());
        extentTest.info("Vendor olarak kendi hesabına gidilidiği doğrulandı.");
        ReusableMethods.bekle(1);





    }


}
