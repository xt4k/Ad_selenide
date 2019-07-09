package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeLogin
{
    @FindBy(how=How.ID, using="amenuitem356561")
    private WebElement contentItemSharePoint;


    @FindBy(how=How.ID, using="sidemenuamenuitem378947")
    private WebElement menuItemCustomer;


    @FindBy(how=How.ID, using="sidemenuamenuitem378948")
    private WebElement menuItemEmployee;

    @FindBy(how=How.ID, using="sidemenuamenuitem356561")
    private WebElement menuItemSharepoint;

}
