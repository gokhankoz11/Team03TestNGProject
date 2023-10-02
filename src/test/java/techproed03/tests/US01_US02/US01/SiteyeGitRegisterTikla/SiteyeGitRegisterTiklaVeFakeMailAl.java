package techproed03.tests.US01_US02.US01.SiteyeGitRegisterTikla;

import org.openqa.selenium.WindowType;
import techproed03.pages.AlloverPage;
import techproed03.pages.FakeMailPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class SiteyeGitRegisterTiklaVeFakeMailAl {
    public void siteyeGitVeRegisterTikla(){
        AlloverPage homePage = new AlloverPage();
        FakeMailPage fakeMailPage = new FakeMailPage();
        ReusableMethods.rapor("chrome", "Empty Username Register");
        ReusableMethods.extentTest=ReusableMethods.extentReport.createTest("Extent Report","Test Information");
        //  Kullanici Web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlAyse"));
        ReusableMethods.extentTest.info("Kullanici Allover Commerce Web sitesine gitti");

        //Register butonuna tiklarRegister butonuna tiklar
        homePage.registerLinkAyse.click();
        ReusableMethods.extentTest.info("Kullanici register linkine tikladi");

        //fake mail alir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        ReusableMethods.extentTest.info("Kullanici FakeMail websitesinin tab ine gecis yapti");
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        fakeMailPage.constentAyse.click();
        ReusableMethods.extentTest.info("Kullanici cookie kabulu yapti");

    }
}
