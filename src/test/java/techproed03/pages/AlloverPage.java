package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

import java.util.List;


public class AlloverPage {
    public AlloverPage(){
        PageFactory.initElements(Driver.getDriver(),this);


        //!!!Kesinlikle ctrl+L yapmayalim!!!   _________  !!!Branch'imiza dikkat edelim sahsi düzenlemelerde kendi branchimizla calisalim!!!
    }
    //public AlloverPage anaSayfa = new AlloverPage();
    //Hakan Oguz - 40
    @FindBy (xpath = "//*[text()='Register']")   public WebElement registerButonuHkn;     @FindBy(xpath = "//span[.='Sign In']")    public WebElement signInHkn;
    @FindBy(xpath = "(//input[@type='password'])[1]")    public WebElement passwordRegistrationHkn;    @FindBy(xpath = "//*[@id='customer_login']")    public WebElement signInPopUpHkn;
    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")    public WebElement signInButtonHkn;    @FindBy(xpath = "//*[@class='account']")    public WebElement signOutButonuHkn;
    @FindBy(xpath = "(//a[@href='https://allovercommerce.com/vendor-register/'])[2]")    public WebElement becomeVendorHkn;    @FindBy(xpath = "(//h2)[1]")    public WebElement vendorRegistrationYazisiHkn;
    @FindBy(xpath = "//input[@id='username']")    public WebElement usernameKutusuHkn;    @FindBy(xpath = "//*[@id='password']")    public WebElement passwordHkn;
    @FindBy(xpath = "(//h2)[1]")    public WebElement myAccountYazisiHkn;    @FindBy(xpath = "//*[@id='password_strength']")    public WebElement passwordSeviyeHkn;
    @FindBy(id = "password_strength")    public WebElement verifyPasswordHkn;    @FindBy(xpath = "//*[text()='Dashboard']")    public WebElement dashboardTextHkn;
    @FindBy(xpath = "//*[.='Store Manager']")    public WebElement storeManagerTextHkn;
    @FindBy(xpath = "//h2[1]")   public WebElement storeManagerBaslikHkn;
    @FindBy(xpath = "(//*[.='Orders'])[1]")    public WebElement orderTextHkn;
    @FindBy(xpath = "(//h4)[2]")    public WebElement orderBaslikHkn;
    @FindBy(xpath ="//*[.='Downloads']")    public WebElement downloadsTextHkn;
    @FindBy(xpath = "(//*[h4])[2]")    public WebElement downloadsBaslikHkn;
    @FindBy(xpath = "(//*[.='Addresses'])")    public WebElement addressesTextHkn;
    @FindBy(xpath = "(//h4)[2]")    public WebElement addressesBaslikHkn;
    @FindBy(xpath = "//*[.='Account details']")    public WebElement accountDetailstextHkn;
    @FindBy(xpath = "(//h4)[2]")    public WebElement accountDetailsBaslikHkn;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/wishlist/'])[2]")    public WebElement wishlistTextHkn;
    @FindBy(xpath = "(//h2)[1]")    public WebElement wishlistBaslikHkn;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/my-account-2/support-tickets/']")    public WebElement supportTicketsTextHkn;
    @FindBy(xpath = "//*[@data-title='Ticket(s)']")    public WebElement ticketsStatusHkn;
    @FindBy(xpath = "//*[.='Followings']")    public WebElement followingsTextHkn;
    @FindBy(xpath = "//*[.='Followings']")    public WebElement followingStoreHkn;
  @FindBy(xpath = "//*[.='Logout']")    public WebElement logoutTextHkn;























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
        @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
        public WebElement verifyCodeMassegeIlyas;
































