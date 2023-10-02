package techproed03.tests.US10_US11.US11;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US10_US11.US10.ExtentReport;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class US11_TC02_DashboardMenu extends ExtentReport {

//    AlloverPage page = new AlloverPage();
//    @Test
//    public void test1_VendorSignIn() {
//        extentTest = extentReports.createTest("DashboardMenu US11_TC02","Dashboard Menüsüne Giriş ve Altındaki Menülere Erişim");
//
//        // 1 Vendor anasayfaya gider.
//        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlHkn"));
//        ReusableMethods.bekle(2);
//        extentTest.info("Anasayfaya gidildi");
//
//        // 2 Sign In butonuna tıklar
//        ReusableMethods.click(page.signInHkn);
//        extentTest.info("Sign in butonuna tıklandı");
//        ReusableMethods.bekle(1);
//
//        //3 Sign in pop-up penceresinde bulunan "SIGN-IN" butonunun görünür ve ulaşılabilir olduğunu doğrula
//        page.signInPopUpHkn.isEnabled();//Ulasilabilir
//        extentTest.info("Sign In PopUp penceresinin erişilebildiği doğrulandı");
//        ReusableMethods.bekle(1);
//
//        //4 "Username or email address" alanına Kayıtlı bir mail adresi girer.
//        page.usernameKutusuHkn.sendKeys(ConfigReader.getProperty("userNameHkn"));
//        extentTest.info("Kayıtlı bir email adresi girildi");
//        ReusableMethods.bekle(1);
//
//        //5 "Password" alanına Kayıtlı bir şifre girer.
//        page.passwordHkn.sendKeys(ConfigReader.getProperty("passwordHkn"));
//        extentTest.info("Kayıtlı bir password girildi");
//        ReusableMethods.bekle(1);
//
//        //6 "Popup sign in butonuna tıklar.
//        page.signInButtonHkn.click();
//        ReusableMethods.bekle(1);
//        extentTest.info("PopUp penceresi Sign In butonuna tıklandı");
//        ReusableMethods.bekle(1);
//
//        //7 Sign in yapıldığını doğrula
//        Assert.assertTrue(page.signOutButonuHkn.isDisplayed());
//        page.signOutButonuHkn.click();
//        extentTest.info("Sign in yapıldığını doğrulandı");
//        ReusableMethods.webElementResmi2(page.signOutButonuHkn,"US11_TC02_DashboardMenu");
//        extentTest.info("Webelement resmi alındı.(Sign Out)");
//        ReusableMethods.bekle(1);
//
//        //8 My Account yazısının göründüğünü doğrula
//         Assert.assertTrue(page.myAccountYazisiHkn.isDisplayed());
//        extentTest.info("Vendor olarak kendi hesabına gidilidiği doğrulandı.");
//        ReusableMethods.webElementResmi2(page.myAccountYazisiHkn,"US11_TC02_DashboardMenu");
//        extentTest.info("Webelement resmi alındı.(My Account)");
//        ReusableMethods.bekle(1);
//
//      //9 My Account sayfasında "Dashboard" yazısının olduğunu doğrula.
//        Assert.assertTrue(page.dashboardTextHkn.isDisplayed());
//        extentTest.info("Dashboard yazısının olduğu doğrulandı");
//        ReusableMethods.webElementResmi2(page.dashboardTextHkn,"US11_TC02_DashboardMenu");
//        extentTest.info("Webelement resmi alındı.(Dashboard)");
//        ReusableMethods.bekle(1);
//
//        //10 Dashboard altında, "Store manager" yazısının olduğunu doğrula.
//        Assert.assertTrue(page.storeManagerTextHkn.isDisplayed());
//        extentTest.info("Store Manager yazısının olduğu doğrulandı");
//        ReusableMethods.webElementResmi2(page.storeManagerTextHkn,"US11_TC02_DashboardMenu");
//        extentTest.info("Webelement resmi alındı.(Store manager)");
//        page.storeManagerTextHkn.click();
//
//        Assert.assertTrue(page.storeManagerBaslikHkn.isDisplayed());
//        Driver.getDriver().navigate().back();
//        extentTest.info("Store Manager menüsüne girildiği görüldü");
//        ReusableMethods.bekle(1);
//
//        //11 Dashboard altında, Orders yazısının olduğunu doğrula.
//       Assert.assertTrue(page.orderTextHkn.isDisplayed());
//        extentTest.info("Orders yazısının olduğu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Orders)");
//        page.orderTextHkn.click();
//        Assert.assertTrue(page.orderBaslikHkn.isDisplayed());
//        extentTest.info("Orders menüsüne girildiği görüldü");
//        ReusableMethods.webElementResmi2(page.orderBaslikHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.bekle(1);
//
//       //12 Dashboard altında, Downloads yazısının olduğunu doğrula.
//        Assert.assertTrue(page.downloadsTextHkn.isDisplayed());
//        page.downloadsTextHkn.click();
//        extentTest.info("Dashboard altında, Downloads yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Downloads)");
//        Assert.assertTrue(page.downloadsBaslikHkn.isDisplayed());
//        extentTest.info("Downloads menüsüne girildiği görüldü");
//        ReusableMethods.webElementResmi2(page.downloadsBaslikHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.bekle(1);
//
//           //13 Dashboard altında, Addresses yazısının olduğunu doğrula.
//        Assert.assertTrue(page.addressesTextHkn.isDisplayed());
//        page.addressesTextHkn.click();
//        extentTest.info("Dashboard altında, Addresses yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Addresses)");
//        Assert.assertTrue(page.addressesBaslikHkn.isDisplayed());
//        extentTest.info("Addresses menüsüne girildiği görüldü");
//        ReusableMethods.webElementResmi2(page.addressesBaslikHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.bekle(1);
//
//        //14 Dashboard altında, Account Details yazısının olduğunu doğrula.
//        Assert.assertTrue(page.accountDetailstextHkn.isDisplayed());
//        page.accountDetailstextHkn.click();
//        extentTest.info("Dashboard altında, Account Details yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Account Details)");
//        Assert.assertTrue(page.accountDetailsBaslikHkn.isDisplayed());
//        extentTest.info("Account Details menüsüne girildiği görüldü");
//        ReusableMethods.webElementResmi2(page.accountDetailsBaslikHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.bekle(1);
//
//        //15 Dashboard altında, Wishlist yazısının olduğunu doğrula.
//        ReusableMethods.scroll(page.wishlistTextHkn);
//        Assert.assertTrue(page.wishlistTextHkn.isDisplayed());
//        ReusableMethods.webElementResmi2(page.wishlistTextHkn,"US11_TC02_DashboardMenu");
//
//        ReusableMethods.click(page.wishlistTextHkn);
//        extentTest.info("Dashboard altında, Wishlist yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Wishlist)");
//        page.wishlistBaslikHkn.isDisplayed();
//        extentTest.info("Wishlist menüsüne girildiği görüldü");
//
//        ReusableMethods.bekle(1);
//        Driver.getDriver().navigate().back();
//
//        // 16 Dashboard altında, Support Tickets yazısının olduğunu doğrula.
//        ReusableMethods.scroll(page.supportTicketsTextHkn);
//        Assert.assertTrue(page.supportTicketsTextHkn.isDisplayed());
//        ReusableMethods.webElementResmi2(page.supportTicketsTextHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.click(page.supportTicketsTextHkn);
//        extentTest.info("Dashboard altında, Supoort Tickets yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Support Tickets)");
//        page.ticketsStatusHkn.isDisplayed();
//        ReusableMethods.bekle(1);
//
//        // 17 Dashboard altında, Followings yazısının olduğunu doğrula.
//        ReusableMethods.scroll(page.followingsTextHkn);
//        Assert.assertTrue(page.followingsTextHkn.isDisplayed());
//        ReusableMethods.webElementResmi2(page.followingStoreHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.click(page.followingsTextHkn);
//        page.followingStoreHkn.isDisplayed();
//        extentTest.info("Dashboard altında, Followings yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Followings)");
//        ReusableMethods.bekle(1);
//
//        // 18 ==> Dashboard altında, Logout yazısının olduğunu doğrula.
//        ReusableMethods.scroll(page.logoutTextHkn);
//        Assert.assertTrue(page.logoutTextHkn.isDisplayed());
//        ReusableMethods.webElementResmi2(page.logoutTextHkn,"US11_TC02_DashboardMenu");
//        ReusableMethods.click(page.logoutTextHkn);
//        extentTest.info("Dashboard altında, logout yazısının olduğunu doğrulandı");
//        extentTest.info("Webelement resmi alındı.(Logout)");
//
//
//
//        //19 Sign in pop-up penceresinde bulunan "SIGN-IN" butonunun görünür ve ulaşılabilir olduğunu doğrula
//        Assert.assertTrue(page.signInPopUpHkn.isDisplayed());
//        ReusableMethods.bekle(1);
//        extentTest.info("Sayfadan logout yapıldı");
//
//
//
//
//    }


}

