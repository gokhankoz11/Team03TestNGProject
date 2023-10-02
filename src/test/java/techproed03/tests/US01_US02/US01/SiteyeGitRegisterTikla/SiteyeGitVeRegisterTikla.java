package techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla;

import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class SiteyeGitVeRegisterTikla {
    @Test
    public void siteyeGitVeRegisterTikla() {
        AlloverPage homePage = new AlloverPage();
        ReusableMethods.rapor("chrome", "Empty Username Register");
        ReusableMethods.extentTest=ReusableMethods.extentReport.createTest("Extent Report","Test Information");

        //  Kullanici Web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlAyse"));
        ReusableMethods.extentTest.info("Kullanici Allover Commerce Web sitesine gitti");

        //Register butonuna tiklarRegister butonuna tiklar
        homePage.registerLinkAyse.click();
        ReusableMethods.extentTest.info("Kullanici register linkine tikladi");
    }
}
