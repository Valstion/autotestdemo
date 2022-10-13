package pom.tests.tv3;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.tv3.HomePage;
import pom.tests.TestBase;

public class Honestest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.tv3.lt");
        HomePage.aceptPrivacyConfirmation();
    }

    @Test
    public  void testOpenPageNissie(){
        boolean isElementAvalible;


       HomePage.clickOnSuzie();
        isElementAvalible = HomePage.checkElementIsActivatedd();
        Assert.assertTrue(isElementAvalible);
    }
}
