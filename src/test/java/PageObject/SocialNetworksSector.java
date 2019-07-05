package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SocialNetworksSector {
    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'facebook')]/img")
    private WebElement linkBottomFaceBook;

    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'twitter')]/img")
    private WebElement linkBottomTwitter;

    @FindBy(how = How.XPATH, using = ".//*[contains(@href,'linkedin')]/img")
    private WebElement linkBottomLinkedIn;
}
