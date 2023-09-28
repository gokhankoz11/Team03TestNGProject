package techproed03.tests.US_15_16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public abstract class LoginInGK {


    @BeforeClass
    public void loginIn() throws InterruptedException, FileNotFoundException {
        Driver.getDriver().get(ConfigReader.getProperty("allerCommerceUrlGK"));
        ReusableMethods.bekle(2);
        AlloverPage alloverPageGK = new AlloverPage();
        SoftAssert softAssertGk = new SoftAssert();
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

        Actions actionsGK = new Actions(Driver.getDriver());
        actionsGK.moveToElement(alloverPageGK.produktGK).perform();
        ReusableMethods.bekle(2);
        alloverPageGK.addNewGK.click();
        ReusableMethods.bekle(2);
        alloverPageGK.producktTitleGK.sendKeys("urun", Keys.TAB, "100", Keys.TAB, "90");

        ReusableMethods.bekle(2);


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


    }


    @Test
    public void testInventory(String sku, String strockQt) {
        AlloverPage alloverPage = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());


        //  actions.scrollToElement(alloverPage.draftGK).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();
        // ReusableMethods.scroll(alloverPage.skuGK);
        ReusableMethods.bekle(2);
        ReusableMethods.visibleWait(alloverPage.skuGK, 10);
        ReusableMethods.sendKeysJS(alloverPage.skuGK, sku);
        softAssert.assertTrue(alloverPage.skuGK.isSelected());
        ReusableMethods.click(alloverPage.manageStockGK);
        // ReusableMethods.scroll(alloverPage.advancedGK);
        softAssert.assertTrue(alloverPage.manageStockGK.isSelected());
        //   alloverPage.manageStockGK.click();

        softAssert.assertTrue(alloverPage.skuGK.isSelected());
        ReusableMethods.sendKeysJS(alloverPage.stockQtyGK, strockQt);

        softAssert.assertTrue(alloverPage.stockQtyGK.isSelected());
        Select select = new Select(alloverPage.backOrdesGK);

        select.selectByIndex(1);
        softAssert.assertTrue(alloverPage.backOrdesGK.isSelected());
        ReusableMethods.bekle(2);
        alloverPage.soldIndindividGK.click();

        ReusableMethods.click(alloverPage.submitButtonGK2);
        softAssert.assertTrue(alloverPage.successfullTextGK.isDisplayed());

    }

    @Test
    public void testShipping(String weight, String lenght, String widht, String height) {

        AlloverPage alloverPage = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.scroll(alloverPage.submitButtonGK2);
        ReusableMethods.click(alloverPage.shippingGK);
        ReusableMethods.bekle(2);
        softAssert.assertTrue(alloverPage.shippingGK.isDisplayed());
        alloverPage.weightGK.sendKeys(weight, Keys.TAB, lenght, Keys.TAB, widht, Keys.TAB,
                height, Keys.TAB, Keys.TAB);
        softAssert.assertTrue(alloverPage.weightGK.isEnabled());
        softAssert.assertTrue(alloverPage.lenghtGK.isEnabled());
        softAssert.assertTrue(alloverPage.widthGK.isEnabled());
        softAssert.assertTrue(alloverPage.heightGK.isEnabled());

        Select select = new Select(alloverPage.processingTimeGK);
        select.selectByIndex(1);
        ReusableMethods.click(alloverPage.submitButtonGK2);
        softAssert.assertTrue(alloverPage.successfullTextGK.isDisplayed());

    }


    @Test
    public void testAttributes(String name) {
        AlloverPage alloverPage = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());


      //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.scrollToElement(alloverPage.submitButtonGK);
        SoftAssert softAssert = new SoftAssert();
        // ReusableMethods.scroll(alloverPage.submitButtonGK2);

        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPage.attributesGK);
        ReusableMethods.bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].click();", alloverPage.colorGK);

        //  ReusableMethods.scroll(alloverPage.sizeGK);


       js.executeScript("arguments[0].click();", alloverPage.colorMenuGK);
        ReusableMethods.bekle(2);

        List<WebElement> renkler= Driver.getDriver().findElements(By.cssSelector("#select2-attributes_value_1-results"));
        Random random=new Random();
        int randomColor= random.nextInt(renkler.size());
        renkler.get(randomColor).click();

       // js.executeScript("arguments[0].click();", alloverPage.aaColorGK);

        ReusableMethods.scroll(alloverPage.addNewColorGK);

        ReusableMethods.bekle(2);



        alloverPage.sizeGK.click();
        ReusableMethods.bekle(2);

        ReusableMethods.bekle(2);
     //   alloverPage.addNameGK.sendKeys(name);
        ReusableMethods.click(alloverPage.submitButtonGK2);
        softAssert.assertTrue(alloverPage.successfullTextGK.isDisplayed());


    }
}




