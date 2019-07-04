package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideBarSector {


    @FindBy(how = How.XPATH, using = "id(\"sidemenuamenuitem378936\")")
    private WebElement sideMenuItemRecruitment;


    @FindBy(how = How.ID, using = "sidemenuamenuitem356575")
    private WebElement sideMenuItemManagement;


    @FindBy(how = How.ID, using = "sidemenuamenuitem356577")
    private WebElement sideMenuItemPlanning;


    @FindBy(how = How.ID, using = "sidemenuamenuitem356576")
    private WebElement sideMenuItemPayroll;


    @FindBy(how = How.ID, using = "sidemenuamenuitem378940")
    private WebElement sideMenuItemOnboard;


    @FindBy(how = How.ID, using = "sidemenuamenuitem378937")
    private WebElement sideMenuItemEmplPortal;

}
