package techproed03.tests.US06_US07;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import java.security.Key;
import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertTrue;

public class US07_TC01 {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverpage = new AlloverPage();
        WebElement aramaKutusu= Driver.getDriver().findElement(By.xpath("(//*[@type='search'])[1]"));
        aramaKutusu.sendKeys("bag"+ Keys.ENTER);
        WebElement beyazCanta=Driver.getDriver().findElement(By.xpath("//img[@src='https://allovercommerce.com/wp-content/uploads/2022/09/womens-white-handbag-2-300x300.jpg']"));
        WebElement terazi1 = Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[2]/div/figure/div/a[2]"));
        terazi1.click();
        alloverpage.AnaSayfaM.click();
        WebElement seyahatCanta=Driver.getDriver().findElement(By.xpath("https://allovercommerce.com/wp-content/uploads/2022/09/Best-Travel-Bag-1-300x300.jpg"));
        WebElement terazi2= Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[3]/div/figure/div[2]/a[2]"));
        terazi2.click();
        alloverpage.AnaSayfaM.click();
        WebElement resimsizCanta=Driver.getDriver().findElement(By.xpath("https://allovercommerce.com/wp-content/uploads/woocommerce-placeholder.png"));
        WebElement terazi3=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[1]/div/figure/div[2]/a[2]"));
        terazi3.click();
        alloverpage.AnaSayfaM.click();
        WebElement fashionCanta= Driver.getDriver().findElement(By.xpath("https://allovercommerce.com/wp-content/uploads/2022/09/womens-fashion-handbag-4-300x300.jpg"));
        WebElement terazi4=Driver.getDriver().findElement(By.xpath("//*[@id='main']/div/div/div/div[4]/ul/li[4]/div/figure/div[2]/a[2]"));
        terazi4.click();
        alloverpage.CompareM.click();
        Assert.assertTrue(alloverpage.CompareM.isDisplayed());





    }

}
