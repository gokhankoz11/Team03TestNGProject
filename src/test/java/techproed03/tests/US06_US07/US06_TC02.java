package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class US06_TC02 {
    @Test
    public void Test2() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        ReusableMethods.bekle(2);
        alloverPage.PasswordM.sendKeys(ConfigReader.getProperty("passwordMM"), Keys.ENTER);
        ReusableMethods.bekle(2);
        alloverPage.SearchButtonMerve.sendKeys(("Electric Rice-Cooker"), Keys.ENTER);
        alloverPage.AddToCardMerve.click();

        }


}