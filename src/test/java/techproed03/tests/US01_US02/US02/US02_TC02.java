package techproed03.tests.US01_US02.US02;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTiklaVeFakeMailAl;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitVeRegisterTikla;
import techproed03.utilities.ReusableMethods;

public class US02_TC02 {
    @Test
    public void tumZorunluAlanlarBos() {
        AlloverPage homePage=new AlloverPage();

        //     Siteye git
        //        Register linkine tıkla
        SiteyeGitVeRegisterTikla girisBasics = new SiteyeGitVeRegisterTikla();
        girisBasics.siteyeGitVeRegisterTikla();

        //  Username kutucugunu bos birak, kaytli bir username girme
        //email kutucugunu bos birak
        //password bos birak
        //I agree to privacy policy checkbox ini tiklama
        ReusableMethods.extentTest.info("Kullanici tüm zorunlu alanlari bos birakti");

        //Signup a tikla
        homePage.signUpAyse.click();
        ReusableMethods.extentTest.info("Kullanici sign up butonuna tikladi");

        //Kayit gerceklesmez Sign up butonu görünür olmaya devam eder,
        // kullanicisite icine yönlendirilmez
        Assert.assertTrue(homePage.signUpAyse.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici kayit islemini tamamlamadi ve pop up görünmeye devam etti");
        ReusableMethods.extentReport.flush();

    }
}
