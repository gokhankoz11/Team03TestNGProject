package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class US07_TC01 {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverPage = new AlloverPage();
        WebElement aramaKutusu = Driver.getDriver().findElement(By.xpath("(//*[@type='search'])[1]"));
        aramaKutusu.sendKeys("bag" + Keys.ENTER);
        alloverPage.Terazi1.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        alloverPage.Terazi.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(2);
        alloverPage.Terazi2.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(2);
        alloverPage.Terazi3.click();
        alloverPage.CompareM.click();






    }

}

