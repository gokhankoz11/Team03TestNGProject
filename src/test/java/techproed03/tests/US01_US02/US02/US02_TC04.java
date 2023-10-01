package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTiklaVeFakeMailAl;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitVeRegisterTikla;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.ReusableMethods;

public class US02_TC04 {
    @Test
    public void gecerliVeKayitliBilgilerIleKayitYapilamaz() {
        AlloverPage homePage=new AlloverPage();

        //        Siteye git
        //Register linkine tikla
        SiteyeGitVeRegisterTikla girisBasic=new SiteyeGitVeRegisterTikla();
        girisBasic.siteyeGitVeRegisterTikla();

        //Kayıtlı bir username gir
        //Kayitli email adresi gir
        //Gecerli,kayitli password gir

        homePage.usernameTabAyse.sendKeys(ConfigReader.getProperty("kayitliUsernameAyse"),
                Keys.TAB,ConfigReader.getProperty("kayitliMailAyse01"),Keys.TAB,
                ConfigReader.getProperty("kayitliPasswordAyse"),Keys.ENTER);
        ReusableMethods.extentTest.info("Kullanici kayitli bir username, kayirli bir mail ve kayitli bir password girdi");

        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();
        ReusableMethods.extentTest.info("Kullanici ilgili checkbox i secti");

        //sign up
        homePage.signUpAyse.click();
        ReusableMethods.extentTest.info("Kullanici sign up butonuna tikladi");

        //An account is already registered with your email address. mesaji alinir
        Assert.assertTrue(homePage.alreadyRegistredMessage.isDisplayed());
        ReusableMethods.extentTest.info("Kullanici An account is already registred with your email address mesajini görür.");
    }
}
