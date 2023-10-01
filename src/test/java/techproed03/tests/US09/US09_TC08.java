package techproed03.tests.US09;

import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

//public class US09_TC08 {

/*
    US_09 : User should be able to register to the website as Vendor. (Vendor Registration)

    It should be possible to log in using the "Become a Vendor" link on the Sign Up screen.
    User should enter email address.
    "Verification code sent to your email: abc@abc.com." should be visible.
    The code received via email should be entered in the verification code text box.
    Password should be entered and it should contain uppercase, lowercase, digit and special char.
    User should enter password again.
    Registration as a Vendor should be completed by clicking on the Register button.
    The message "This Email already exists. Please login to the site and apply as vendor." should appear if the user tries to register using a registered email address.  */




   // AlloverPage alloverPage = new AlloverPage();
    //Actions actions = new Actions(Driver.getDriver());



  //  @Test
    //public void test_US_09_TC_08() throws IOException {

        // STEP: The code received via email should be entered in the verification code text box.

        //User should navigate to Allover Commerce url
      /*  Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        AlloverPage.singInButton.click();

        //Click on "Sign up"
        AlloverPage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        AlloverPage.becomeAVendorButton.click();

        //Enter a valid email address
        AlloverPage.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        AlloverPage.reSendCodeButton.click();

        //Enter invalid Re-Send Code in "Verification Code" box.
        String resendCode = ConfigReader.getProperty("re_send_invalid_code");
         AlloverPage.reSendCodeInput.sendKeys(resendCode);
         AlloverPage.registerButton.click();

        //Verify when user does not enter Re-Send Code "Email Verification Code: This field is required." text is  visible
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Email Verification Code: This field is required."));
        ReusableMethods.getScreenshot("test_US_09_TC_08");

        Driver.getDriver().close();

    }


}*/