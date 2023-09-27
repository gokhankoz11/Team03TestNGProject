package techproed03.tests.US12_US13.US12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.pages.FakeMailPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US12_Test01 {
    @BeforeTest
    public void testKayit() throws InterruptedException {
        AlloverPage alloverPage = new AlloverPage();

        FakeMailPage fakeMailPage = new FakeMailPage();


        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_ofa"));
        String alloverUrl = Driver.getDriver().getWindowHandle();
        Thread.sleep(2000);
        alloverPage.registerButton_ofa.click();
        Thread.sleep(2000);
        alloverPage.becomeVendorButton_ofa.click();
        Thread.sleep(2000);


        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("FakeMailUrl_ofa"));
        String FakeMailUrl = Driver.getDriver().getWindowHandle();

        fakeMailPage.consentFakemail_ofa.click();
        fakeMailPage.copyMail_ofa.click();

        Driver.getDriver().switchTo().window(alloverUrl);
        alloverPage.regEmailBox_ofa.sendKeys(Keys.COMMAND + "v" + Keys.TAB);
        Thread.sleep(5000);

        Driver.getDriver().switchTo().window(FakeMailUrl);
        Thread.sleep(5000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(5000);

        fakeMailPage.mailBox_ofa.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame("iframeMail");
        String code = fakeMailPage.code_ofa.getText().replaceAll("[^0-9]", "");

        Driver.getDriver().switchTo().window(alloverUrl);
        Thread.sleep(2000);
        alloverPage.verCode_ofa.sendKeys(code);

        Driver.getDriver().switchTo().window(FakeMailUrl);
        fakeMailPage.fakeBack_ofa.click();
        Thread.sleep(2000);
        fakeMailPage.copyPass_ofa.click();

        Driver.getDriver().switchTo().window(alloverUrl);
        alloverPage.regPasswordBox_ofa.sendKeys(Keys.COMMAND + "v");
        alloverPage.regPasswordConf_ofa.sendKeys(Keys.COMMAND + "v");
        alloverPage.regButton_ofa.click();

        Thread.sleep(2000);
        alloverPage.notrightnowButton_ofa.click();
        alloverPage.logo_ofa.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        alloverPage.myAccount_ofa.click();
        alloverPage.addressesButton_ofa.click();
        alloverPage.addButton_ofa.click();
    }
    @Test
    public void test01() {
        AlloverPage alloverPage = new AlloverPage();

        //Billing address bilgileri doldurulur
        alloverPage.firstnameButton_ofa.sendKeys(ConfigReader.getProperty("firstName_ofa") +
                Keys.TAB + ConfigReader.getProperty("lastName_ofa"));
        alloverPage.countryMenu_ofa.click();
        alloverPage.cmBox_ofa.sendKeys(ConfigReader.getProperty("country_ofa") + Keys.ENTER);
        alloverPage.billingstreetBox_ofa.sendKeys(ConfigReader.getProperty("street_ofa"));
        alloverPage.billingcityBox_ofa.sendKeys(ConfigReader.getProperty("city_ofa"));
        alloverPage.billingpostcodeBox_ofa.sendKeys(ConfigReader.getProperty("postcode_ofa") + Keys.TAB +
                ConfigReader.getProperty("phone_ofa") + Keys.TAB + Keys.TAB + Keys.ENTER);
        String eyba = alloverPage.edityba_ofa.getText();
        String eyba2 = "EDIT YOUR BILLING ADDRESS";


        Assert.assertEquals(eyba,eyba2);

    }
}

