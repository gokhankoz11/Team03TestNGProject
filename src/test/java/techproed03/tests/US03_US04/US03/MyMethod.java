package techproed03.tests.US03_US04.US03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class MyMethod {

    public static void userLoginMethod(){
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrlNT"));
        AlloverPage alloverPage=new AlloverPage();
        alloverPage.signinNT.click();
        alloverPage.userNameNT.sendKeys(ConfigReader.getProperty("userNameNT"), Keys.TAB,
                ConfigReader.getProperty("passwordNT"),Keys.ENTER);


    }
    public static void billingAddressFormDoldurmaMethodu(){
        AlloverPage alloverPage=new AlloverPage();
        alloverPage.billingAddressFirstNameNT.sendKeys("Ahmet",Keys.TAB,
                "Temiz",Keys.TAB,"Team03 Company");
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("American Samoa");
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Viktoria 132",Keys.TAB,
                "Koza Apt.",Keys.TAB,"New York");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByVisibleText("New York");
        alloverPage.billingZipCodeKutusuNT.sendKeys("4536745",Keys.TAB,"02134256743",Keys.ENTER);


    }

    public static void userBillingClearMethod() {
        AlloverPage alloverPage=new AlloverPage();

        if (alloverPage.billingAddressAddButtonNT.isDisplayed()) {
            Actions actions = new Actions(Driver.getDriver());
            ReusableMethods.bekle(2);
            actions.scrollByAmount(0, 500).perform();
            alloverPage.billingAddressAddButtonNT.click();
            ReusableMethods.bekle(1);
            alloverPage.billingAddressFirstNameNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingLastNameKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingCompanyKutusuNT.clear();
            ReusableMethods.bekle(1);
            actions.scrollByAmount(0, 500).perform();

            ReusableMethods.bekle(1);
           alloverPage.ddmBillingAddressCountryNT .clear();
            ReusableMethods.bekle(1);
            alloverPage.billingStreetAddressKutusu1NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingStreetAddressKutusu2NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingTownCityKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.ddmBillingAddressStateNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingZipCodeKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingPhoneKutusuNT.clear();

        } else {
            alloverPage.billingAddressAddButtonNT.click();
    }


        }


}