    //Ayse - 130
    @FindBy(xpath ="//*[@class='register inline-type']") public WebElement registerLinkAyse;
    @FindBy(css = "#reg_email") public WebElement emailTabAyse;
    @FindBy(css = "#reg_username") public WebElement usernameTabAyse;
    @FindBy(css = "#reg_password") public WebElement passwordTabAyse;
    @FindBy(css = "#register-policy") public WebElement registerPolicyAyse;
    @FindBy(css = ".woocommerce-Button") public WebElement signUpAyse;
    @FindBy(xpath = "//*[@id='header']/div/section/div/div[1]/div/div/div/p") public WebElement welcomeHeadAyse;
    @FindBy(css = "div.login-popup") public WebElement loginPopupAyse;
    @FindBy(xpath = "(//p[@class='submit-status'])[2]") public WebElement alreadyRegistredMessage;









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
    @FindBy(xpath = "//select[@id='billing_state']") public WebElement ddmBillingAddressStateNT;
    @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement billingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement billingPhoneKutusuNT;
    @FindBy(xpath = "//button[@name='save_address']") public WebElement billingSaveAddressButtonNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingEditYourAddressNT;
    @FindBy(xpath = "//*[@data-id='billing_first_name']") public WebElement billingFirstNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_last_name']") public WebElement billingLastNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_address_1']") public WebElement billingStreetaddressUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_postcode']") public WebElement billingPostCodeUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_city']") public WebElement billingTownCityUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='billing_phone']") public WebElement billingPhoneUyariMesajiNT;
    @FindBy(xpath = "//*[@class='fas fa-check']") public WebElement addressSuccessfullyNT;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingAddressAddButtonNT;
    @FindBy(xpath = "//*[@id='shipping_first_name']") public WebElement shippingAddressFirstNameNT;
    @FindBy(xpath = "//*[@id='shipping_last_name']") public WebElement shippingLastNameKutusuNT;
    @FindBy(xpath = "//*[@id='shipping_company']") public WebElement shippingCompanyKutusuNT;
    @FindBy(xpath = "//input[@id='shipping_address_1']") public WebElement shippingStreetAddressKutusu1NT;
    @FindBy(xpath = "//input[@id='shipping_address_2']") public WebElement shippingStreetAddressKutusu2NT;
    @FindBy(xpath = "//*[@id='shipping_city']") public WebElement shippingTownCityKutusuNT;
    @FindBy(xpath = "//*[@id='shipping_postcode']") public WebElement shippingZipCodeKutusuNT;
    @FindBy(xpath = "//*[@data-id='shipping_first_name']") public WebElement shippingFirstNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_last_name']") public WebElement shippingLastNameUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_address_1']") public WebElement shippingStreetaddressUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_postcode']") public WebElement shippingPostCodeUyariMesajiNT;
    @FindBy(xpath = "//*[@data-id='shipping_city']") public WebElement shippingTownCityUyariMesajiNT;









    //Suna - 190
    @FindBy(xpath = "//span[text()='Sign In']") public WebElement ilkGirisSignInSuna; @FindBy(css = "#username") public WebElement UsernameOrEmailTextBoxSuna;
    @FindBy(css = "#password") public WebElement passwordBoxSuna; @FindBy(xpath = "(//button[@type='submit'])[1]") public WebElement ikinciSignInButtonSuna;
    @FindBy(xpath = "//a[text()='My Account']") public WebElement myAccountLinkSuna; @FindBy(xpath = "//a[text()='Account details']") public WebElement accountDetailsLinkSuna;
    @FindBy(xpath = "(//h4)[2]") public WebElement accountDetailsBasligiSuna; @FindBy(css="#account_first_name") public WebElement firstNameSuna;
    @FindBy(css="#account_last_name") public WebElement lastNameSuna; @FindBy(css="#account_display_name") public WebElement displayNameSuna;
    @FindBy(css="#account_email") public WebElement emailAdressSuna; @FindBy(xpath="(//*[@type='submit'])[2]") public WebElement saveChangesButtonSuna;
    @FindBy(xpath = "//*[@role='alert']") public WebElement basariliYazisi1Suna; @FindBy(xpath = "//body[@id='tinymce']") public WebElement biographyBolumuSuna;
    @FindBy(css = "#password_current") public WebElement currentPasswordSuna; @FindBy(css = "#password_1") public WebElement newPasswordSuna;
    @FindBy(css = "#password_2") public WebElement confirmPasswordSuna; @FindBy(xpath = "//*//*[@role='alert']") public WebElement basariliYazisi2Suna;
    @FindBy(xpath = "//a[text()='Store Manager']") public WebElement storeManagerButtonSuna; @FindBy(xpath = "(//span[@class='text'])[4]") public WebElement productsSuna;
    @FindBy(xpath = "(//div//span//a)[2]") public WebElement productsAddNewSuna; @FindBy(css="#product_type") public WebElement productTypeOptionsSuna;
    @FindBy(css ="#featured_img_display") public WebElement buyukResimKutusuSuna; @FindBy(css = "#__wp-uploader-id-1") public WebElement selectFilesSuna;
    @FindBy(xpath = "(//button[@type='button'])[83]") public WebElement buyukResimSelectSuna; @FindBy(css = "#pro_title") public WebElement productTitleSuna;

    @FindBy(xpath = "(//body[@id='tinymce'])[1]") public WebElement shortDescriptionSuna; @FindBy(xpath = "//body[@data-id='description']") public WebElement descriptionSuna;
    @FindBy(xpath = "//div[@class='wcfm_product_manager_cats_checklist_fields']") public List<WebElement> categoriesListSuna;
    @FindBy(xpath = "(//span[@class='wcfmfa fa-arrow-circle-right sub_checklist_toggler'])[2]") public List<WebElement> categoriesOklariSuna;
    @FindBy(xpath = "(//*[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[1]") public WebElement addNewCategorySuna;
    @FindBy(css = "#wcfm_new_cat") public WebElement categoryNameBoxSuna; @FindBy(xpath = "//*[@id='wcfm_new_parent_cat']") public WebElement parentCategorySuna;
    @FindBy(xpath = "(//*[text()='Add'])[1]") public WebElement addParentCategorySuna; @FindBy(xpath = "(//*[text()='Product brands'])[1]") public WebElement productBrandsBoxSuna;

    @FindBy(xpath = "//*[@class='wcfm-checkbox checklist_type_product_brand ']") public List<WebElement> productBrandsListSuna;
    @FindBy(xpath = "(//span[@class='wcfmfa fa-arrow-circle-right sub_checklist_toggler'])") public List<WebElement> productBrandsOklariSuna;
    @FindBy(xpath = "//*[text()='+Add new Product brands']") public WebElement addNewProductBrandsSuna; @FindBy(xpath = "//input[@name='wcfm_new_product_brand']") public WebElement productBrandsNameBoxSuna;
    @FindBy(xpath = "//*[@name='wcfm_new_parent_product_brand']") public WebElement parentTaxonomySuna; @FindBy(xpath = "(//*[text()='Add'])[2]") public WebElement addButtonProductBrandsSuna2;







    // @FindBy(xpath = "//*[@id='billing_email']") public WebElement billingEMailKutusuNT;











































    //Omer - 220
    @FindBy(xpath="//*[@class='register inline-type']") public WebElement registerButton_ofa;
    @FindBy(xpath = "(//*[@class='account']//a)[1]") public WebElement signInButton_ofa;
    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']//a") public WebElement becomeVendorButton_ofa;
    @FindBy(id ="user_email") public WebElement regEmailBox_ofa;
    @FindBy(id ="passoword") public WebElement regPasswordBox_ofa;
    @FindBy(id ="confirm_pwd") public WebElement regPasswordConf_ofa;
    @FindBy(name ="save-data") public WebElement regButton_ofa;
    @FindBy(xpath = "//*[@class='wcfm_email_verified']//input") public WebElement verCode_ofa;
    @FindBy(xpath = "//*[@class='wc-setup-actions step']//a[2]") public WebElement notrightnowButton_ofa;
    @FindBy(xpath = "//*[@class='logo']") public WebElement logo_ofa;
    @FindBy(xpath = "//*[@id='menu-item-1079']//a") public WebElement myAccount_ofa;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']") public WebElement addressesButton_ofa;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/my-account-2/edit-address/billing/']") public WebElement addButton_ofa;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/my-account-2/edit-address/shipping/']") public WebElement s_addButton_ofa;
    @FindBy(xpath = "(//*[@class='input-text '])[1]") public WebElement firstnameButton_ofa;

    @FindBy(xpath = "(//*[@role='textbox'])[1]") public WebElement countryMenu_ofa;
    @FindBy(xpath = "//*[@class='select2-search__field']") public WebElement cmBox_ofa;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement billingstreetBox_ofa; @FindBy(xpath = "//*[@id='shipping_address_1']") public WebElement shippingstreetBox_ofa;
    @FindBy(xpath = "//*[@id='billing_city']") public WebElement billingcityBox_ofa; @FindBy(xpath = "//*[@id='shipping_city']") public WebElement shippingcityBox_ofa;
    @FindBy(xpath = "//*[@id='billing_postcode_field']//span//input") public WebElement billingpostcodeBox_ofa; @FindBy(xpath = "//*[@id='shipping_postcode_field']//span//input") public WebElement shippingpostcodeBox_ofa;
    @FindBy(xpath = "//*[@class='edit btn btn-link btn-primary btn-underline mb-4']") public WebElement edityba_ofa;
    @FindBy(xpath = "//*[@data-id='billing_first_name']") public WebElement alert_ofa; @FindBy(xpath = "//*[@role='alert']") public WebElement shipalert_ofa;
    @FindBy(xpath = "//*[@data-id='billing_country']") public WebElement countryAlert_ofa; @FindBy(xpath = "//*[@data-id='shipping_first_name']") public WebElement shipnameAlert_ofa;
    @FindBy(xpath = "//*[@data-id='billing_address_1']") public WebElement streetAlert_ofa; @FindBy(xpath = "//*[@data-id='shipping_country']") public WebElement shipcountryAlert_ofa;
    @FindBy(xpath = "//*[@data-id='billing_city']") public WebElement towncityAlert_ofa; @FindBy(xpath = "//*[@data-id='shipping_city']") public WebElement shipcityAlert_ofa;
    @FindBy(xpath = "//*[@data-id='billing_postcode']") public WebElement postcodeAlert_ofa; @FindBy(xpath = "//*[@data-id='shipping_postcode']") public WebElement shippostAlert_ofa;
    @FindBy(xpath = "//*[@data-id='billing_phone']") public WebElement phoneAlert_ofa;

    //Ridvan - 250
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement signinButton_rk;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement emailBox_rk;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox_rk;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girisButonu_rk;

    @FindBy(xpath = "//*[@class='logo']")
    public WebElement anasayfaLogo_rk;

    @FindBy(xpath = "//*[@id='menu-item-1079']")

    public WebElement myAccountButton_rk;

    @FindBy(xpath = "//*[@href='https://allovercommerce.com/store-manager/']")
    public WebElement storeManagerButton_rk;

    @FindBy(xpath = "//*[@class='wcfmfa fa-gift'] ")
    public WebElement couponButton_rk;
    @FindBy(xpath = "(//*[@class='text'])[18]")
    public WebElement addNewCouponButton_rk;
    @FindBy(xpath = "//*[@class='showcoupon']")
    public WebElement enterYourCoupon_rk;

    @FindBy(xpath = "//*[@class='btn button btn-rounded btn-default']")
    public WebElement applyCouponButton_rk;

    @FindBy(xpath = "//*[@id='coupon_code']")
    public WebElement couponCodeBox_rk;

    @FindBy(xpath = "(//*[@class='wcfm-text wcfm_ele'])[1]")
    public WebElement codeCouponBox_rk;

    @FindBy(xpath="//*[@id='coupon_amount']")
    public WebElement couponAmountBox_rk;

    @FindBy(xpath = "//*[@id='expiry_date']")
    public WebElement couponExpiryDateBox_rk;
    @FindBy(xpath = "(//input)[7]")
    public WebElement freeShippingBox_rk;

    // @FindBy(xpath = "//*[@class='wcfm-container wcfm-top-element-container']")
    //      public WebElement addCouponGorulmeli_rk;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement cartButton_rk;

    @FindBy(xpath="//*[@class='button checkout wc-forward']")
    public WebElement checkoutButton_rk;
    @FindBy(xpath = "//*[@class='checkout_coupon woocommerce-form-coupon']//p")
    public WebElement applyText_rk;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement applyCoupon_rk;

    @FindBy(xpath = "//h3[1]")
    public WebElement billingsDetail_rk;

    @FindBy(xpath = "//*[@id='order_review_heading']")
    public WebElement orderReviewHeading_rk;

    @FindBy(xpath = "//*[@class='order-total']")
    public WebElement orderTotal_rk;

    @FindBy(xpath = "(//*[@class='input-radio'])[1]")
    public WebElement wireTransfer_rk;

    @FindBy(xpath = "//*[@name='woocommerce_checkout_place_order']")
    public  WebElement placeOrderButton_rk;
    @FindBy(xpath= "//*[@name='coupon_code']")
    public WebElement getCouponCodeBox_rk;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alertButton_rk;

    @FindBy(xpath = "//*[@class='woocommerce-order']//p")
    public WebElement thankyou_rk;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement orderDetails_rk;




























    //Merve - 280
  @FindBy(xpath ="//span[.='Sign In']") public WebElement SingInButtonMerve;
    @FindBy(xpath = "//input[@id='username']") public WebElement UserNameOrEmailAddress;
    @FindBy(xpath = "//input[@id='password']") public WebElement PasswordM;
    @FindBy(xpath = "//*[@type='submit']") public WebElement SignInButtonMerve2;
    @FindBy(xpath = "(//*[@type='search'])[1]") public WebElement SearchButtonMerve;
    @FindBy(xpath = "(//*[.='Electric Rice-Cooker'])[4]") public WebElement VerifyM;
    @FindBy(xpath = "//*[@name='add-to-cart']") public WebElement AddToCardMerve;
    @FindBy(xpath = "//*[@class='breadcrumb']") public WebElement AddToCardDogrulama;
    @FindBy(xpath = "//*[@class='product-quantity']") public WebElement CardPlusMinus;
    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']") public WebElement CardPlus;
    @FindBy(xpath = "//*[@class='w-icon-cart']") public WebElement CardView;
    @FindBy(xpath = "//*[@class='button wc-forward']") public  WebElement CardView2;
    @FindBy(xpath = "//*[@class='button checkout wc-forward']") public WebElement CheckoutMerve;
    @FindBy(xpath = "//*[@class='breadcrumb']") public WebElement BillingDetailsM;
    @FindBy(xpath = "//*[@id='payment']") public WebElement PaymentMethodsM;
    @FindBy(xpath = "//*[@id='main']") public WebElement OrderCompleteM;
    @FindBy(xpath = "//*[@class='input-text ']") public WebElement FirstNameM;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement LastNameM;
    @FindBy(xpath = "//*[@class='select2-selection__rendered']") public WebElement CountryM;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement StreetAddressM;
    @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement ZipCodeM;
    @FindBy(xpath = "//*[@id='billing_city']") public WebElement CityM;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement PhoneM;
    @FindBy(xpath = "//*[@id='billing_email']")public WebElement EmailM;
    @FindBy(xpath = "//*[@id='place_order']") public WebElement PlaceOrderM;
    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']") public WebElement AlisverisBitti;
    @FindBy(xpath = "//*[.='Compare']") public WebElement CompareM;
    @FindBy(xpath = "//*[.='Search results for “bag”']") public WebElement BagSonucM;
    @FindBy(xpath = "//*[@id='main']") public WebElement AnaSayfaM;
    @FindBy(xpath = "//*[@id='main']/div/div/div/div[4]/ul/li[2]/div/figure/div/a[2]") public WebElement Terazi1;






    //Gökhan - 310
    @FindBy(xpath ="//span[.='Sign In']")
    public WebElement singInButtonGK;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameGK;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordGK;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButtonGK;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutGK;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerGK;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement produktGK;

    @FindBy(xpath = "//span[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement addNewGK;

    @FindBy(xpath = "//*[text()='Simple Product']")
    public WebElement simpleProductGK;

    @FindBy(css = "#regular_price")
    public WebElement priceGK;

    @FindBy(css = "#sale_price")
    public WebElement salePriceGK;
    @FindBy(css = "#pro_title")
    public WebElement producktTitleGK;

    @FindBy(xpath = "(//img[@class='placeHolder'])[1]")
    public WebElement buyukResimGK;

    @FindBy(css = "#menu-item-browse")
    public WebElement mediaLibraryGK;

    @FindBy(xpath = "(//div[@class='thumbnail'])[1]")
    public WebElement resimYukleGK1;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectButtonGK;

    @FindBy(css = "#gallery_img_gimage_0_display")
    public WebElement kucukResimGK;

    @FindBy(xpath= "(//button[@id='menu-item-upload'])[2]")
    public WebElement uploadFilesGK;



    @FindBy(xpath= "(//button[@class='browser button button-hero'])[2]")
    public WebElement selectFilesGK;

    @FindBy(xpath= "(//*[text()='Add to Gallery'])[3]")
    public WebElement addToGalleryGK;

    @FindBy(xpath= "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement addToGalleryGK2;

    @FindBy(css = "#product_cats_checklist")
    public WebElement catagoriesGK;


    @FindBy(xpath= "(//*[@class='media-modal-close'])[4]")
    public WebElement xbuttonGK;

    @FindBy(xpath = "//input[@class='wcfm-text']")
    public WebElement skuGK;

    @FindBy(css = "#manage_stock")
    public WebElement manageStockGK;

    @FindBy(css = "#stock_qty")
    public WebElement stockQtyGK;

    @FindBy(xpath = "#wcfm_products_manage_form_advanced_head")
    public WebElement advancedGK;

    @FindBy(css = "#wcfm_products_simple_draft_button")
    public WebElement draftGK;

    @FindBy(css = "#backorders")
    public WebElement backOrdesGK;

    @FindBy(css = "#sold_individually")
    public WebElement soldIndindividGK;

    @FindBy(css = "#wcfm_products_simple_submit_button")
    public WebElement submitButtonGK;

    @FindBy(xpath = "(//*[@class='wcfm_submit_button'])[1]")
    public WebElement submitButtonGK2;
    @FindBy(xpath = "//div[@class='wcfm-message wcfm-success']")
    public WebElement successfullTextGK;

    @FindBy(css = "#wcfm_products_manage_form_shipping_head")
    public WebElement shippingGK;

    @FindBy(css = "#weight")
    public WebElement weightGK;

    @FindBy(css = "#_wcfmmp_processing_time")
    public WebElement processingTimeGK;

    @FindBy(css = "#length")
    public WebElement lenghtGK;

    @FindBy(css = "#width")
    public WebElement widthGK;

    @FindBy(css = "#height")
    public WebElement heightGK;

    @FindBy(css = "#wcfm_products_manage_form_attribute_head") public WebElement attributesGK;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]") public WebElement attributesGK2;

    @FindBy(css = "#attributes_is_active_1") public WebElement colorGK;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']") public WebElement colorGK2;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") public WebElement colorMenuGK3;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") public WebElement colorMenuGK2;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") public WebElement   colorMenuGK;
    @FindBy(css = "//*[@id='select2-attributes_value_1-result-5btq-711']") public WebElement aaColorGK;

    @FindBy(xpath = "//*[@class='button wcfm_add_attribute_term wcfm_select_all_attributes']") public WebElement selectAllGK;


    @FindBy(xpath = "(//*[@title='Toggle Block'])[2]") public WebElement okButtonGK;
    @FindBy(xpath = "//*[@class='fields_collapser attributes_collapser wcfmfa fa-arrow-circle-down fa-arrow-circle-up']") public WebElement okSizeButtonGK;

    @FindBy(xpath = "(//*[text()='Add New'])[2]") public WebElement addNewColorGK;
    @FindBy(css = "#attributes_is_active_2") public WebElement sizeGK;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]") public WebElement sizeMenuGK;
    @FindBy(xpath = "(//*[text()='Add'])[3]") public WebElement addGK;
    @FindBy(css = "#attributes_name_4") public WebElement addNameGK;

    @FindBy(css = "wcfmfa fa-eye text_tip") public WebElement viewsButtonGK;
    @FindBy(css = ".view_count") public WebElement viewsButtonGK2;
    @FindBy(xpath = "//h1") public WebElement urunTitleGK;






    @FindBy(xpath = "(//i)[8]")
    public WebElement userSignInButton; // sign in locate
    @FindBy(css = "#username")
    public WebElement usernameOrEmailBox; // email box locate
    @FindBy(css = "#menu-item-1079")
    public WebElement myAccount;
    @FindBy(xpath = "(//li)[6]")
    public WebElement storeManagerButton;
    @FindBy(className = "wcfm_menu_wcfm-products")
    public WebElement productsButton;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/products-manage/']")
    public WebElement addNewButton;
    @FindBy(css = "select[id='product_type']")
    public WebElement simpleProductOption;
    @FindBy(xpath = "//input[@id='regular_price']")
    public WebElement priceBox;
    @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salePriceBox;
    @FindBy(xpath = "//strong[text()='Short Description']")
    public WebElement shortDescriptionText;
    @FindBy(xpath = "//input[@name='is_virtual']")
    public WebElement virtualCheckbox;
    @FindBy(css = "input[id='is_downloadable']")
    public WebElement downloadableCheckbox;
    @FindBy(css = "input[id='pro_title']")
    public WebElement productTitleBox;
    @FindBy (xpath = "(//input[@data-super_parent='225'])[1]")
    public WebElement bestSellerCheckbox;
    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement addProductSubmitButton;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement featuredImg;
    @FindBy(id = "__wp-uploader-id-1")
    public WebElement featuredImgSelectFilesButton;
    @FindBy(xpath = "//button[text()='Select']")
    public WebElement featuredImgSelectButton;
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement galleryImg;
    @FindBy(xpath = "//button[@id='__wp-uploader-id-4']")
    //@FindBy(id = "__wp-uploader-id-1")
    public WebElement galleryImgSelectFilesButton;
    @FindBy(xpath = "(//button[@type='button'])[104]")
    //@FindBy(xpath = "(//button[text()='Add to Gallery'])[4]")
    public WebElement galleryImgAddToGalleryButton;
    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]")
    public WebElement galleryImgUpLoadFileButton;






}
