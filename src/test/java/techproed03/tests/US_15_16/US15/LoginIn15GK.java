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

public abstract class LoginIn15GK {
    Actions actionsGK = new Actions(Driver.getDriver());


    public void loginIn15() throws InterruptedException, FileNotFoundException {
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
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());


        //  actions.scrollToElement(alloverPage.draftGK).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();
        // ReusableMethods.scroll(alloverPage.skuGK);
        ReusableMethods.bekle(2);
        ReusableMethods.visibleWait(alloverPageGK.skuGK, 10);
        ReusableMethods.sendKeysJS(alloverPageGK.skuGK, sku);
        softAssert.assertTrue(alloverPageGK.skuGK.isSelected());
        ReusableMethods.click(alloverPageGK.manageStockGK);
        // ReusableMethods.scroll(alloverPage.advancedGK);
        softAssert.assertTrue(alloverPageGK.manageStockGK.isSelected());
        //   alloverPage.manageStockGK.click();

        softAssert.assertTrue(alloverPageGK.skuGK.isSelected());
        ReusableMethods.sendKeysJS(alloverPageGK.stockQtyGK, strockQt);

        softAssert.assertTrue(alloverPageGK.stockQtyGK.isSelected());
        Select select = new Select(alloverPageGK.backOrdesGK);

        select.selectByIndex(1);
        softAssert.assertTrue(alloverPageGK.backOrdesGK.isSelected());
        ReusableMethods.bekle(2);
        alloverPageGK.soldIndindividGK.click();

        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());

    }

    @Test
    public void testShipping(String weight, String lenght, String widht, String height) {

        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.scroll(alloverPageGK.submitButtonGK2);
        ReusableMethods.click(alloverPageGK.shippingGK);
        ReusableMethods.bekle(2);
        softAssert.assertTrue(alloverPageGK.shippingGK.isDisplayed());
        alloverPageGK.weightGK.sendKeys(weight, Keys.TAB, lenght, Keys.TAB, widht, Keys.TAB,
                height, Keys.TAB, Keys.TAB);
        softAssert.assertTrue(alloverPageGK.weightGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.lenghtGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.widthGK.isEnabled());
        softAssert.assertTrue(alloverPageGK.heightGK.isEnabled());

        Select select = new Select(alloverPageGK.processingTimeGK);
        select.selectByIndex(1);
        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());

    }


    @Test
    public void testAttributes(String name) {
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());


        //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.scrollToElement(alloverPageGK.submitButtonGK);
        SoftAssert softAssert = new SoftAssert();
        // ReusableMethods.scroll(alloverPage.submitButtonGK2);

        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPageGK.attributesGK);
        ReusableMethods.bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].click();", alloverPageGK.colorGK);

        //  ReusableMethods.scroll(alloverPage.sizeGK);


        js.executeScript("arguments[0].click();", alloverPageGK.colorMenuGK);

        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.selectAllGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.okButtonGK);

        //   alloverPage.addNewColorGK.click();

        // Driver.getDriver().switchTo().alert().sendKeys("siyah" + Keys.ENTER);

        //  Select select=new Select(alloverPage.colorMenuGK2);

        //  ReusableMethods.bekle(2);

        //  select.getFirstSelectedOption();
        //  actions.doubleClick();


        //   List<WebElement> renkler= Driver.getDriver().findElements(By.cssSelector("#select2-attributes_value_1-results"));
        //   Random random=new Random();
        //  int randomColor= random.nextInt(renkler.size());
        //  renkler.get(randomColor).click();

        // js.executeScript("arguments[0].click();", alloverPage.aaColorGK);

        ReusableMethods.scroll(alloverPageGK.submitButtonGK);

        ReusableMethods.bekle(2);


        js.executeScript("arguments[0].click();", alloverPageGK.sizeGK);
        js.executeScript("arguments[0].click();", alloverPageGK.sizeMenuGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.selectAllGK);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", alloverPageGK.okSizeButtonGK);
        ReusableMethods.bekle(2);
        //   alloverPage.addNameGK.sendKeys(name);
        ReusableMethods.click(alloverPageGK.submitButtonGK2);
        softAssert.assertTrue(alloverPageGK.successfullTextGK.isDisplayed());


    }

    @Test
    public void productteUrunGorme(String nameProduct) {
        ReusableMethods.bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        AlloverPage alloverPageGK = new AlloverPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP);
      //  alloverPageGK.viewsButtonGK.click();
          js.executeScript("arguments[0].click();", alloverPageGK.viewsButtonGK2);
      //  Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        ReusableMethods.bekle(2);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(alloverPageGK.producktTitleGK.equals(nameProduct));
        Driver.closeDriver();


    }
}




