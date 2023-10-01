package techproed03.tests.US09;

import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class US09_TC14 {

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





    AlloverPage alloverPage = new AlloverPage();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void test_US_09_TC_14() throws IOException {

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        AlloverPage.singInButton.click();


        //Click on "Sign up"
        AlloverPage.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        AlloverPage.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        AlloverPage.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        AlloverPage.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        AlloverPage.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        AlloverPage.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        AlloverPage.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(AlloverPage.registerButton);


        //Verify "Welcome to Allover Commerce!" text is visible
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://allovercommerce.com/vendor-register/"));
        ReusableMethods.getScreenshot("test_US_09_TC_14");



    }



}