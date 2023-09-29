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

public abstract class LoginIn16GK {


    AlloverPage alloverPageGK = new AlloverPage();
    SoftAssert softAssertGk = new SoftAssert();

    Actions actionsGK = new Actions(Driver.getDriver());

    public void loginIn16(String productTitle, String price, String salePrice) throws InterruptedException, FileNotFoundException {
        Driver.getDriver().get(ConfigReader.getProperty("allerCommerceUrlGK"));
        ReusableMethods.bekle(2);

        alloverPageGK.singInButtonGK.click();
        ReusableMethods.bekle(2);
        alloverPageGK.userNameGK.sendKeys(ConfigReader.getProperty("emailGK"), Keys.TAB, ConfigReader.getProperty("passwordGK"));
        ReusableMethods.bekle(2);
        alloverPageGK.loginButtonGK.click();
        ReusableMethods.bekle(2);
        alloverPageGK.signOutGK.click();
        //Driver.getDriver().get("https://allovercommerce.com/store-manager/products-manage/");

        ReusableMethods.bekle(2);
        alloverPageGK.storeManagerGK.click();
        ReusableMethods.bekle(2);


        actionsGK.moveToElement(alloverPageGK.produktGK).perform();
        ReusableMethods.bekle(2);
        alloverPageGK.addNewGK.click();
        ReusableMethods.bekle(2);
        softAssertGk.assertTrue(alloverPageGK.simpleProductGK.isDisplayed());

        alloverPageGK.producktTitleGK.sendKeys(productTitle);
        softAssertGk.assertTrue(alloverPageGK.priceGK.isEnabled());
        alloverPageGK.priceGK.sendKeys(price);
        softAssertGk.assertTrue(alloverPageGK.priceGK.isEnabled());
        alloverPageGK.salePriceGK.sendKeys(salePrice);
        softAssertGk.assertTrue(alloverPageGK.salePriceGK.isEnabled());

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


        alloverPageGK.galleryImg.click();
        ReusableMethods.bekle(2);
        alloverPageGK.galleryImgUpLoadFileButton.click();
        ReusableMethods.bekle(3);
        alloverPageGK.galleryImgSelectFilesButton.click();
        ReusableMethods.uploadFile(dosyaYolu2);
        ReusableMethods.bekle(2);


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", alloverPageGK.addToGalleryGK);

        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click(alloverPageGK.bestSellerCheckbox);

        actions.scrollToElement(alloverPageGK.submitButtonGK);
        alloverPageGK.submitButtonGK2.click();
        softAssertGk.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());

    }
}

