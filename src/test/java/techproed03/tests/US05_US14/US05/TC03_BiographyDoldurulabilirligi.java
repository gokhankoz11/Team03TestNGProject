package techproed03.tests.US05_US14.US05;

import org.testng.Assert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC03_BiographyDoldurulabilirligi {


    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlSuna"));
        AlloverPage alloverPage = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.rapor("chrome", "Biography Alanina Yazi Yazilabilmesi");

        alloverPage.ilkGirisSignInSuna.click();
        String emailOrUsername = ConfigReader.getProperty("kullaniciUsernameSuna");
        String password = ConfigReader.getProperty("kullaniciPasswordSuna");
        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(emailOrUsername, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();
        ReusableMethods.extentTest.info("Account Details linkine girildi");

        ReusableMethods.bekle(2);
        actions.moveToElement(alloverPage.biographyBolumuSuna);
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(alloverPage.biographyBolumuSuna);
        ReusableMethods.extentTest.info("Biography yazi alanina gecis yapildi");
        ReusableMethods.bekle(2);
        alloverPage.biographyBolumuSuna.clear();
        alloverPage.biographyBolumuSuna.sendKeys(ConfigReader.getProperty("biographyYazi"));
        ReusableMethods.extentTest.info("Biography yazi alanina yazi yazildi");
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(alloverPage.saveChangesButtonSuna);
        ReusableMethods.click(alloverPage.saveChangesButtonSuna);
        ReusableMethods.extentTest.info("SAVE CHANGES butonuna tıklandı.");

        Assert.assertTrue(alloverPage.basariliYazisi2Suna.isDisplayed());
        ReusableMethods.extentTest.pass("Account details changed successfully. uyarısı görüldü.");
        ReusableMethods.extentReport.flush();


    }
}
