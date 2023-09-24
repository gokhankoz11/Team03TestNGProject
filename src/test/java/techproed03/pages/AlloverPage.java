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
    @FindBy(xpath = "//a[@class='login inline-type']") public WebElement signinNT;
    @FindBy(xpath = "//*[@id='username']") public WebElement userNameNT;
    @FindBy(xpath = "//*[@id='menu-item-1079']") public WebElement myAccountNT;
    @FindBy(xpath = "(//li)[8]") public WebElement addressesButtonNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingAddressAddButtonNT;
    @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement billingAddressFirstNameNT;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement billingLastNameKutusuNT;
    @FindBy(xpath = "//*[@id='billing_company']") public WebElement billingCompanyKutusuNT;
    @FindBy(xpath = "//select[@id='billing_country']") public WebElement ddmBillingAddressCountryNT;
    @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement billingStreetAddressKutusu1NT;
    @FindBy(xpath = "//input[@id='billing_address_2']") public WebElement billingStreetAddressKutusu2NT;
    @FindBy(xpath = "//*[@id='billing_city']") public WebElement billingTownCityKutusuNT;
    @FindBy(xpath = "//*[@id='billing_state']") public WebElement ddmBillingAddressStateNT;
    @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement billingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement billingPhoneKutusuNT;
    @FindBy(xpath = "//*[@id='billing_email']") public WebElement billingEMailKutusuNT;
    @FindBy(xpath = "//button[@name='save_address']") public WebElement billingSaveAddressButtonNT;




























    //Suna - 190
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement ilkGirisSignInSuna;
    @FindBy(css = "#username")
    public WebElement UsernameOrEmailTextBoxSuna;
    @FindBy(css = "#password")
    public WebElement passwordBoxSuna;
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement ikinciSignInButtonSuna;
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccountLinkSuna;
    @FindBy(xpath = "//a[text()='Account details']")
    public WebElement accountDetailsLinkSuna;
    @FindBy(xpath = "(//h4)[2]")
    public WebElement accountDetailsBasligiSuna;
    @FindBy(css="#account_first_name")
    public WebElement firstNameSuna;
    @FindBy(css="#account_last_name")
    public WebElement lastNameSuna;
    @FindBy(css="#account_display_name")
    public WebElement displayNameSuna;
    @FindBy(css="#account_email")
    public WebElement emailAdressSuna;
    @FindBy(xpath="//button[@name='save_account_details']")
    public WebElement saveChangesButtonSuna;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement basariliYazisi1Suna;
    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement biographyBolumuSuna;






























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
