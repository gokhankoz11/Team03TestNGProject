package techproed03.tests.US01_US02.US02;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTikla;

public class US02_TC02 {
    @Test
    public void tumZorunluAlanlarBos() {

        //     Siteye git
        //        Register linkine tıkla
        SiteyeGitRegisterTikla girisBasics=new SiteyeGitRegisterTikla();
        girisBasics.siteyeGitVeReisterTikla();
        /*
        Username kutucugunu bos birak, kaytli bir username girme
email kutucugunu bos birak
password bos birak
I agree to privacy policy checkbox ini tiklama
         */

        //Signup a tikla
        AlloverPage homePage=new AlloverPage();
        homePage.signUpAyse.click();

        //Kayit gerceklesmez Sign up butonu görünür olmaya devam eder,
        // kullanicisite icine yönlendirilmez
        Assert.assertTrue(homePage.signUpAyse.isDisplayed());
    }
}
