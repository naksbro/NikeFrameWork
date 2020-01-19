package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

import java.util.List;

public class ShoePage extends TestBase {
    public ShoePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "(//a[@class='colorway-anchor'])[8]")
    public WebElement shoeColor;

    @FindBy (xpath = "//label[@class='css-xf3ahq']")
    public List<WebElement> shoeSizes;

    @FindBy (xpath = "//button[@aria-label='Add to Cart']")
    public WebElement addCartBtn;

    @FindBy (xpath = "//div[@class='headline-4 AddToCartSuccessHeader']")
    public WebElement addedToCart;

    public void chooseColor () {
        SeleniumUtils.clickElement(shoeColor);
    }

    public void chooseSize () {
        chooseColor();
        for (WebElement we : shoeSizes) {
            if (we.getText().equals("9.5"))
                SeleniumUtils.clickElement(we);
        }
    }

    public void clickAddToCart () {
        chooseSize();
        SeleniumUtils.clickElement(addCartBtn);
    }
}
