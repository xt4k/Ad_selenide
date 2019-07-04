package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShipTriBubbleSector {
    @FindBy(how = How.XPATH, using = "id(\"sidebarelement1_1\")//li[@class='yellow']")
    private WebElement roundFirstShipping;

    @FindBy(how = How.XPATH, using = "id(\"sidebarelement1_1\")//*[@class='blue']")
    private WebElement roundSecondCruiseFerries;

    @FindBy(how = How.XPATH, using = "id(\"sidebarelement1_1\")//*[@class='red']")
    private WebElement roundThirdOffshore;

}
