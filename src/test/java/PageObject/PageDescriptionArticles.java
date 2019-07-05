package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageDescriptionArticles {

    @FindBy(how = How.ID, using = "dynimage0")
    private WebElement iconArtickeFirst;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article0')]//h1/a")
    private WebElement linkArticleFirst;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article0')]/span/a")
    private WebElement linkReadMoreArticleFirst;


    @FindBy(how = How.ID, using = "dynimage1")
    private WebElement iconArticleSecond;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article1')]//h1/a")
    private WebElement linkArticleSecond;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article1')]/span/a")
    private WebElement linkReadMoreArticleSecond;


    @FindBy(how = How.ID, using = "dynimage2")
    private WebElement iconArticleThird;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article2')]//h1/a")
    private WebElement linkArticleThird;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article2')]/span/a")
    private WebElement linkReadMoreArticleThird;

}