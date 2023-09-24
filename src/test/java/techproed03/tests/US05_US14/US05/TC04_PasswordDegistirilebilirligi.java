package techproed03.tests.US05_US14.US05;

import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC04_PasswordDegistirilebilirligi {



    @Test
    public void testName() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        AlloverPage alloverPage=new AlloverPage();

        alloverPage.ilkGirisSignInSuna.click();
        ReusableMethods.bekle(2);

        String email=ConfigReader.getProperty("kullaniciUsernameSuna"); //--> configuration.properties'ten
        String password=ConfigReader.getProperty("kullaniciPasswordSuna"); //-->configuration.properties'ten

        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        alloverPage.accountDetailsLinkSuna.click();
    }
}
