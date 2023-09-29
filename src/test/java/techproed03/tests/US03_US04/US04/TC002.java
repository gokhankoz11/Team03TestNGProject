package techproed03.tests.US03_US04.US04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed03.pages.AlloverPage;
import techproed03.tests.US03_US04.US03.MyMethod;
import techproed03.utilities.Driver;
import techproed03.utilities.ReusableMethods;

public class TC002 {

    static SoftAssert softAssert = new SoftAssert();
    AlloverPage alloverPage=new AlloverPage();

    @BeforeClass
    public void beforeClass() {
        //Kullanici olarak giris yapiniz
        MyMethod.userLoginMethod();
        ReusableMethods.bekle(3);

        //My Account alanina tiklayiniz

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        alloverPage.myAccountNT.click();
        //Acilan sayfadan Adresses alanina tiklayiniz
        alloverPage.addressesButtonNT.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(alloverPage.shippingAddressAddButtonNT);
        ReusableMethods.bekle(2);
        alloverPage.shippingAddressAddButtonNT.click();
        ReusableMethods.bekle(2);
        MyMethod.userShippingClearMethod();

    }

    @Test(priority = 1)
    public void FirstNameEksikBirakTesti() {

        //Firstname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.shippingFirstNameUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 2)
    public void LastNameEksikBirakTesti() {

        //Lastname kutucugunu bos birakip diger butun alanlari doldurunuz
        ReusableMethods.bekle(1);
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingCompanyKutusuNT.sendKeys("Team03");
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.shippingLastNameUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 3)
    public void StreetaddressEksikBirakTesti() {
        //Streetaddress kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        ReusableMethods.bekle(1);
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.shippingStreetaddressUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 4)
    public void PostCodeKutusunuEksikBirakTesti() {
        //Potcode kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingTownCityKutusuNT.sendKeys("Istanbul");
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.shippingPostCodeUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }
    @Test(priority = 5)
    public void TownCityKutusunuEksikBirakTesti() {
        //TownCity kutucugunu bos birakip diger butun alanlari doldurunuz
        alloverPage.shippingAddressFirstNameNT.sendKeys("Veli");
        alloverPage.shippingLastNameKutusuNT.sendKeys("Kaya", Keys.TAB,
                "Team03", Keys.TAB);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 400);
        ReusableMethods.bekle(1);
        alloverPage.shippingStreetAddressKutusu1NT.sendKeys("Lale Mah");
        ReusableMethods.bekle(1);
        alloverPage.shippingZipCodeKutusuNT.sendKeys("4564");
        alloverPage.billingSaveAddressButtonNT.submit();
        softAssert.assertTrue(alloverPage.shippingTownCityUyariMesajiNT.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }

    @AfterClass
    public void afterClass() {
        softAssert.assertAll();
        Driver.quitDriver();}
}
