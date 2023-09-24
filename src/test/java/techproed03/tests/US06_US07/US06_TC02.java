package techproed03.tests.US06_US07;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class US06_TC02 {
    @Test
    public void Test2() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SingInButtonMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        ReusableMethods.bekle(3);
        alloverPage.PasswordM.sendKeys("merve54Merve8");
        ReusableMethods.bekle(3);
        alloverPage.SignInButtonMerve2.click();
        ReusableMethods.bekle(3);
        //kullanici search kutusuna aradigi seyi yazar.
        ReusableMethods.bekle(3);
        alloverPage.SearchButtonMerve.sendKeys("Electric Rice-Cooker", Keys.ENTER);
        ReusableMethods.bekle(3);
        alloverPage.AddToCardMerve.click();




    }
}
