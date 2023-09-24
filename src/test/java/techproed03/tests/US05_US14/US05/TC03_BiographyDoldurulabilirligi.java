package kendiCalismam.tests.US05_US14.US_05;

import kendiCalismam.pages.AlloverPage;
import kendiCalismam.utilities.ConfigReader;
import kendiCalismam.utilities.Driver;
import kendiCalismam.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC03_BiographyDoldurulabilirligi {


    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        AlloverPage alloverPage=new AlloverPage();
        Actions actions=new Actions(Driver.getDriver());

        alloverPage.ilkGirisSignInSuna.click();
        String emailOrUsername=ConfigReader.getProperty("kullaniciUsernameSuna");
        String password=ConfigReader.getProperty("kullaniciPasswordSuna");
        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(emailOrUsername, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();

        ReusableMethods.bekle(2);
        actions.moveToElement(alloverPage.biographyBolumuSuna);
        Driver.getDriver().switchTo().frame(0);
        ReusableMethods.click(alloverPage.biographyBolumuSuna);
        ReusableMethods.bekle(2);
        alloverPage.biographyBolumuSuna.sendKeys(ConfigReader.getProperty("biographyYazi"),Keys.ENTER);
        ReusableMethods.bekle(2);


        //alloverPage.biographyBolumuSuna.clear();
       // ReusableMethods.bekle(2);
       // Driver.getDriver().switchTo().parentFrame();
        //ReusableMethods.bekle(2);

    }
}
