package techproed03.tests.US09;

import techproed03.pages.AlloverPage;
import techproed03.utilities.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class US09_TC01 extends ExtentReportUtils {


    AlloverPage alloverPage = new AlloverPage();
    Actions actions = new Actions(Driver.getDriver());



    @Test
    public void test_US_09_TC_01() throws IOException {

        // STEP: It should be possible to log in using the "Become a Vendor" link on the Sign Up screen.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        AlloverPage.singInButton.click();

        //Click on "Sign up"
        AlloverPage.singUpButton.click();

        //Verify "Become a Vendor" text is displayed on the website
        Assert.assertTrue(AlloverPage.becomeAVendorButton.isDisplayed());

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        AlloverPage.becomeAVendorButton.click();

        //Verify user is on Vendor Registration Page
        AlloverPage.VendorRegistrationText.isDisplayed();
        ReusableMethods.getScreenshot("test_US_09_TC_01");


        Driver.getDriver().close();

    }


}