package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.pages.seleniumEasy.FirstFormDemoTest;

public class TestBase {

    @BeforeMethod
   public void setUp() {
        FirstFormDemoTest.setup();
        FirstFormDemoTest.open("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    @AfterMethod
    public void tearDown() {
        FirstFormDemoTest.close();
    }

}
