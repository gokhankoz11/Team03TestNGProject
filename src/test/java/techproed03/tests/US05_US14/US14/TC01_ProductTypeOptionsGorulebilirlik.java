package techproed03.tests.US05_US14.US14;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.util.List;

public class TC01_ProductTypeOptionsGorulebilirlik {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlSuna"));
        AlloverPage alloverPage=new AlloverPage();
        ReusableMethods.rapor("chrome","Product Type Options Gorulebilirlik Testi");
        alloverPage.ilkGirisSignInSuna.click();
        ReusableMethods.bekle(1);
        String email=ConfigReader.getProperty("vendorEmail");
        String password=ConfigReader.getProperty("vendorPassword");
        alloverPage.UsernameOrEmailTextBoxSuna.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.extentTest.info("Vendor olarak giris yapildi");
        ReusableMethods.click(alloverPage.myAccountLinkSuna);
        ReusableMethods.extentTest.info("My Account Linkine tiklandi");
        alloverPage.storeManagerButtonSuna.click();
        ReusableMethods.extentTest.info("Store Manager butonuna tiklandi");
        alloverPage.productsSuna.click();
        ReusableMethods.click(alloverPage.productsAddNewSuna);
        ReusableMethods.extentTest.info("Products linkine tiklanip AddNew alanina gecildi");

        Select select=new Select(alloverPage.productTypeOptionsSuna);
        List<WebElement> productTypeOptionsList = select.getOptions();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Product Options listelendi");

        for (WebElement w:productTypeOptionsList){
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());

        }

        ReusableMethods.extentTest.info("Product Optionlarinin goruldugu dogrulandi");
        ReusableMethods.extentReport.flush();


    }



}
