package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopMenuSector {
    @FindBy(how = How.XPATH, using = "id(\"header\")//img")
    private WebElement imgLinkTopHomePage;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356554\")")
    private WebElement topMenuItemFirst;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356555\")")
    private WebElement topMenuItemSecond;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356557\")")
    private WebElement topMenuItemThird;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356552\")")
    private WebElement topMenuItemFourth;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem400585\")")
    private WebElement topMenuItemFifth;


    @FindBy(how = How.XPATH, using = "id(\"mainmenuamenuitem356621\")")
    private WebElement topMenuItemLast;


}
