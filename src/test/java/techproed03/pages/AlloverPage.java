package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

























public class AlloverPage {
    public AlloverPage(){
        PageFactory.initElements(Driver.getDriver(),this);


        //!!!Kesinlikle ctrl+L yapmayalim!!!   _________  !!!Branch'imiza dikkat edelim sahsi düzenlemelerde kendi branchimizla calisalim!!!
    }



    //Hakan Oguz - 40





























    //Sedat - 70





























    //Ilyas - 100





























    //Ayse - 130



























    //Nuriye - 160
    @FindBy(xpath = "//a[@class='login inline-type']") public WebElement signinNT;  @FindBy(xpath = "//*[@id='username']") public WebElement userNameNT;
    @FindBy(xpath = "//*[@id='menu-item-1079']") public WebElement myAccountNT; @FindBy(xpath = "(//li)[8]") public WebElement addressesButtonNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingAddressAddButtonNT; @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement billingAddressFirstNameNT;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement billingLastNameKutusuNT;   @FindBy(xpath = "//*[@id='billing_company']") public WebElement billingCompanyKutusuNT;
    @FindBy(xpath = "//select[@id='billing_country']") public WebElement ddmBillingAddressCountryNT;  @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement billingStreetAddressKutusu1NT;
    @FindBy(xpath = "//input[@id='billing_address_2']") public WebElement billingStreetAddressKutusu2NT;  @FindBy(xpath = "//*[@id='billing_city']") public WebElement billingTownCityKutusuNT;
    @FindBy(xpath = "//select[@id='billing_state']") public WebElement ddmBillingAddressStateNT;  @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement billingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement billingPhoneKutusuNT;             @FindBy(xpath = "//*[@id='billing_email']") public WebElement billingEMailKutusuNT;
    @FindBy(xpath = "//button[@name='save_address']") public WebElement billingSaveAddressButtonNT;   @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingEditYourAddressNT;
    @FindBy(xpath = "//*[@data-id='billing_first_name']") public WebElement billingFirstNameUyariMesajiNT;  @FindBy(xpath = "//*[@data-id='billing_last_name']") public WebElement billingLastNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_address_1']") public WebElement billingStreetaddressUyariMesajiNT; @FindBy(xpath = "//*[@data-id='billing_postcode']") public WebElement billingPostCodeUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_city']") public WebElement billingTownCityUyariMesajiNT;
    @FindBy(xpath = "//*[@class='fas fa-check']") public WebElement billingaddressSuccessfullyNT;      @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingAddressAddButtonNT;
    @FindBy(xpath = "//*[@id='shipping_first_name']") public WebElement shippingAddressFirstNameNT; @FindBy(xpath = "//*[@id='shipping_last_name']") public WebElement shippingLastNameKutusuNT;
    @FindBy(xpath = "//*[@id='shipping_company']") public WebElement shippingCompanyKutusuNT;  @FindBy(xpath = "//select[@id='shipping_country']") public WebElement ddmShippingAddressCountryNT;
    @FindBy(xpath = "//input[@id='shipping_address_1']") public WebElement shippingStreetAddressKutusu1NT;   @FindBy(xpath = "//input[@id='shipping_address_2']") public WebElement shippingStreetAddressKutusu2NT;
    @FindBy(xpath = "//*[@id='shipping_city']") public WebElement shippingTownCityKutusuNT;     @FindBy(xpath = "//*[@id='shipping_postcode']") public WebElement shippingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@data-id='billing_first_name']") public WebElement ddmShippingAddressProvinceNT;

























    //Suna - 190





























    //Omer - 220





























    //Ridvan - 250





























    //Merve - 280
  
  @FindBy(xpath ="//span[.='Sign In']")
    public WebElement SingInButtonMerve;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameOrEmailAddress;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordM;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement SignInButtonMerve2;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement SearchButtonMerve;
    @FindBy(xpath = "//*[.='Electric Rice-Cooker']")
    public WebElement VerifyM;
    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement AddToCardMerve;


























    //Gökhan - 310






















}
