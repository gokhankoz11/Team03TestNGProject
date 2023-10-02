package techproed03.tests.US_15_16.US15;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.Page;
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

public abstract class LoginIn15GK {
    Actions actionsGK = new Actions(Driver.getDriver());


    public void loginIn15() throws InterruptedException, FileNotFoundException {
        ReusableMethods.rapor("Chrome","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("allerCommerceUrlGK"));
        ReusableMethods.extentReport.setSystemInfo("Gökhan","Team03Members");
        ReusableMethods. extentReport.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setDocumentTitle("ExtentReport");

        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici Allover Commerce sayfasina  gider ");
        AlloverPage alloverPageGK = new AlloverPage();
        SoftAssert softAssertGk = new SoftAssert();
        alloverPageGK.singInButtonGK.click();
        ReusableMethods.extentTest.info("Kullanici sig in butonunu tiklar ");
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
        ReusableMethods.extentTest.info("Kullanici add new i tiklar ");
        ReusableMethods.bekle(2);
        alloverPageGK.producktTitleGK.sendKeys("urun", Keys.TAB, "100", Keys.TAB, "90");
        ReusableMethods.extentTest.info("Kullanici zorunlu alanlara veri girer ");

        ReusableMethods.bekle(2);


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

    }


    @Test
    public void testInventory(String sku, String strockQt) {
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();

        ReusableMethods.bekle(2);
        ReusableMethods.visibleWait(alloverPageGK.skuGK, 10);
        ReusableMethods.sendKeysJS(alloverPageGK.skuGK, sku);
        softAssert.assertTrue(alloverPageGK.skuGK.isSelected());
        ReusableMethods.extentTest.info("Kullanici Sku ya veri  girer ");
        ReusableMethods.click(alloverPageGK.manageStockGK);

        softAssert.assertTrue(alloverPageGK.manageStockGK.isSelected());


        softAssert.assertTrue(alloverPageGK.skuGK.isSelected());
        ReusableMethods.sendKeysJS(alloverPageGK.stockQtyGK, strockQt);
        ReusableMethods.extentTest.info("Kullanici Stock Qty girer ");
        softAssert.assertTrue(alloverPageGK.stockQtyGK.isSelected());
        Select select = new Select(alloverPageGK.backOrdesGK);

        select.selectByIndex(1);
        softAssert.assertTrue(alloverPageGK.backOrdesGK.isSelected());
        ReusableMethods.bekle(2);
        alloverPageGK.soldIndindividGK.click();
        ReusableMethods.extentTest.info("Kullanici Sold Individually tiklar ");
        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici urunu yukler ");
        ReusableMethods.extentReport.flush();
    }

    @Test
    public void testShipping(String weight, String lenght, String widht, String height) {

        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.scroll(alloverPageGK.submitButtonGK2);
        ReusableMethods.click(alloverPageGK.shippingGK);
        ReusableMethods.extentTest.info("Kullanici Shipping i tiklar");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(alloverPageGK.shippingGK.isDisplayed());
        alloverPageGK.weightGK.sendKeys(weight, Keys.TAB, lenght, Keys.TAB, widht, Keys.TAB,
                height, Keys.TAB, Keys.TAB);
        ReusableMethods.extentTest.info("Kullanici Weight, Lenght, Width, Height verilerini girer");
        softAssert.assertTrue(alloverPageGK.weightGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.lenghtGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.widthGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.heightGK.isEnabled());

        Select select = new Select(alloverPageGK.processingTimeGK);
        select.selectByIndex(1);
        ReusableMethods.extentTest.info("Kullanici Processing Time i secer");
        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici urunu yukler ");
        ReusableMethods.extentReport.flush();
    }


    @Test
    public void testAttributes(String name) {
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.scrollToElement(alloverPageGK.submitButtonGK);
        SoftAssert softAssert = new SoftAssert();


        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPageGK.attributesGK);
        ReusableMethods.bekle(3);
        ReusableMethods.extentTest.info("Kullanici Attributes i tiklar ");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].click();", alloverPageGK.colorGK);
        ReusableMethods.extentTest.info("Kullanici Color i tiklar ");


        js.executeScript("arguments[0].click();", alloverPageGK.colorMenuGK);

        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.selectAllGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.okButtonGK);
        ReusableMethods.extentTest.info("Kullanici Color menu den optionlar  secilir ");


        ReusableMethods.scroll(alloverPageGK.submitButtonGK);

        ReusableMethods.bekle(2);


        js.executeScript("arguments[0].click();", alloverPageGK.sizeGK);
        js.executeScript("arguments[0].click();", alloverPageGK.sizeMenuGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.selectAllGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.okSizeButtonGK);
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Kullanici Size menusunden optionlar secilir ");
        //   alloverPage.addNameGK.sendKeys(name);
        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici urunu yukler ");
        ReusableMethods.extentReport.flush();
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




