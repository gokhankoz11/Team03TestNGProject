package techproed03.tests.US03_US04.US03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC002 {
    static SoftAssert softAssert = new SoftAssert();
    AlloverPage alloverPage=new AlloverPage();

    @BeforeClass
    public void beforeClass() {
        //Kullanici olarak giris yapiniz
        MyMethod.userLoginMethod();
        ReusableMethods.bekle(3);

        //My Account alanina tiklayiniz

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        alloverPage.myAccountNT.click();
        //Acilan sayfadan Adresses alanina tiklayiniz
        alloverPage.addressesButtonNT.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(alloverPage.billingEditYourAddressNT);
        ReusableMethods.bekle(2);
        alloverPage.billingEditYourAddressNT.click();
        ReusableMethods.bekle(2);
        MyMethod.userBillingClearMethod();

    }

    @Test(priority = 1)
    public void FirstNameEksikBirakTesti() {

        //Firstname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingFirstNameUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 2)
    public void LastNameEksikBirakTesti() {

        //Lastname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingCompanyKutusuNT.sendKeys("Team03");
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingLastNameUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 3)
    public void StreetaddressEksikBirakTesti() {
        //Streetaddress kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingStreetaddressUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 4)
    public void PostCodeKutusunuEksikBirakTesti() {
        //Potcode kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingPostCodeUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 5)
    public void TownCityKutusunuEksikBirakTesti() {
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingTownCityUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 6)
    public void PhoneKutusunuEksikBirakTesti() {
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);

        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.billingPhoneUyariMesajiNT.isDisplayed());
    }
    @AfterClass
    public void afterClass() {
        softAssert.assertAll();
        Driver.quitDriver();}




}
