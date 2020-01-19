package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MensPage;
import utils.SeleniumUtils;

public class MensPageTest extends TestBase {
    MensPage mens;
    HomePage home;

    @BeforeMethod
    public void setUp () {
        initializer();
        mens = new MensPage();
        home = new HomePage();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void verifyMensPage () {
        home.clickMensTab();
        Assert.assertEquals(mens.pageTitle.getText(), "Men");
    }
}
