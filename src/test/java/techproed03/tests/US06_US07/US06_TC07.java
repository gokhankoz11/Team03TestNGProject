package techproed03.tests.US06_US07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

import static org.openqa.selenium.Keys.*;

public class US06_TC07 {
    @Test
    public void test07() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrlM"));
        AlloverPage alloverPage = new AlloverPage();
        alloverPage.SingInButtonMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.UserNameOrEmailAddress.sendKeys("mervue4554@gmail.com");
        ReusableMethods.bekle(3);
        alloverPage.PasswordM.sendKeys(("merve54Merve8"), ENTER);
        ReusableMethods.bekle(3);
        alloverPage.SearchButtonMerve.click();
        alloverPage.SearchButtonMerve.sendKeys("Electric Rice-Cooker", ENTER);
        ReusableMethods.bekle(3);
        alloverPage.AddToCardMerve.click();
        ReusableMethods.bekle(3);
        alloverPage.AddToCardDogrulama.click();
        alloverPage.CardView.click();
        alloverPage.CardView2.click();
        ReusableMethods.bekle(3);
        alloverPage.CheckoutMerve.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(alloverPage.BillingDetailsM.isDisplayed());
        alloverPage.FirstNameM.sendKeys("merve");
        alloverPage.LastNameM.sendKeys("cyln");
        alloverPage.CountryM.sendKeys("Germany");
        alloverPage.StreetAddressM.sendKeys("GHSASGASDJSJFGJSAJ");
        alloverPage.ZipCodeM.sendKeys("40789");
        alloverPage.CityM.sendKeys("cologne");
        alloverPage.PhoneM.sendKeys("3829907506765");
        alloverPage.EmailM.sendKeys("mervue4554@gmail.com");
        alloverPage.PlaceOrderM.click();
        alloverPage.PaymentMethodsM.isSelected();
        alloverPage.OrderCompleteM.click();
        Assert.assertTrue(alloverPage.AlisverisBitti.isDisplayed());
    }
}
