package techproed03.tests.US03_US04.US03;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC001 {
    @Test
    public void test01() {
        //Web sitesine gidiniz
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
        alloverPage.billingAddressAddButtonNT.click();
        ReusableMethods.bekle(2);
        //Zorunlu adres kutucuklarini eksiksiz doldurunuz
        MyMethod.billingAddressFormDoldurmaMethodu();
        ReusableMethods.bekle(2);
        //Save Adress butonuna tikla
        //''Address changed successfully'' mesajinin alindigini dogrula

    }
}
