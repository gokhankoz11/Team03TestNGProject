package techproed03.tests.US17_US20.US17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;


public class US17_TC03 {
    @Test
    public void test01() throws InterruptedException {

        AlloverPage alloverPage = new AlloverPage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_rk"));
        Thread.sleep(3000);
        alloverPage.signinButton_rk.click();
        alloverPage.emailBox_rk.sendKeys(ConfigReader.getProperty("alloverMail_rk"));
        alloverPage.passwordBox_rk.sendKeys(ConfigReader.getProperty("alloverPassword_rk"));
        alloverPage.girisButonu_rk.click();
        Thread.sleep(3000);
        alloverPage.anasayfaLogo_rk.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.cartButton_rk);
        Thread.sleep(3000);

        alloverPage.cartButton_rk.click();

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        Thread.sleep(3000);

        alloverPage.checkoutButton_rk.click();
        Thread.sleep(5000);


        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.wireTransfer_rk);
        Thread.sleep(3000);
        WebElement wireCheck= alloverPage.wireTransfer_rk;
        if (!wireCheck.isSelected()) {
            wireCheck.click();
        }

        Assert.assertTrue(wireCheck.isSelected());
        Thread.sleep(5000);

        //JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.placeOrderButton_rk);

        alloverPage.placeOrderButton_rk.click();
        Thread.sleep(5000);

        String thankyou = alloverPage.thankyou_rk.getText();
        String thankyou2 = "Thank you. Your order has been received.";
        Assert.assertEquals(thankyou, thankyou2);
        Thread.sleep(3000);


                JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",alloverPage.orderDetails_rk);
        Thread.sleep(3000);
    Assert.assertTrue(alloverPage.orderDetails_rk.getText().contains("ORDER DETAILS"));


        Driver.closeDriver();
        //!alloverPage.wireTransfer_rk  yerine wireCheck yazdik....




    }
}
