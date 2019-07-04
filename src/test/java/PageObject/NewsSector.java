package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsSector {

    @FindBy(how = How.XPATH, using = "id(\"main\")/div/a")
    private WebElement linkNewsChTop;


    @FindBy(how = How.XPATH, using = "id(\"dynimage0\")")
    private WebElement imgLinkNewsFirst;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article0 large-3')]//h2/a")
    private WebElement linkNewsFirst;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article0')]//a[@class='linker']")
    private WebElement linkReadMoreNewsFirst;


    @FindBy(how = How.XPATH, using = "id(\"dynimage1\")")
    private WebElement imgLinkNewsSecond;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article1 large-3')]//h2/a")
    private WebElement linkNewsSecond;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article3')]//a[@class='linker']")
    private WebElement linkReadMoreNewsSecond;


    @FindBy(how = How.XPATH, using = "id(\"dynimage2\")")
    private WebElement imgLinkNewsThird;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article2 large-3')]//h2/a")
    private WebElement linkNewsThird;


    @FindBy(how = How.XPATH, using = "id(\"main\")/div[3]/div[3]/div[2]/a[1]")
    private WebElement linkReadMoreNewsThird;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article3 large-3')]//h2/a")
    private WebElement linkNewsFourth;


    @FindBy(how = How.XPATH, using = "id(\"dynimage3\")")
    private WebElement imgLinkNewsFourth;


    @FindBy(how = How.XPATH, using = "id(\"main\")/div[3]/div[4]/div[2]/a[1]")
    private WebElement linkReadMoreNewsFourth;


}
