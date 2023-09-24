package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

public class FakeMailPage {
    public FakeMailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//p[@class='fc-button-label'])[1]")
    public WebElement constentAyse;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakeMailAyse;



































}
