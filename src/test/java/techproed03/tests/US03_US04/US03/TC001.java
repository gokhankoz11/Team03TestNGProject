package techproed03.tests.US03_US04.US03;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC001 {
    @Test
    public void negativeTest() {

        //Kullanici olarak giris yapiniz
        ReusableMethods.rapor("chorme","Billing Adress Testi");
        MyMethod.userLoginMethod();
        ReusableMethods.bekle(3);
        ReusableMethods.extentTest.info("Kullanici olarak giris yapildi");


        //My Account alanina tiklayiniz
        AlloverPage alloverPage=new AlloverPage();
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
        ReusableMethods.extentTest.info("Billing Adress formuna gidildi");
        MyMethod.userBillingClearMethod();

        //Zorunlu adres kutucuklarini bos birakiniz
        alloverPage.billingSaveAddressButtonNT.click();
        ReusableMethods.extentTest.info("Biling Clear Methodu Calisti");


        ReusableMethods.extentTest.info("Doldurulmasi gereken Tum Zorunlu Alanlar Bos birakildi");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alloverPage.billingFirstNameUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingLastNameUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingStreetaddressUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingPostCodeUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingTownCityUyariMesajiNT.isDisplayed());
        softAssert.assertAll();
        ReusableMethods.extentTest.pass("Doldurulmasi gereken tum zorunlu alanlar bos birakildigi icin uyari mesaji alindigi dogrulandi");
        Driver.closeDriver();
        ReusableMethods.extentTest.info("Sayfa Kapatildi");
        ReusableMethods.extentReport.flush();

    }
}
