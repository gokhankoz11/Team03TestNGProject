package techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla;

import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class SiteyeGitRegisterTikla {
    public void siteyeGitVeReisterTikla(){
        //Kullanici siteye gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlAyse"));

        //Register butonuna tiklarRegister butonuna tiklar
        AlloverPage homePage=new AlloverPage();
        homePage.registerLinkAyse.click();
    }
}
