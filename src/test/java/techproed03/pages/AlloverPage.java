package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;
import org.openqa.selenium.support.FindBy;

import java.awt.*;


public class AlloverPage {



    public AlloverPage(){
        PageFactory.initElements(Driver.getDriver(),this);


        //!!!Kesinlikle ctrl+L yapmayalim!!!   _________  !!!Branch'imiza dikkat edelim sahsi düzenlemelerde kendi branchimizla calisalim!!!
    }



    //Hakan Oguz - 40














































    //Sedat - 70
    @FindBy (xpath = "(//*[@class='compare btn-product-icon'])[1]") public WebElement compareTikla; @FindBy(xpath = "(//h3)[42]") public WebElement urunDogrulama1;
    @FindBy(xpath = "//*[.='earphone product']") public WebElement earphoneTikla; @FindBy(xpath = "//*[@class='compare btn-product-icon']") public WebElement earphoneCompare;
    @FindBy(xpath = "(//h3)[8]") public WebElement urunDogrulama2; @FindBy(xpath = "(//*[.='C Vitamini'])[2]") public WebElement cVitaminiTikla;
    @FindBy(xpath = "//*[@class='compare btn-product-icon']") public WebElement cVitaminiCompare; @FindBy(xpath = "(//h3)[11]") public WebElement urunDogrulama3;
    @FindBy(xpath = "(//*[.='Chess'])[4]") public WebElement chessTikla; @FindBy(xpath = "//*[@class='compare btn-product-icon']") public WebElement chessCompare;
    @FindBy(xpath = "//*[.='Compare Products']") public WebElement urunDogrulama4; @FindBy(xpath = "(//*[.='Automatic Crusher'])[4]") public WebElement automaticCrusherTikla;
    @FindBy(xpath = "//*[@class='compare btn-product-icon']") public WebElement automaticCrusherCompare; @FindBy(xpath = "(//h3)[11]") public WebElement urunDogrulama5;
    @FindBy(xpath = "(//*[@class='btn-remove remove_from_compare fas fa-times'])[1]") public WebElement xButtonDelete; @FindBy(xpath = "(//*[.='4'])[2]") public WebElement products4;
    @FindBy(xpath = "//*[@class='compare-clean']") public WebElement cleanAllButton; @FindBy(xpath = "(//*[.='3'])[2]") public WebElement products3;
    @FindBy(xpath = "(//*[.='0'])[7]") public WebElement products0; @FindBy(xpath = "//*[@type='search']") public WebElement serachButton;
    @FindBy(xpath = "(//*[.='Pencil6'])[2]") public WebElement ilkUrunTikla; @FindBy(xpath = "//*[@class='compare btn-product-icon']") public WebElement compareTiklaKalem;
    @FindBy(xpath = "(//*[.='Pencils 4'])[2]") public WebElement ikinciUrunTikla; @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[1]") public WebElement compareTiklaKalem2;
    @FindBy(xpath = "//*[.='Start Compare !']") public WebElement startCompareTikla; @FindBy(xpath = "(//*[.='Compare'])[1]") public WebElement compareDogrula;
    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[3]") public WebElement urunEklendiginiDogrula;
    @FindBy(xpath = "//*[@class='woocommerce-Price-currencySymbol']") public WebElement urunOzellikleriniDogrula;
    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[1]") public WebElement ilkUrunKaldir; @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[1]") public WebElement ikinciUrunKaldir;
    @FindBy(xpath = "(//i)[11]") public WebElement ikinciUrunKaldir2; @FindBy(xpath = "//*[.='No products added to the compare']") public WebElement noProductAdded; @FindBy(xpath = "(//*[.='Men’s Clothing'])[2]") public WebElement mensClothingTikla;
    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[1]") public WebElement kalpButtonTikla; @FindBy(xpath = "//*[@class='w-icon-heart']")  public WebElement wishListButton;
    @FindBy(xpath = "(//*[.='Wishlist'])[2]") public WebElement wishListDogrula; @FindBy(xpath = "//*[.='Home']") public WebElement homeButtonTikla;
    @FindBy(xpath = "//*[@type='search']") public WebElement searchButtonUrunAra; @FindBy(xpath = "(//*[.='Iphone Case'])[2]") public WebElement cikanIlkUrunTikla;
    @FindBy(xpath = "(//*[@rel='nofollow'])[2]") public WebElement kalpButtonTikla2;
    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[1]") public WebElement quickviewClick;
    @FindBy(xpath = "//*[@class='posted_in']") public WebElement urunOzellikDogrulaCase; //@FindBy(xpath = "//*[@name='add-to-cart']") //public WebElement addToCartButton;
    //@FindBy(xpath = "//*[@class='btn btn-sm btn-rounded']") //public WebElement viewCartButton;
    @FindBy(xpath = "(//*[.='Shopping Cart'])[2]") public WebElement shoppingCartIsDisplay;
    @FindBy(xpath = "(//*[.='Iphone Case'])[4]")  public WebElement urunSepeteEklendiginiDogrula;
    @FindBy(xpath = "(//*[@type='button'])[1]") public WebElement xButtonTikla;
