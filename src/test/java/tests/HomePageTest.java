package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;


public class HomePageTest extends TestBase {
    HomePage home;

    @BeforeMethod
    public void setUp () {
        initializer();
        home = new HomePage();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void verifyHomePageTitle () {
        SeleniumUtils.waitForVisibility(home.searchField);
        Assert.assertEquals(driver.getTitle(), "Nike. Just Do It. Nike.com");
    }
}
