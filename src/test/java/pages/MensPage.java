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

    @FindBy (className = "btn-search.z2.bg-transparent")
    public WebElement searchBtn;

    @FindBy (className = "_1ZsY6zh2")
    public WebElement pageTitle;

    public void searchForShoe (String shoe) {
        SeleniumUtils.sendKeys(searchField, shoe);
        SeleniumUtils.clickElement(searchBtn);
    }
}
