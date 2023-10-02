package techproed03.tests.US03_US04.US03;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC003 {
    @Test
    public void positiveTest() {

        //Kullanici olarak giris yapiniz
        ReusableMethods.rapor("chrome","Billing Adress Test");
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
        ReusableMethods.extentTest.info("Billing Adress formuna gidildi");
        ReusableMethods.bekle(2);
        alloverPage.billingEditYourAddressNT.click();
        //Clear methodu ile dolu alanlari temizleyin
        ReusableMethods.bekle(2);
        MyMethod.userBillingClearMethod();
        ReusableMethods.extentTest.info("Biling Clear Methodu Calisti");

        //Zorunlu adres kutucuklarini eksiksiz doldurunuz
       MyMethod.userBillingAddressFormDoldurmaMethod();
        ReusableMethods.extentTest.info("Doldurulmasi gereken Tum Zorunlu Alanlar dolduruldu");
        ReusableMethods.bekle(2);
        //''Address changed successfully'' mesajinin alindigini dogrula
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alloverPage.addressSuccessfullyNT.isDisplayed());
        ReusableMethods.extentTest.pass("Address changed successfully mesaji alindigi dogrulandi");
        Driver.closeDriver();
        ReusableMethods.extentTest.info("Sayfa Kapatildi");
        ReusableMethods.extentReport.flush();





    }
}
