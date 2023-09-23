package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US06_TC01 {
    @Test
    public void Test01() {
      //kullanici siteye gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //kullanici adi ve sifresiyle giris yapar.
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SingInButtonMerve.click();
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        alloverPage.PasswordM.sendKeys("merve54Merve8");
        //kullanici search kutusuna aradigi seyi yazar.
        alloverPage.SearchButtonMerve.sendKeys("Electric Rice-Cooker",Keys.ENTER);
        alloverPage.VerifyM.submit();
        Assert.assertTrue(alloverPage.VerifyM.isDisplayed());






    }
}
