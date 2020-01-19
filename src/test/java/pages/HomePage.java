package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@aria-controls='NavigationMenu-1']")
    public WebElement mensTab;

    public void clickMensTab () {
        SeleniumUtils.clickElement(mensTab);
    }

}
