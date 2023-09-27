package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTikla;
import techproed03.utilities.ConfigReader;

public class US02_TC01 {
    @Test
    public void zorunluAlanlardanBiriBosBirakilamaz() {
        /*




         */
        //        Siteye git
        //Register linkine tıkla
        SiteyeGitRegisterTikla girisBasics=new SiteyeGitRegisterTikla();
        girisBasics.siteyeGitVeReisterTikla();

        //Username kutucugunu bos birak,Username kutucugunu bos birak, kayitli username i girme
        //emaili gir
        //Gecerli passwordu gir
        AlloverPage homePage=new AlloverPage();
        homePage.emailTabAyse.sendKeys(ConfigReader.getProperty("kayitliMailAyse"),
                Keys.TAB, ConfigReader.getProperty("kayitliPasswordAyse"),Keys.ENTER);

        //I agree to privacy policy checkbox ini tikla
        homePage.registerPolicyAyse.click();

        //Kayit gerceklesmez signup butonu görünmeye devam eder
        Assert.assertTrue( homePage.signUpAyse.isDisplayed());





    }
}
