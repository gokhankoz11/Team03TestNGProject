package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.security.Key;

import static org.testng.Assert.assertTrue;

public class US06_TC01 {


    @Test
    public void Test01() {
      //kullanici siteye gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));

        //kullanici adi ve sifresiyle giris yapar.
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
        Assert.assertTrue(alloverPage.VerifyM.isDisplayed());






    }


    }

