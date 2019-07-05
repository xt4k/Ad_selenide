package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterSector {

    @FindBy(how = How.XPATH, using = ".//div//a[@href='http://www.custompublish.com/']")
    private WebElement linkBottomPowered;

    @FindBy(how = How.XPATH, using = ".//div//a[@href='#']")
    private WebElement linkBottomDesigned;

    @FindBy(how = How.XPATH, using = "id(\"footer\")//div[@class='chat']/a/img")
    private WebElement linkLiveChat;

}
