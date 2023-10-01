package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTiklaVeFakeMailAl;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitVeRegisterTikla;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.ReusableMethods;

public class US02_TC03 {
    @Test
    public void testName() {
        /*





         */
        //Siteye git, Register a tikla
        SiteyeGitVeRegisterTikla girisBasics=new SiteyeGitVeRegisterTikla();
        girisBasics.siteyeGitVeRegisterTikla();

        //kayitli username ve maili gir
        // Formata uygun olmayan bir password gir
        AlloverPage homePage=new AlloverPage();
        homePage.usernameTabAyse.sendKeys(ConfigReader.getProperty("kayitliUsernameAyse01"),
                Keys.TAB,ConfigReader.getProperty("kayitliMailAyse"),Keys.TAB,
                ConfigReader.getProperty("formataUygunOlmayanPassword"),Keys.ENTER);
        ReusableMethods.extentTest.info("Kullanici kayitli bir username ve formata uygun olmayan bir password girer");

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
