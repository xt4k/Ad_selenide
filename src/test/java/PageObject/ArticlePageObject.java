package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ArticlePageObject {

    @FindBy(how = How.XPATH, using = "id(\"dynimage7\")")
    private WebElement roundImgLinkArticle;


    @FindBy(how = How.XPATH, using = "id(\"main\")//h1/a[@style='null']")
    private WebElement linkInRoundArticle;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article0 large-4')]//h2/a")
    private WebElement linkArticleFirst;


    @FindBy(how = How.XPATH, using = "id(\"dynimage4\")")
    private WebElement iconLinkArticleFirst;


    @FindBy(how = How.XPATH, using = "id(\"dynimage5\")")
    private WebElement iconLinkArticleSecond;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article1 large-4')]//h2/a")
    private WebElement linkArticleSecond;


    @FindBy(how = How.XPATH, using = "id(\"dynimage6\")")
    private WebElement iconLinkArticleThird;


    @FindBy(how = How.XPATH, using = ".//*[contains(@class,'article2 large-4')]//h2/a")
    private WebElement linkArticleThird;


}
