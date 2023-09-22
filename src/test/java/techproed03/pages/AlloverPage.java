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
    @FindBy(xpath="//*[@class='register inline-type']")
    public WebElement registerButton_ofa;
    @FindBy(xpath="//*[@class='nav-link']")
    public WebElement signupButton_ofa;
    @FindBy(linkText = "wcfmmp_become_vendor_link")
    public WebElement becomeVendorButton_ofa;
    @FindBy(xpath ="//*[@type='text']")
    public WebElement regEmailBox_ofa;
    @FindBy(xpath ="//*[@type='password']")
    public WebElement regPasswordBox_ofa;
    @FindBy(name ="save-data")
    public WebElement regButton_ofa;

















    //Ridvan - 250





























    //Merve - 280





























    //Gökhan - 310






















}
