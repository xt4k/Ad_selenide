package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterSector {

    @FindBy(how = How.XPATH, using = ".//div//a[@href='http://www.custompublish.com/']")
    private WebElement linkBottomPowered;

    @FindBy(how = How.XPATH, using = ".//div//a[@href='#']")
    private WebElement linkBottomDesigned;

    @FindBy(how = How.XPATH, using = ".//div[contains(@class,'banner12')]/a")
    private WebElement BottomRefsCustStats;

    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'facebook')]/img")
    private WebElement linkBottomFaceBook;

    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'twitter')]/img")
    private WebElement linkBottomTwitter;

    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'linkedin')]/img")
    private WebElement linkBottomLinkedIn;

    @FindBy(how = How.XPATH, using = "id(\"footer\")//div[@class='chat']/a/img")
    private WebElement linkLiveChat;

}
