package techproed03.tests.US03_US04.US04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.tests.US03_US04.US03.MyMethod;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC002 {

    static SoftAssert softAssert = new SoftAssert();
    AlloverPage alloverPage=new AlloverPage();

    @BeforeClass
    public void beforeClass() {
        //Kullanici olarak giris yapiniz
        MyMethod.userLoginMethod();
        ReusableMethods.extentTest.info("Kullanici olarak giris yapildi");
        ReusableMethods.bekle(3);

        //My Account alanina tiklayiniz

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        alloverPage.myAccountNT.click();
        //Acilan sayfadan Adresses alanina tiklayiniz
        alloverPage.addressesButtonNT.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(alloverPage.shippingAddressAddButtonNT);
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Shipping Adress formuna gidildi");
        alloverPage.shippingAddressAddButtonNT.click();
        ReusableMethods.bekle(2);
        MyMethod.userShippingClearMethod();
        ReusableMethods.extentTest.info("Shipping Clear Methodu Calisti");

    }

    @Test(priority = 1)
    public void FirstNameEksikBirakTesti() {
        ReusableMethods.rapor("chorme","Shipping Adress Testi");

        //Firstname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.extentTest.info("First Name kutusu Bos birakildi diger tum zorunlu alanlar dolduruldu");
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.shippingFirstNameUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("First Name kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 2)
    public void LastNameEksikBirakTesti() {
        ReusableMethods.rapor("chorme","Shipping Adress Testi");

        //Lastname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingCompanyKutusuNT.sendKeys("Team03");
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.extentTest.info("Last Name kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.shippingLastNameUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Last Name kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 3)
    public void StreetaddressEksikBirakTesti() {
        ReusableMethods.rapor("chorme","Shipping Adress Testi");
        //Streetaddress kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.extentTest.info("Street Adress kutusu bos birakildi diger tum alanlar dorduruldu");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.shippingStreetaddressUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Street Adress kutusu bos oldugu icin uyari mesaji alindi");

        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 4)
    public void PostCodeKutusunuEksikBirakTesti() {
        ReusableMethods.rapor("chorme","Shipping Adress Testi");
        //Potcode kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.extentTest.info("Post Code kutusu bos birakildi diger tum alanlar dorduruldu");
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.shippingPostCodeUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Post Code kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }
    @Test(priority = 5)
    public void TownCityKutusunuEksikBirakTesti() {
        ReusableMethods.rapor("chorme","Shipping Adress Testi");
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        ReusableMethods.extentTest.info("town City kutusu bos birakildi diger tum alanlar dorduruldu");
        alloverPage.billingSaveAddressButtonNT.submit();
        ReusableMethods.extentTest.info("Save adress butonuna tiklandi");
        softAssert.assertTrue(alloverPage.shippingTownCityUyariMesajiNT.isDisplayed());
        ReusableMethods.extentTest.pass("Town City kutusu bos oldugu icin uyari mesaji alindi");
        Driver.getDriver().navigate().refresh();
        ReusableMethods.extentTest.info("Sayfa yenilendi");
    }

    @AfterClass
    public void afterClass() {
        softAssert.assertAll();
        Driver.quitDriver();
        ReusableMethods.extentTest.info("Sayfa Kapatildi");
        ReusableMethods.extentReport.flush();}
}
