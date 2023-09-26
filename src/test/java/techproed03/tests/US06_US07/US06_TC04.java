package techproed03.tests.US06_US07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class US06_TC04 {
    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SingInButtonMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        ReusableMethods.bekle(3);
        alloverPage.PasswordM.sendKeys(("merve54Merve8"), Keys.ENTER);
        ReusableMethods.bekle(3);
        alloverPage.SearchButtonMerve.click();
        alloverPage.SearchButtonMerve.sendKeys("Electric Rice-Cooker",Keys.ENTER);
        ReusableMethods.bekle(3);
        alloverPage.AddToCardMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.AddToCardDogrulama.click();
        alloverPage.CardView.click();
        alloverPage.CardView2.click();
        int before = Integer.parseInt(String.valueOf(Driver.getDriver().findElement(By.xpath("CardPlusMinus")).getText()));
        Driver.getDriver().findElement(By.xpath("CardPlus")).click();
        int after = Integer.parseInt(String.valueOf(Driver.getDriver().findElement(By.xpath("CardPlusMinus")).getText()));
        Assert.assertEquals(after,before + 1,"urun sayisi artip azaliyor");






    }
}
