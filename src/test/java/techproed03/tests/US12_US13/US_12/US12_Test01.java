package techproed03.tests.US12_US13.US_12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US12_Test01 {
    @Test
    public void test01() throws InterruptedException {
        AlloverPage alloverPage = new AlloverPage();

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl_ofa"));
        String alloverUrl = Driver.getDriver().getWindowHandle();
        Thread.sleep(3000);
        alloverPage.registerButton_ofa.click();
        Thread.sleep(3000);
        alloverPage.becomeVendorButton_ofa.click();



    }
}
