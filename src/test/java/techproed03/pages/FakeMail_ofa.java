package techproed03.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed03.utilities.Driver;

public class FakeMail_ofa {
    public FakeMail_ofa(){PageFactory.initElements(Driver.getDriver(),this);}

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
    public WebElement fakeBack_ofa;
}
