package techproed03.tests.US05_US14.US05;

import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_AccountDetailsDogrulama {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlSuna"));
        AlloverPage alloverPage=new AlloverPage();
        ReusableMethods.rapor("chrome","Verify Account Details");
        alloverPage.ilkGirisSignInSuna.click();
        ReusableMethods.bekle(2);

        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(ConfigReader.getProperty("kullaniciUsernameSuna"));
        ReusableMethods.bekle(1);
        alloverPage.passwordBoxSuna.sendKeys(ConfigReader.getProperty("kullaniciPasswordSuna"));
        ReusableMethods.bekle(1);
        alloverPage.ikinciSignInButtonSuna.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici Allover Commerce sitesine basarili giris yapti ");
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();
        Assert.assertTrue(alloverPage.accountDetailsBasligiSuna.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici Hesap Detaylarinin goruldugu dogrulandi");
        ReusableMethods.extentReport.flush();

    }
}
