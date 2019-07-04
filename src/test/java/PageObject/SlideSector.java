package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SlideSector {
    @FindBy(how = How.XPATH, using = "id(\"dynimage8\")")
    private WebElement dinCentralSlide0;


    @FindBy(how = How.XPATH, using = "id(\"dynimage9\")")
    private WebElement dinCentralSlide1;


    @FindBy(how = How.XPATH, using = "id(\"dynimage10\")")
    private WebElement dinCentralSlide2;


    @FindBy(how = How.XPATH, using = "id(\"dynimage11\")")
    private WebElement dinCentralSlide3;


    @FindBy(how = How.XPATH, using = ".//div[@data-slick-index=\"0\"]//h1/a")
    private WebElement dinCentralSlide0Link;


    @FindBy(how = How.XPATH, using = ".//div[@data-slick-index=\"1\"]//h1/a")
    private WebElement dinCentralSlide1Link;


    @FindBy(how = How.XPATH, using = ".//div[@data-slick-index=\"2\"]//h1/a")
    private WebElement dinCentralSlide2Link;


    @FindBy(how = How.XPATH, using = ".//div[@data-slick-index=\"3\"]//h1/a")
    private WebElement dinCentralSlide3Link;


}
