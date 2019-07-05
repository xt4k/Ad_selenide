package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerStatementsSector {

    @FindBy(how = How.XPATH, using = "id(\"main\")/div[4]/div[2]/a[1]")
    private WebElement linkSeeCustomerStatements;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'Teekay')]")
    private WebElement imgIconCustomer1;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'Crystal')]")
    private WebElement imgIconCustomer2;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'ASC')]")
    private WebElement imgIconCustomer3;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'webskisse')]")
    private WebElement imgIconCustomer4;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'Lindblad')]")
    private WebElement imgIconCustomer5;


    @FindBy(how = How.XPATH, using = ".//div//img[contains(@src,'Allseas')]")
    private WebElement imgIconCustomer6;

}
