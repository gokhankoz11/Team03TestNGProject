package kendiCalismam.tests.US05_US14.US_05;

import kendiCalismam.pages.AlloverPage;
import kendiCalismam.utilities.ConfigReader;
import kendiCalismam.utilities.Driver;
import kendiCalismam.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_AccountDetailsDogrulama {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        AlloverPage alloverPage=new AlloverPage();
        alloverPage.ilkGirisSignInSuna.click();
        ReusableMethods.bekle(2);
        String email=ConfigReader.getProperty("kullaniciUsernameSuna"); //--> configuration.properties'ten
        String password=ConfigReader.getProperty("kullaniciPasswordSuna"); //-->configuration.properties'ten
        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(email,Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();
        Assert.assertTrue(alloverPage.accountDetailsBasligiSuna.isDisplayed());










    }
}
