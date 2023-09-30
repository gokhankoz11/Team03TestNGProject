package techproed03.tests.US05_US14.US05;

import org.testng.Assert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC04_PasswordDegistirilebilirligi {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlSuna"));
        AlloverPage alloverPage=new AlloverPage();
        ReusableMethods.rapor("chrome","Password Degisikliginin Gerceklestiginin Dogrulanmasi ");

        alloverPage.ilkGirisSignInSuna.click();
        ReusableMethods.bekle(2);

        String email=ConfigReader.getProperty("kullaniciUsernameSuna"); //--> configuration.properties'ten
        String password=ConfigReader.getProperty("kullaniciPasswordSuna"); //-->configuration.properties'ten

        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        ReusableMethods.extentTest.info("My Account butonuna tıklandı.");
        alloverPage.accountDetailsLinkSuna.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Account details butonuna tıklandı.");
        alloverPage.firstNameSuna.clear();
        alloverPage.firstNameSuna.sendKeys("Ayse",Keys.ARROW_RIGHT);
        ReusableMethods.bekle(2);
        alloverPage.lastNameSuna.clear();
        alloverPage.lastNameSuna.sendKeys("Müller",Keys.TAB);
        ReusableMethods.bekle(2);
        alloverPage.displayNameSuna.clear();
        ReusableMethods.bekle(1);
        alloverPage.displayNameSuna.sendKeys("Ayse",Keys.ENTER);
        ReusableMethods.scroll(alloverPage.currentPasswordSuna);
        ReusableMethods.click(alloverPage.currentPasswordSuna);

        alloverPage.currentPasswordSuna.sendKeys(ConfigReader.getProperty("currentPassword"),Keys.TAB);
        ReusableMethods.extentTest.info("Current Passwort alanina mevcut sifre girildi");
        alloverPage.newPasswordSuna.sendKeys(ConfigReader.getProperty("newPasswort"),Keys.TAB);
        ReusableMethods.extentTest.info("New Passwort alanina yeni bir sifre girildi");
        alloverPage.confirmPasswordSuna.sendKeys(ConfigReader.getProperty("confirmPasswort"),Keys.ENTER);
        ReusableMethods.extentTest.info("Confirm Passwort alanina yeni sifre tekrar girildi");
        ReusableMethods.click(alloverPage.saveChangesButtonSuna);
        Assert.assertTrue(alloverPage.basariliYazisi2Suna.isDisplayed());
        ReusableMethods.extentTest.info("Sifrenin degistirilebildigi dogrulandi");
        ReusableMethods.extentReport.flush();
    }
}
