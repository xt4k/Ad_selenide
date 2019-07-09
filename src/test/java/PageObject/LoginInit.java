package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginInit
{
    @FindBy(how=How.XPATH, using="id(\"amenuitem378947\")")
    private WebElement contentItemCustomer;


    @FindBy(how=How.XPATH, using="id(\"amenuitem378948\")")
    private WebElement contentItemEmployee;


    @FindBy(how=How.ID, using="sidemenuamenuitem378947")
    private WebElement menuItemCustomer;


    @FindBy(how=How.ID, using="sidemenuamenuitem378948")
    private WebElement menuItemEmployee;

}
