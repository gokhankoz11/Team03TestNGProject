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
@FindBy(xpath = "//a[@class='login inline-type']")
public WebElement signIN;





























    //Suna - 190





























    //Omer - 220





























    //Ridvan - 250





























    //Merve - 280





























    //Gökhan - 310






















}
