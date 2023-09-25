package techproed03.tests.US03_US04.US03;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ReusableMethods;

public class TC001 {
    @Test
    public void negativeTest() {
        //Kullanici olarak giris yapiniz
        MyMethod.userLoginMethod();
        ReusableMethods.bekle(3);

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
        MyMethod.userBillingClearMethod();
        //Zorunlu adres kutucuklarini bos birakiniz
        alloverPage.billingSaveAddressButtonNT.click();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alloverPage.billingFirstNameUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingLastNameUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingStreetaddressUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingPostCodeUyariMesajiNT.isDisplayed());
        softAssert.assertTrue(alloverPage.billingTownCityUyariMesajiNT.isDisplayed());
        softAssert.assertAll();

    }
}
