package kendiCalismam.tests.US05_US14.US_05;

import kendiCalismam.pages.AlloverPage;
import kendiCalismam.utilities.ConfigReader;
import kendiCalismam.utilities.Driver;
import kendiCalismam.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_AccountDetailsDegistirebilme {
    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        AlloverPage alloverPage=new AlloverPage();
        alloverPage.ilkGirisSignInSuna.click();

        String email=ConfigReader.getProperty("kullaniciUsernameSuna");
        String passWord=ConfigReader.getProperty("kullaniciPasswordSuna");
        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(email, Keys.TAB,passWord,Keys.ENTER);

        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();

        alloverPage.firstNameSuna.clear();
        alloverPage.firstNameSuna.sendKeys("Lena",Keys.ARROW_RIGHT);
        ReusableMethods.bekle(2);
        alloverPage.lastNameSuna.clear();
        alloverPage.lastNameSuna.sendKeys("Schmidt",Keys.TAB);
        ReusableMethods.bekle(2);
        alloverPage.displayNameSuna.clear();
        alloverPage.displayNameSuna.sendKeys("Lenaaa",Keys.TAB);
        ReusableMethods.bekle(2);
        alloverPage.emailAdressSuna.clear();
        alloverPage.emailAdressSuna.sendKeys("armany.raja@feerock.com",Keys.ENTER);;

        ReusableMethods.scroll(alloverPage.saveChangesButtonSuna);
        ReusableMethods.click(alloverPage.saveChangesButtonSuna);

        Assert.assertTrue(alloverPage.basariliYazisi1Suna.isDisplayed());


    }
}
