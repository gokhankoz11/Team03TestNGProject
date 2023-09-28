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
        @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
        public WebElement singInIlyas;
        @FindBy(xpath = "//*[@id='username']")
        public WebElement emailIlyas;
        @FindBy(xpath = "//*[@class='login logout inline-type']")
        public WebElement singOutIlyas;
        @FindBy(linkText = "Store Manager")
        public WebElement storeManagerIlyas;
        @FindBy(xpath = "(//*[@class='text'])[6]")
        public WebElement couponsButtonIlyas;
        @FindBy(xpath = "(//*[@class='text'])[10]")
        public WebElement paymentsButtonIlyas;
        @FindBy(id = "add_new_coupon_dashboard")
        public WebElement addNewButtonIlyas;
        @FindBy(xpath = "//*[@id='title']")
        public WebElement codeAlaniIlyas;
        @FindBy(xpath = "(//input)[7]")   //*[@type='checkbox'])[1]
        public WebElement freeShippingIlyas;
        @FindBy(xpath = "(//input)[8]")
        public WebElement showOnStoreIlyas;

        @FindBy(xpath = "//*[@name='submit-data']")     //input)[21]
        public WebElement submitIlyas;
        @FindBy(xpath = "//*[@class='coupon-types coupon-types-percent']")
        public WebElement percentageDiscount;






















    //Ayse - 130
    @FindBy(xpath ="//*[@class='register inline-type']") public WebElement registerLinkAyse;
    @FindBy(css = "#reg_email") public WebElement emailTabAyse;
    @FindBy(css = "#reg_username") public WebElement usernameTabAyse;
    @FindBy(css = "#reg_password") public WebElement passwordTabAyse;
    @FindBy(css = "#register-policy") public WebElement registerPolicyAyse;
    @FindBy(css = ".woocommerce-Button") public WebElement signUpAyse;
    @FindBy(xpath = "//*[@id='header']/div/section/div/div[1]/div/div/div/p") public WebElement welcomeHeadAyse;
    @FindBy(css = "div.login-popup") public WebElement loginPopupAyse;









    //Nuriye - 160
    @FindBy(xpath = "//a[@class='login inline-type']") public WebElement signinNT;  @FindBy(xpath = "//*[@id='username']") public WebElement userNameNT;
    @FindBy(xpath = "//*[@id='menu-item-1079']") public WebElement myAccountNT; @FindBy(xpath = "(//li)[8]") public WebElement addressesButtonNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingAddressAddButtonNT; @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement billingAddressFirstNameNT;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement billingLastNameKutusuNT;   @FindBy(xpath = "//*[@id='billing_company']") public WebElement billingCompanyKutusuNT;
    @FindBy(xpath = "//select[@id='billing_country']") public WebElement ddmBillingAddressCountryNT;  @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement billingStreetAddressKutusu1NT;
    @FindBy(xpath = "//input[@id='billing_address_2']") public WebElement billingStreetAddressKutusu2NT;  @FindBy(xpath = "//*[@id='billing_city']") public WebElement billingTownCityKutusuNT;
    @FindBy(xpath = "//select[@id='billing_state']") public WebElement ddmBillingAddressStateNT;  @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement billingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement billingPhoneKutusuNT; @FindBy(xpath = "//button[@name='save_address']") public WebElement billingSaveAddressButtonNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingEditYourAddressNT;  @FindBy(xpath = "//*[@data-id='billing_first_name']") public WebElement billingFirstNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_last_name']") public WebElement billingLastNameUyariMesajiNT; @FindBy(xpath = "//*[@data-id='billing_address_1']") public WebElement billingStreetaddressUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_postcode']") public WebElement billingPostCodeUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_city']") public WebElement billingTownCityUyariMesajiNT;        @FindBy(xpath = "//*[@data-id='billing_phone']") public WebElement billingPhoneUyariMesajiNT;
    @FindBy(xpath = "//*[@class='fas fa-check']") public WebElement addressSuccessfullyNT;      @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingAddressAddButtonNT;
    @FindBy(xpath = "//*[@id='shipping_first_name']") public WebElement shippingAddressFirstNameNT; @FindBy(xpath = "//*[@id='shipping_last_name']") public WebElement shippingLastNameKutusuNT;
    @FindBy(xpath = "//*[@id='shipping_company']") public WebElement shippingCompanyKutusuNT;
    @FindBy(xpath = "//input[@id='shipping_address_1']") public WebElement shippingStreetAddressKutusu1NT;   @FindBy(xpath = "//input[@id='shipping_address_2']") public WebElement shippingStreetAddressKutusu2NT;
    @FindBy(xpath = "//*[@id='shipping_city']") public WebElement shippingTownCityKutusuNT;     @FindBy(xpath = "//*[@id='shipping_postcode']") public WebElement shippingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@data-id='shipping_first_name']") public WebElement shippingFirstNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_last_name']") public WebElement shippingLastNameUyariMesajiNT;    @FindBy(xpath = "//*[@data-id='shipping_address_1']") public WebElement shippingStreetaddressUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_postcode']") public WebElement shippingPostCodeUyariMesajiNT;    @FindBy(xpath = "//*[@data-id='shipping_city']") public WebElement shippingTownCityUyariMesajiNT;





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
    @FindBy(xpath="//*[@class='register inline-type']")
    public WebElement registerButton_ofa;
    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']//a")
    public WebElement becomeVendorButton_ofa;
    @FindBy(id ="user_email")
    public WebElement regEmailBox_ofa;
    @FindBy(id ="passoword")
    public WebElement regPasswordBox_ofa;
    @FindBy(id ="confirm_pwd")
    public WebElement regPasswordConf_ofa;
    @FindBy(name ="save-data")
    public WebElement regButton_ofa;
    @FindBy(xpath = "//*[@class='wcfm_email_verified']//input")
    public WebElement verCode_ofa;









    //Ridvan - 250
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]") public WebElement signinButton_rk;
    @FindBy(xpath = "//*[@id='username']") public WebElement emailBox_rk;
    @FindBy(xpath = "//*[@id='password']") public WebElement passwordBox_rk;
    @FindBy(xpath = "//*[@type='submit']") public WebElement girisButonu_rk;
    @FindBy(xpath = "//*[@class='logo']") public WebElement anasayfaLogo_rk;
    @FindBy(xpath = "//*[@id='menu-item-1079']") public WebElement myAccountButton_rk;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/store-manager/']") public WebElement storeManagerButton_rk;
    @FindBy(xpath = "//*[@class='wcfmfa fa-gift'] ") public WebElement couponButton_rk;
    @FindBy(xpath = "(//*[@class='text'])[18]") public WebElement addNewCouponButton_rk;
    @FindBy(xpath = "//*[@class='showcoupon']") public WebElement enterYourCoupon_rk;
    @FindBy(xpath = "//*[@class='btn button btn-rounded btn-default']") public WebElement applyCouponButton_rk;
    @FindBy(xpath = "//*[@id='coupon_code']") public WebElement couponCodeBox_rk;
    @FindBy(xpath = "(//*[@class='wcfm-text wcfm_ele'])[1]") public WebElement codeCouponBox_rk;
    @FindBy(xpath="//*[@id='coupon_amount']") public WebElement couponAmountBox_rk;
    @FindBy(xpath = "//*[@id='expiry_date']") public WebElement couponExpiryDateBox_rk;
    @FindBy(xpath = "(//input)[7]") public WebElement freeShippingBox_rk;
    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]") public WebElement cartButton_rk;
    @FindBy(xpath="//*[@class='button checkout wc-forward']") public WebElement checkoutButton_rk;
    @FindBy(xpath = "//*[@class='checkout_coupon woocommerce-form-coupon']//p") public WebElement applyText_rk;
    @FindBy(xpath = "(//*[@type='submit'])[2]") public WebElement applyCoupon_rk;
    @FindBy(xpath = "//h3[1]") public WebElement billingsDetail_rk;
    @FindBy(xpath = "//*[@id='order_review_heading']") public WebElement orderReviewHeading_rk;
    @FindBy(xpath = "//*[@class='order-total']") public WebElement orderTotal_rk;
    @FindBy(xpath = "(//*[@class='input-radio'])[1]") public WebElement wireTransfer_rk;
    @FindBy(xpath = "//*[@name='woocommerce_checkout_place_order']") public  WebElement placeOrderButton_rk;
    @FindBy(xpath= "//*[@name='coupon_code']") public WebElement getCouponCodeBox_rk;
    @FindBy(xpath = "//*[@role='alert']") public WebElement alertButton_rk;
    @FindBy(xpath = "//*[@class='woocommerce-order']//p") public WebElement thankyou_rk;
    @FindBy(xpath = "(//h2)[1]") public WebElement orderDetails_rk;
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
    @FindBy(xpath = "//*[@class='breadcrumb']") public WebElement AddToCardDogrulama;













    //Gökhan - 310






















}
