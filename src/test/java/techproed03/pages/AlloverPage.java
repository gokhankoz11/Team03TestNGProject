package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

import javax.xml.xpath.XPath;


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
@FindBy(xpath = "//a[@class='login inline-type']")
public WebElement signIN;





























    //Suna - 190





























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

    @FindBy(xpath = "//*[@class='fc-button-label']")
    public WebElement consentFakemail_ofa;
    @FindBy(xpath = "//*[@class='col-xs-0 col-md-2 hidden-mobile']//div")
    public WebElement copyMail_ofa;
    @FindBy(xpath = "//*[@class='color cetc hidden-mobile']")
    public WebElement copyPass_ofa;
    @FindBy(id = "body_content_inner")
    public WebElement code_ofa;
    @FindBy(id = "schranka")
    public WebElement mailBox_ofa;
    @FindBy(xpath = "//*[@class='col-xs-2 maxWidth text-center vertical-middle flex-text-left']//span")
    public WebElement fakeBack;


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

























    //Gökhan - 310






















}
