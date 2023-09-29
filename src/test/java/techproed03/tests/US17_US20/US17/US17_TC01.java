package techproed03.tests.US17_US20.US17;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;


public class US17_TC01 {
    @Test
    public void test01() throws InterruptedException {

        AlloverPage alloverPage = new AlloverPage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_rk"));
        Thread.sleep(10000);
        alloverPage.signinButton_rk.click();
        alloverPage.emailBox_rk.sendKeys(ConfigReader.getProperty("alloverMail_rk"));
        alloverPage.passwordBox_rk.sendKeys(ConfigReader.getProperty("alloverPassword_rk"));
        alloverPage.girisButonu_rk.click();
        Thread.sleep(10000);
        alloverPage.anasayfaLogo_rk.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.cartButton_rk);

        alloverPage.cartButton_rk.click();

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        alloverPage.checkoutButton_rk.click();

        // Siparis verilip verilmedigi dogrulanir

        Assert.assertTrue(alloverPage.orderReviewHeading_rk.isDisplayed());









    }
}
