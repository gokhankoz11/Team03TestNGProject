package techproed03.tests.US06_US07;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;


public class US07_TC02 {


    @Test
    public void test02() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SearchButtonMerve.sendKeys("bag" + Keys.ENTER);
        ReusableMethods.bekle(2);
        WebElement terazi=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[2]/div/figure/div/a[2]"));
        terazi.click();
        alloverPage.CompareM.click();
        alloverPage.SilmeIsareti.click();
        Assert.assertTrue(alloverPage.CompareBos.isDisplayed());





    }
}



