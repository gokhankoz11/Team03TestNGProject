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
        ReusableMethods.rapor("chrome","Billing Adress Test");
        //Firstname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.extentTest.info("First Name kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");

        softAssert.assertTrue(alloverPage.billingFirstNameUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("First Name kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 2)
    public void LastNameEksikBirakTesti() {
        ReusableMethods.rapor("chrome","Billing Adress Test");

        //Lastname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingCompanyKutusuNT.sendKeys("Team03");
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        ReusableMethods.extentTest.info("Last Name kutusu bos birakildi diger tum alanlar dorduruldu");
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.billingLastNameUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Last Name kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 3)
    public void StreetaddressEksikBirakTesti() {
        ReusableMethods.rapor("chrome","Billing Adress Test");
        //Streetaddress kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.extentTest.info("Street Adress kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.billingStreetaddressUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Street Adress kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 4)
    public void PostCodeKutusunuEksikBirakTesti() {
        ReusableMethods.rapor("chrome","Billing Adress Test");
        //Potcode kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.extentTest.info("Post Code kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.billingPostCodeUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Post Code kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 5)
    public void TownCityKutusunuEksikBirakTesti() {
        ReusableMethods.rapor("chrome","Billing Adress Test");
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.extentTest.info("Town City kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.billingTownCityUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Town City kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 6)
    public void PhoneKutusunuEksikBirakTesti() {
        ReusableMethods.rapor("chrome","Billing Adress Test");
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.billingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.billingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.extentTest.info("Phone kutusu bos birakildi diger tum alanlar dorduruldu");

        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.billingPhoneUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Phone kutusu bos oldugu icin uyari mesaji alindi");
    }
    @AfterClass
    public void afterClass() {
        softAssert.assertAll();
        Driver.quitDriver();
        ReusableMethods.extentTest.info("Sayfa kapatildi");
        ReusableMethods.extentReport.flush();


    }




}
