package techproed03.tests.US18_19.US_18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC_01_VendorCouponTesti {
    @Test
    public void test01() {


        //Siteye git
        Driver.getDriver().get(ConfigReader.getProperty("AlloverUrl"));

        //SingIn butonunu  tikla
        AlloverPage alloverPage=new AlloverPage();
        alloverPage.singInIlyas.click();

        //Vendor olarak sayfaya login olmak icin gecerli email ve password gir,Enter a tikla
        //email:https://allovercommerce.com/   password:zaylin.raedyn@feerock.com
        String email=ConfigReader.getProperty("EmailIlyas");
        String password=ConfigReader.getProperty("passwordIlyas");
        alloverPage.emailIlyas.sendKeys(email,Keys.TAB,password,Keys.ENTER);

        //SingOut butonuna tikla
        alloverPage.singOutIlyas.click();
        //My Account sayfasinin goruldugunu dogrula
       Assert.assertTrue(Driver.getDriver().getTitle().contains("My Account"));
        //Assert.assertEquals("My Account",Driver.getDriver().getTitle());

        //Store Manager secenegini tikla
        alloverPage.storeManagerIlyas.click();
        ReusableMethods.bekle(5);




        //Acilan sayfada Coupons secenegini tikla
        Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN).perform();
        alloverPage.couponsButtonIlyas.click();

        //Add New  butonuna tikla
        alloverPage.addNewButtonIlyas.click();

        //Code bolumune bir kod gir,  code:1071
        //Description bolumune bir aciklama ekle
        //Discount Type sec
        //Coupon Amount bolume bir sayi gir
        //Coupon expiry date(son kullanma tarihi) gir
        String code =ConfigReader.getProperty("codeIlyas");
        alloverPage.codeAlaniIlyas.sendKeys(code,Keys.TAB,"indirimKuponu",Keys.TAB,Keys.TAB,"30",
                Keys.TAB,"2023-09-30",Keys.TAB,Keys.TAB);
        ReusableMethods.bekle(3);

        //Allow free schipping sec
       alloverPage.freeShippingIlyas.click();

        //Show on store sec
        alloverPage.showOnStoreIlyas.click();

        //sayfanin sonunda ki SUBMIT butonuna tikla
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click(alloverPage.submitIlyas);
        ReusableMethods.bekle(2);
        ReusableMethods.click(alloverPage.submitIlyas);


        //Coupon olusturuldugunu dogrula
        Assert.assertEquals("Percentage discount",alloverPage.percentageDiscount.getText());


    }
}
