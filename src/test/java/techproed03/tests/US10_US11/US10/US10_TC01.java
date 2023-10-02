package techproed03.tests.US10_US11.US10;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.ReusableMethods;

//public class US10_TC01 extends ExtentReport{
   // AlloverPage page = new AlloverPage();

//MyMethod method=new MyMethod();
//
//
//    @DataProvider
//    public static Object[][] password() {
//        return new Object[][]{
//                {ConfigReader.getProperty("Sort"),
//                        ConfigReader.getProperty("Weak"),
//                        ConfigReader.getProperty("Good"),
//                        ConfigReader.getProperty("Strong")},
//
//        };
//    }
//
//    @Test(dataProvider = "password")
//    public void test01(String sort, String weak, String good, String strong) {
//
//        MyMethod.vendorKayit();
//        extentTest = extentReports.createTest("Vendor Kaydı US_10 TC_01", "Password seviyeleri görülebilmeli (Vendor Kaydı için)");
//
//        extentTest.info("Anasayfaya gidildi.");
//        extentTest.info("Register butonuna tiklandı");
//        extentTest.pass("Çıkan ekranda 'Become a Vendor' yazısının göründüğü doğrulandı.");
//        extentTest.info("Become a Vendor butonuna tıklandı.");
//        extentTest.pass("Vendor Registration sayfasının göründüğü doğrulandı");
//
//
//
//        //Password alanina 1 karakterli bir password gir.
//    AlloverPage page = new AlloverPage();
//    page.passwordRegistrationHkn.sendKeys(sort);
//      extentTest.info("Password alanina 1 karakterli bir password girildi.");
//
//         //"Too short" mesajının göründüğünü doğrula.
//       Assert.assertEquals("Too short",page.passwordSeviyeHkn.getText());
//        ReusableMethods.bekle(1);
//        extentTest.info("Too short mesajının göründüğü doğrulandı.");
//        ReusableMethods.webElementResmi2(page.passwordSeviyeHkn,"US10_TC01");
//        extentTest.info("Webelement resmi alındı.(Too short)");
//
//    //Password alanınını sil.
//        page.passwordRegistrationHkn.clear();
//        extentTest.info("Password alanı sililndi.");
//
//    //"Password alanina 6 karakterli aynı tür bir password gir.
//      page.passwordRegistrationHkn.sendKeys(weak);
//      extentTest.info("Password alanina 6 karakterli sayı password olarak girildi");
//
//    //"Weak" mesajının göründüğünü doğrula.
//        Assert.assertEquals("Weak",page.passwordSeviyeHkn.getText());
//        ReusableMethods.bekle(1);
//        extentTest.pass("Weak mesajının göründüğü doğrulandı.");
//        ReusableMethods.webElementResmi2(page.passwordSeviyeHkn,"US10_TC01");
//        extentTest.info("Webelement resmi alındı.(Weak)");
//        //Password alanınını sil.
//        page.passwordRegistrationHkn.clear();
//        extentTest.info("Password alanınını silindi.");
//
//    //Password 6 karakterli bir büyük,bir  küçük harf ve 4 sayı içeren bir password gir.
//        page.passwordRegistrationHkn.sendKeys(good);
//        extentTest.info("Password 6 karakterli bir büyük, bir küçük harf ve 4 sayı içeren bir password girildi.");
//
//    //"Good" mesajının göründüğünü doğrula.
//        Assert.assertEquals("Good",page.passwordSeviyeHkn.getText());
//        ReusableMethods.bekle(1);
//        extentTest.pass("Good mesajının göründüğü doğrulandı.");
//        ReusableMethods.webElementResmi2(page.passwordSeviyeHkn,"US10_TC01");
//        extentTest.info("Webelement resmi alındı.(Good)");
//    //Passwordu alanındaki passwordu sil.
//        page.passwordRegistrationHkn.clear();
//        extentTest.info("Passwordu alanındaki password silindi.");
//
//
//    //Password 8 karakterli  bir büyük harf ,bir küçük harf ve 6 sayı içeren bir password gir.
//        page.passwordRegistrationHkn.sendKeys(strong);
//        extentTest.info("Password 8 karakterli  bir büyük harf ,bir küçük harf ve 6 sayı içeren bir password girildi");
//
//    //"Strong" mesajının göründüğünü doğrula.
//       Assert.assertEquals("Strong",page.passwordSeviyeHkn.getText());
//        ReusableMethods.bekle(1);
//        extentTest.pass("Strong mesajının göründüğü doğrulandı.");
//        ReusableMethods.webElementResmi2(page.passwordSeviyeHkn,"US10_TC01");
//        extentTest.info("Webelement resmi alındı.(Strong)");
//
//}}