//US09_______________________________________________________________________________________________
    @FindBy(xpath = "//a[@href='signup']") public WebElement singUpButtonSedat;  @FindBy(xpath = "//a[.='Become a Vendor']")   public WebElement becomeAVendorButtonSedat;
    @FindBy(xpath = "//h2[.='Vendor Registration']") public WebElement VendorRegistrationTextSedat;    @FindBy(xpath = "//h3[.='MY ACCOUNT']") public WebElement myAccountTextSedat;
    @FindBy(xpath = "//*[.='Wrong username or password.']") public WebElement wrongUsernameOrPasswordSedat;  @FindBy(xpath = "////a[@class ='Sign Out']") public WebElement signOutSedat;
    @FindBy (xpath = "//input[@id=user_email']") public WebElement registrationEmailSedat; @FindBy(xpath= "//*[.='Email Verification Code: This field is required.']") public WebElement emailIsRequiredTextSedat;
    @FindBy(xpath= "//div[@class='wcfm-message email_verification_message']") public WebElement verificationCodeTextSedat; @FindBy(xpath= "//input[@class= 'wcfm-text wcfm_submit_button wcfm_email_verified_button']") public WebElement emailVerifiedButtonSedat;
    @FindBy(xpath= "//input[@class='wcfm-text wcfm_email_verified_input']") public WebElement emailVerifiedInputSedat;  @FindBy(xpath= "//input[@class= '//div[@class='wcfm-message email_verification_message']") public WebElement emailVerificationMassageSedat;
    @FindBy(xpath= "//input[@class='wcfm-text wcfm_ele wcfm_validation_failed']")public WebElement validationFailedSedat;  @FindBy(id = "//p [@class='passoword wcfm_ele wcfm_title']") public WebElement passwordSedat;
    @FindBy(id = "//p[@class='confirm_pwd wcfm_ele_wcfm_title']") public WebElement confirmPasswordSedat;  @FindBy(id = "//div[@id='password_strength']") public WebElement passwordStrengthSedat;
    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']") public WebElement errorMessageSedat; @FindBy(xpath = "//div[contains(text(), 'Password strength should be atleast')]") public WebElement passwordRulesSedat;
    @FindBy(id = "wcfm_membership_register_button") public WebElement registerButtonSedat;   @FindBy(xpath = "//p[.='//*[.='WELCOME TO ALLOVER COMMERCE...']") public WebElement welcomeMessageSedat;
    @FindBy(xpath = "//*[.='Email verification code invalid.']") public WebElement codeInvalidMessageSedat;   @FindBy(xpath = "//*[.='This Email already exists. Please login to the site and apply as vendor.']") public WebElement alreadyExistMessageSedat;
    @FindBy(xpath = "//*[.='Registration Successfully Completed.']") public WebElement registrationSuccessMessageSedat;
    //----------Vendor Registration with Sign In--------------
    @FindBy(id = "username") public WebElement existVendorUsernameSedat;
    @FindBy(id = "password") public WebElement existVendorPasswordSedat;
    @FindBy(xpath = "//button[@name='login']") public WebElement existVendorSignInButtonSedat;
//Ilyas - 100





























    //Ayse - 130





























    //Nuriye - 160





























    //Suna - 190





























    //Omer - 220





























    //Ridvan - 250





























    //Merve - 280





























    //Gökhan - 310






















}
