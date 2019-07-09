package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerLogin
{
    @FindBy(how=How.ID, using="amenuitem378938")
    private WebElement contentItemCloudLogin;

    @FindBy(how=How.ID, using="amenuitem378939")
    private WebElement contentItemServiceDesk;

    @FindBy(how=How.ID, using="sidemenuamenuitem378938")
    private WebElement menuItemCloudLogin;

    @FindBy(how=How.ID, using="sidemenuamenuitem378939")
    private WebElement menuItemServiceDesk;

    @FindBy(how=How.ID, using="sidemenuamenuitem378947")
    private WebElement menuItemCustomer;

    @FindBy(how=How.ID, using="sidemenuamenuitem378948")
    private WebElement menuItemEmployee;

}
