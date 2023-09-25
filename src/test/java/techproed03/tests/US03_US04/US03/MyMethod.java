package techproed03.tests.US03_US04.US03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed03.pages.AlloverPage;
import techproed03.utilities.ConfigReader;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class MyMethod {
   static AlloverPage alloverPage=new AlloverPage();

    public static void userLoginMethod(){
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrlNT"));
        alloverPage.signinNT.click();
        alloverPage.userNameNT.sendKeys(ConfigReader.getProperty("userNameNT"), Keys.TAB,
                ConfigReader.getProperty("passwordNT"),Keys.ENTER);


    }
    public static void userBillingAddressFormDoldurmaMethod() {
        alloverPage.billingAddressFirstNameNT.sendKeys("Ahmet");
        ReusableMethods.bekle(1);
        alloverPage.billingLastNameKutusuNT.sendKeys("Temiz", Keys.TAB,
                "Team03_Company", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmBillingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.billingStreetAddressKutusu1NT.sendKeys("Osmangazi Mah", Keys.TAB,
                "Yildirim Apartmani 12");
        ReusableMethods.bekle(1);
        alloverPage.billingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingTownCityKutusuNT.sendKeys("Izmir");
        Select select1=new Select(alloverPage.ddmBillingAddressStateNT);
        select1.selectByIndex(34);
      alloverPage.billingPhoneKutusuNT.sendKeys("0213452345");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
    }


    public static void userBillingClearMethod() {
        if (alloverPage.billingAddressFirstNameNT.isDisplayed()) {
            Actions actions = new Actions(Driver.getDriver());
            ReusableMethods.bekle(2);
            actions.scrollByAmount(0, 500).perform();
            ReusableMethods.bekle(1);
            alloverPage.billingAddressFirstNameNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingLastNameKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingCompanyKutusuNT.clear();
            ReusableMethods.bekle(1);
            actions.scrollByAmount(0, 500).perform();

            ReusableMethods.bekle(1);
            alloverPage.billingStreetAddressKutusu1NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingStreetAddressKutusu2NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingZipCodeKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingTownCityKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.billingPhoneKutusuNT.clear();
        } else {
            alloverPage.billingAddressAddButtonNT.click();
        }
    }
    public static void userShippingAddressFormDoldurmaMethod() {
        alloverPage.shippingAddressFirstNameNT.sendKeys("Elif");
        ReusableMethods.bekle(1);
        alloverPage.shippingLastNameKutusuNT.sendKeys("Temiz", Keys.TAB,
                "Team03_Company", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        Select select=new Select(alloverPage.ddmShippingAddressCountryNT);
        select.selectByVisibleText("Turkey");
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah", Keys.TAB,
                "Huzur Apartmani 12");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4534");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Izmir");
        Select select1=new Select(alloverPage.ddmShippingAddressProvinceNT);
        select1.selectByIndex(32);
        ReusableMethods.bekle(1);
        alloverPage.shippingAddressAddButtonNT.submit();
    }
    public static void userShippingClearMethod() {
        if (alloverPage.shippingAddressFirstNameNT.isDisplayed()) {
            Actions actions = new Actions(Driver.getDriver());
            ReusableMethods.bekle(2);
            actions.scrollByAmount(0, 500).perform();
            ReusableMethods.bekle(1);
            alloverPage.shippingAddressFirstNameNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.shippingLastNameKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.shippingCompanyKutusuNT.clear();
            ReusableMethods.bekle(1);
            actions.scrollByAmount(0, 500).perform();
            ReusableMethods.bekle(1);
            alloverPage.shippingStreetAddressKutusu1NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.shippingStreetAddressKutusu2NT.clear();
            ReusableMethods.bekle(1);
            alloverPage.shippingZipCodeKutusuNT.clear();
            ReusableMethods.bekle(1);
            alloverPage.shippingTownCityKutusuNT.clear();
        } else {
            alloverPage.shippingAddressAddButtonNT.click();
        }
    }
}
