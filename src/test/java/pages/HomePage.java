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

    @FindBy (className = "nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m")
    public WebElement mensTab;

    public void clickMensTab () {
        SeleniumUtils.clickElement(mensTab);
    }

}
