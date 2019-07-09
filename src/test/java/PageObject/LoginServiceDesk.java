package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginServiceDesk
{
    @FindBy(how=How.ID, using="loginuserid")
    private WebElement textFieldEmail;

    @FindBy(how=How.ID, using="loginuserpassid")
    private WebElement textFieldPassword;

    @FindBy(how=How.XPATH, using="//input[@name=\"login\"]")
    private WebElement btnLogin;

    @FindBy(how=How.ID, using="forgotlink")
    private WebElement linkForgotPassword;

}