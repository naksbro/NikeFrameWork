package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class MensPage extends TestBase {
    public MensPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "TypeaheadSearchInput")
    public WebElement searchField;

    @FindBy (xpath = "(//div[@class='ncss-col-sm-4 va-sm-m'])[2]")
    public WebElement mensShoe;

    @FindBy (className = "_1ZsY6zh2")
    public WebElement pageTitle;

    public void searchForShoe (String shoe) {
        SeleniumUtils.sendKeys(searchField, shoe);
    }

    public void clickMensShoe () {
        searchForShoe("presto");
        SeleniumUtils.waitForVisibility(mensShoe);
        SeleniumUtils.clickElement(mensShoe);
    }
}
