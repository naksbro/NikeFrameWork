package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MensPage;
import pages.ShoePage;
import utils.SeleniumUtils;

public class ShoePageTest extends TestBase {
    ShoePage shoe;
    MensPage mens;
    HomePage home;

    @BeforeMethod
    public void setUp () {
        initializer();
        shoe = new ShoePage();
        mens = new MensPage();
        home = new HomePage();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void verifySearchResults () {
        home.clickMensTab();
        mens.clickMensShoe();
        shoe.clickAddToCart();
        Assert.assertEquals(SeleniumUtils.getText(shoe.addedToCart),"Added to Cart");
    }
}
