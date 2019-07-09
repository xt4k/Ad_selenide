package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsLetter
{

    @FindBy(how=How.XPATH, using="id(\"newslettersubemailx\")")
    private WebElement textFieldEmail;


    @FindBy(how=How.XPATH, using="id(\"popup-box-content\")/p[@class=\"corrector\"]")
    private WebElement errMessage;


    @FindBy(how=How.XPATH, using="//input[@name=\"submit\"]")
    private WebElement btnSubmit;

    @FindBy(how=How.XPATH, using="id(\"popup-close\")")
    private WebElement btnClose;


    @FindBy(how=How.XPATH, using="id(\"popup-box-content\")/h1")
    private WebElement textHeaderPopup;

}
