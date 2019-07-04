package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmailSidebar {

    @FindBy(how = How.XPATH, using = "id(\"sidebarelement2_1\")/p[1]/span[1]/span[1]/a[1]/u[1]")
    private WebElement linkSendMail;

}
