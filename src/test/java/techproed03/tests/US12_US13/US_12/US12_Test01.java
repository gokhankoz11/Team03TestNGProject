package techproed03.tests.US12_US13.US_12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US12_Test01 {
    @Test
    public void test01() throws InterruptedException {
     /*   AlloverPage alloverPage = new AlloverPage();

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_ofa"));
        String alloverUrl = Driver.getDriver().getWindowHandle();
        Thread.sleep(2000);
        alloverPage.registerButton_ofa.click();
        Thread.sleep(2000);
        alloverPage.becomeVendorButton_ofa.click();
        Thread.sleep(2000);

        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("FakeMailUrl_ofa"));
        String FakeMailUrl = Driver.getDriver().getWindowHandle();

        alloverPage.consentFakemail_ofa.click();
        alloverPage.copyMail_ofa.click();

        Driver.getDriver().switchTo().window(alloverUrl);
        alloverPage.regEmailBox_ofa.sendKeys(Keys.COMMAND+"v"+Keys.TAB);
        Thread.sleep(6000);

        Driver.getDriver().switchTo().window(FakeMailUrl);
        Thread.sleep(4000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(4000);

        alloverPage.mailBox_ofa.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame("iframeMail");
        String code = alloverPage.code_ofa.getText().replaceAll("[^0-9]", "");
        System.out.println(code);

        Driver.getDriver().switchTo().window(alloverUrl);
        Thread.sleep(2000);
        alloverPage.verCode_ofa.sendKeys(code);

        Driver.getDriver().switchTo().window(FakeMailUrl);
        alloverPage.fakeBack.click();
        Thread.sleep(2000);
        alloverPage.copyPass_ofa.click();

        Driver.getDriver().switchTo().window(alloverUrl);
        alloverPage.regPasswordBox_ofa.sendKeys(Keys.COMMAND+"v");
        alloverPage.regPasswordConf_ofa.sendKeys(Keys.COMMAND+"v");
        alloverPage.regButton_ofa.click();

        Thread.sleep(2000);









*/


    }
}
