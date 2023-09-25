package techproed03.tests.US03_US04.US04;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.tests.US03_US04.US03.MyMethod;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC003 {
    @Test
    public void positiveTest() {

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
        ReusableMethods.scroll(alloverPage.shippingAddressAddButtonNT);
        ReusableMethods.bekle(2);
        alloverPage.shippingAddressAddButtonNT.click();
        //Clear methodu ile dolu alanlari temizleyin
        ReusableMethods.bekle(2);
        MyMethod.userShippingClearMethod();

        //Zorunlu adres kutucuklarini eksiksiz doldurunuz
        MyMethod.userShippingAddressFormDoldurmaMethod();
        ReusableMethods.bekle(2);
        //''Address changed successfully'' mesajinin alindigini dogrula
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(alloverPage.addressSuccessfullyNT.isDisplayed());
        Driver.closeDriver();





    }
}
