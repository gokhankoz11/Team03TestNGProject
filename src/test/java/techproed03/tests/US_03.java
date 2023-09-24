package techproed03.tests;

import org.testng.annotations.Test;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US_03 {
    @Test
    public void test01() {
        //Web sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrlN"));
        //Kullanici olarak giris yapiniz

        //My Account alanina tiklayiniz
        //Acilan sayfadan Adresses alaninga tiklayiniz
        //Adresses'de önce e-mail'in geldigini dogrulayiniz
        //Zorunlu adres kutucuklarini eksiksiz doldurunuz
        //Save Adress butonuna tikla
        //''Address changed successfully'' mesajinin alindigini dogrula
        //Bu mesajin altinda Address tam haliyle görüntülenir
        //EDIT YOUR BILLING ADDRESS>> tiklanir
        //Ikinci girisimizde MyAccount sayfasinda Firstname,Lastname ve E-mail kutucuklarinin otomatik dolduruldugu dogrulanir
    }
}
