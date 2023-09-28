package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTikla;
import techproed03.utilities.ConfigReader;

public class US02_TC03 {
    @Test
    public void testName() {
        /*





         */
        //Siteye git, Register a tikla
        SiteyeGitRegisterTikla girisBasics=new SiteyeGitRegisterTikla();
        girisBasics.siteyeGitVeReisterTikla();

        //kayitli username ve maili gir
        // Formata uygun olmayan bir password gir
        AlloverPage homePage=new AlloverPage();
        homePage.usernameTabAyse.sendKeys(ConfigReader.getProperty("kayitliUsernameAyse"),
                Keys.TAB,ConfigReader.getProperty("kayitliMailAyse"),Keys.TAB,
                ConfigReader.getProperty("formataUygunOlmayanPassword"),Keys.ENTER);

        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();

        //sign up
        homePage.signUpAyse.click();

        //An account is already registered with your email address. mesaji alinir
        Assert.assertTrue(homePage.alreadyRegistredMessage.isDisplayed());




    }
}
