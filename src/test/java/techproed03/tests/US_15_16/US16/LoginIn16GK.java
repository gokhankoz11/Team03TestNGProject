package techproed03.tests.US_15_16.US16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import static techproed03.utilities.ReusableMethods.extentHtmlReporter;

public abstract class LoginIn16GK {


    AlloverPage alloverPageGK = new AlloverPage();
    SoftAssert softAssertGk = new SoftAssert();

    Actions actionsGK = new Actions(Driver.getDriver());

    public void loginIn16(String productTitle, String price, String salePrice) throws InterruptedException, FileNotFoundException {
        ReusableMethods.rapor("Chrome","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("allerCommerceUrlGK"));
        ReusableMethods.extentReport.setSystemInfo("Gökhan","Team03Members");
        ReusableMethods. extentReport.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setDocumentTitle("ExtentReport");
        ReusableMethods.bekle(2);

        alloverPageGK.singInButtonGK.click();
        ReusableMethods.extentTest.info("Kullanici Allover Commerce sayfasina  gider ");
        ReusableMethods.bekle(2);
        alloverPageGK.userNameGK.sendKeys(ConfigReader.getProperty("emailGK"), Keys.TAB, ConfigReader.getProperty("passwordGK"));
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici kayitli emaili ve passwordü girer  ");
        alloverPageGK.loginButtonGK.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici login i tiklar ");
        alloverPageGK.signOutGK.click();
        ReusableMethods.extentTest.info("Kullanici sign out u tiklar ");

        ReusableMethods.bekle(2);
        alloverPageGK.storeManagerGK.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici Story Manager i tiklar ");


        actionsGK.moveToElement(alloverPageGK.produktGK).perform();
        ReusableMethods.bekle(2);
        alloverPageGK.addNewGK.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici add new i tiklar ");
       alloverPageGK.virtualGK.click();
        ReusableMethods.extentTest.info("Kullanici virtual i tiklar ");

        softAssertGk.assertTrue(alloverPageGK.simpleProductGK.isDisplayed());

        alloverPageGK.producktTitleGK.sendKeys(productTitle);
        softAssertGk.assertTrue(alloverPageGK.priceGK.isEnabled());
        ReusableMethods.extentTest.info("Kullanici Product Title tiklar ");
        alloverPageGK.priceGK.sendKeys(price);
        softAssertGk.assertTrue(alloverPageGK.priceGK.isEnabled());
        ReusableMethods.extentTest.info("Kullanici Price ($) a veri girer ");
        alloverPageGK.salePriceGK.sendKeys(salePrice);
        softAssertGk.assertTrue(alloverPageGK.salePriceGK.isEnabled());
        ReusableMethods.extentTest.info("Kullanici Sale Price ($) a veri girer ");
        ReusableMethods.bekle(2);


    }

    @Test
    public void fotoEklemeSubmitGK() {


        String dosyaYolu1 = "C:\\Users\\Admin\\Desktop\\us_16_tc_03_Bug.jpg";

        String dosyaYolu2 = "C:\\Users\\Admin\\Desktop\\hatta.jpg";

        alloverPageGK.featuredImg.click();
        alloverPageGK.featuredImgSelectFilesButton.click();
        ReusableMethods.uploadFile(dosyaYolu1);
        ReusableMethods.bekle(2);
        alloverPageGK.featuredImgSelectButton.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici siteye resim yukler ");

        alloverPageGK.galleryImg.click();
        ReusableMethods.bekle(2);
        alloverPageGK.galleryImgUpLoadFileButton.click();
        ReusableMethods.bekle(3);
        alloverPageGK.galleryImgSelectFilesButton.click();
        ReusableMethods.uploadFile(dosyaYolu2);
        ReusableMethods.bekle(2);


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", alloverPageGK.addToGalleryGK);
        ReusableMethods.extentTest.info("Kullanici siteye resim yukler ");
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click(alloverPageGK.bestSellerCheckbox);
        ReusableMethods.extentTest.info("Kullanici Categories secer ");
        actions.scrollToElement(alloverPageGK.submitButtonGK);
        js.executeScript("arguments[0].click();", alloverPageGK.submitButtonGK);

        // alloverPageGK.submitButtonGK2.click();
        softAssertGk.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici urunu yukler ");
    }

    @Test
    public void productteUrunGorme(String nameProduct) {
        ReusableMethods.bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP);

        js.executeScript("arguments[0].click();", alloverPageGK.viewsButtonGK2);
        ReusableMethods.extentTest.info("Kullanici yuklenen urunu gormek icin wiev butonuna tiklar ");
        ReusableMethods.bekle(2);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(alloverPageGK.producktTitleGK.equals(nameProduct));
        Driver.closeDriver();
        ReusableMethods.extentTest.info("Kullanici yuklenen urunu sayfada gorur ");
        ReusableMethods.extentReport.flush();

    }
}

