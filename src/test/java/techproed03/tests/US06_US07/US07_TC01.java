package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;

public class US07_TC01 {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverpage = new AlloverPage();
        alloverpage.SearchButtonMerve.sendKeys("Bag"+Keys.ENTER);
        WebElement terazi=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[2]/div/figure/div/a[2]"));
        terazi.click();
        Driver.getDriver().navigate().back();
        WebElement terazi1=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[3]/div/figure/div[2]/a[2]"));
        terazi1.click();
        Driver.getDriver().navigate().back();
        WebElement terazi2=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[1]/div/figure/div[2]/a[2]"));
        terazi2.click();
        Driver.getDriver().navigate().back();
        WebElement terazi3=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[4]/div/figure/div[2]/a[2]"));
        terazi3.click();
        alloverpage.CompareM.click();
        Assert.assertTrue(alloverpage.CompareM.isDisplayed());





    }

}

