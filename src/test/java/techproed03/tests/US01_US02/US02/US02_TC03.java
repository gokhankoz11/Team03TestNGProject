package techproed03.tests.US01_US02.US02;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla.SiteyeGitRegisterTikla;
import techproed03.utilities.ConfigReader;

public class US03_TC03 {
    @Test
    public void testName() {
        /*


Formata uygun olmayan bir password gir



         */
        //Siteye git, Register a tikla
        SiteyeGitRegisterTikla girisBasics=new SiteyeGitRegisterTikla();
        girisBasics.siteyeGitVeReisterTikla();

        //kayitli mail ve uygunsuz formatta password u gir doldur
        AlloverPage homePage=new AlloverPage();
        homePage.usernameTabAyse.sendKeys(ConfigReader.getProperty("kayitliMailAys"),
                Keys.TAB,ConfigReader.getProperty("formataUygunOlmayanPassword"),Keys.ENTER);



    }
}
