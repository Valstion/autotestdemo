package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.pages.seleniumEasy.FirstFormDemoPage;

public class TestBase {

    @BeforeMethod
   public void setUp() {
        FirstFormDemoPage.setUp();
        FirstFormDemoPage.open("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    @AfterMethod
    public void tearDown() {FirstFormDemoPage.close();
    }

}
