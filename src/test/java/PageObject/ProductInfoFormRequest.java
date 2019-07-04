package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductInfoFormRequest {

    @FindBy(how = How.XPATH, using = "id(\"el86226\")")
    private WebElement reqTextFieldName;


    @FindBy(how = How.XPATH, using = "id(\"el86227\")")
    private WebElement reqTextFieldPhoneNumber;


    @FindBy(how = How.XPATH, using = "id(\"el86228\")")
    private WebElement reqTextFieldMail;


    @FindBy(how = How.XPATH, using = "id(\"el86229\")")
    private WebElement optTextFieldComment;


    @FindBy(how = How.XPATH, using = "id(\"el189100\")")
    private WebElement optTextFieldHowHearUs1;


    @FindBy(how = How.XPATH, using = "id(\"el189101\")")
    private WebElement optTextFieldHowHearUs2;


    @FindBy(how = How.XPATH, using = "id(\"el189099\")")
    private WebElement optTextFieldHowHearUs3;


    @FindBy(how = How.XPATH, using = "id(\"x__cpssubmitid\")")
    private WebElement btnSubmit;

}

