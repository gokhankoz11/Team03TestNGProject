package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTiklaVeFakeMailAl;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitVeRegisterTikla;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US02_TC01 {
    @Test
    public void zorunluAlanlardanBiriBosBirakilamaz() {
        AlloverPage homePage = new AlloverPage();

        //  Siteye git
        //Register linkine tıkla
        SiteyeGitVeRegisterTikla girisBasics=new SiteyeGitVeRegisterTikla();
        girisBasics.siteyeGitVeRegisterTikla();

        //Username kutucugunu bos birak,Username kutucugunu bos birak, kayitli username i girme
        //emaili gir
        //Gecerli passwordu gir
        homePage.emailTabAyse.sendKeys(ConfigReader.getProperty("kayitliMailAyse01"),
                Keys.TAB, ConfigReader.getProperty("kayitliPasswordAyse"),Keys.ENTER);
        ReusableMethods.extentTest.info("Kullanici kayitli bir email ve password girer");

        //I agree to privacy policy checkbox ini tikla
        homePage.registerPolicyAyse.click();
        ReusableMethods.extentTest.info("Kullanici ilgili checkbox i secti");


        //SIGN UP butonuna tiklar
        homePage.signUpAyse.click();
        ReusableMethods.extentTest.info("Kullanici sign up butonuna tikladi");


        //Kayit gerceklesmez signup butonu görünmeye devam eder
        Assert.assertTrue( homePage.signUpAyse.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici kayit islemini tamamlamadi ve pop up görünmeye devam etti");
        ReusableMethods.extentReport.flush();





    }
}
