package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

























public class AlloverPage {
    public AlloverPage(){
        PageFactory.initElements(Driver.getDriver(),this);


        //!!!Kesinlikle ctrl+L yapmayalim
    }



    //Hakan Oguz - 40





























    //Sedat - 70





























    //Ilyas - 100





























    //Ayse - 130





























    //Nuriye - 160





























    //Suna - 190





























    //Omer - 220





























    //Ridvan - 250





























    //Merve - 280





























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
    @FindBy(xpath = "(//*[@class='select2-search select2-search--inline'])[2]") public WebElement colorMenuGK2;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") public WebElement colorMenuGK;
    @FindBy(css = "#attributes_is_active_2") public WebElement sizeGK;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]") public WebElement sizeMenuGK;
    @FindBy(xpath = "(//*[text()='Add'])[3]") public WebElement addGK;
    @FindBy(css = "#attributes_name_4") public WebElement addNameGK;






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
