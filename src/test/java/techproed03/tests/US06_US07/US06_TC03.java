package techproed03.tests.US06_US07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.security.Key;
import java.security.KeyStore;

public class US06_TC03 {

    @Test
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SingInButtonMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        ReusableMethods.bekle(3);
        alloverPage.PasswordM.sendKeys(("merve54Merve8"), Keys.ENTER);
        ReusableMethods.bekle(3);
        alloverPage.SearchButtonMerve.click();
        alloverPage.SearchButtonMerve.sendKeys("Electric Rice-Cooker",Keys.ENTER);
        ReusableMethods.bekle(3);
        alloverPage.AddToCardMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.AddToCardDogrulama.click();
        Assert.assertTrue(alloverPage.AddToCardDogrulama.isDisplayed());


    }
}
