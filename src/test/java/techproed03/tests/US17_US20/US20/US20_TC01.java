package techproed03.tests.US17_US20.US20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;


public class US20_TC01 {
    @Test
    public void test01() throws InterruptedException {

        AlloverPage alloverPage = new AlloverPage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_rk"));
        Thread.sleep(5000);
        alloverPage.signinButton_rk.click();
        alloverPage.emailBox_rk.sendKeys(ConfigReader.getProperty("alloverMail_rk"));
        alloverPage.passwordBox_rk.sendKeys(ConfigReader.getProperty("alloverPassword_rk"));
        alloverPage.girisButonu_rk.click();
        Thread.sleep(5000);
        alloverPage.anasayfaLogo_rk.click();
        Thread.sleep(5000);

        //my account e tikla
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", alloverPage.myAccountButton_rk);
        Thread.sleep(3000);
        alloverPage.myAccountButton_rk.click();
        // Store manager e tikla
        Thread.sleep(3000);
        alloverPage.storeManagerButton_rk.click();

        //asagi in ve coupons a tikla
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", alloverPage.couponButton_rk);
        Thread.sleep(3000);
        alloverPage.couponButton_rk.click();


        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", alloverPage.addNewCouponButton_rk);

        // ad new  coupona  tikla
        Thread.sleep(5000);
        alloverPage.addNewCouponButton_rk.click();
        Thread.sleep(3000);


        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", alloverPage.codeCouponBox_rk);

        alloverPage.codeCouponBox_rk.sendKeys(ConfigReader.getProperty("Coupon_rk"));
        Thread.sleep(3000);

        alloverPage.couponAmountBox_rk.sendKeys("5");

        alloverPage.couponExpiryDateBox_rk.sendKeys("2023-10-22");
        Thread.sleep(3000);

        JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", alloverPage.freeShippingBox_rk);

        WebElement freeShipBox = alloverPage.freeShippingBox_rk;
        Thread.sleep(3000);
        freeShipBox.click();





        }
    }
