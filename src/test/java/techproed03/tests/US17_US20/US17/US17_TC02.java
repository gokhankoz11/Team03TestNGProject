package techproed03.tests.US17_US20.US17;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;


public class US17_TC02 {
    @Test
    public void test01() throws InterruptedException {

        AlloverPage alloverPage = new AlloverPage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_rk"));
        Thread.sleep(10000);

        alloverPage.signinButton_rk.click();

        alloverPage.emailBox_rk.sendKeys(ConfigReader.getProperty("alloverMail_rk"));

        alloverPage.passwordBox_rk.sendKeys(ConfigReader.getProperty("alloverPassword_rk"));

        alloverPage.girisButonu_rk.click();
        Thread.sleep(3000);
       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.cartButton_rk);

        alloverPage.cartButton_rk.click();
        Thread.sleep(3000);

        alloverPage.checkoutButton_rk.click();


        Assert.assertTrue(alloverPage.orderTotal_rk.isDisplayed());















    }
}
