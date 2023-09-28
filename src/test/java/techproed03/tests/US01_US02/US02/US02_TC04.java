package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTikla;
import techproed03.utilities.ConfigReader;

public class US02_TC04 {
    @Test
    public void gecerliVeKayitliBilgilerIleKayitYapilamaz() {


        //        Siteye git
        //Register linkine tikla
        SiteyeGitRegisterTikla girisBasic=new SiteyeGitRegisterTikla();
        girisBasic.siteyeGitVeReisterTikla();

        //Kayıtlı bir username gir
        //Kayitli email adresi gir
        //Gecerli,kayitli password gir
        AlloverPage homePage=new AlloverPage();
        homePage.usernameTabAyse.sendKeys(ConfigReader.getProperty("kayitliUsernameAyse"),
                Keys.TAB,ConfigReader.getProperty("kayitliMailAyse"),Keys.TAB,
                ConfigReader.getProperty("kayitliPasswordAyse"),Keys.ENTER);
        //I agree to the privacy policy checkbox'i secer
        homePage.registerPolicyAyse.click();

        //sign up
        homePage.signUpAyse.click();

        //An account is already registered with your email address. mesaji alinir
        Assert.assertTrue(homePage.alreadyRegistredMessage.isDisplayed());
    }
}
