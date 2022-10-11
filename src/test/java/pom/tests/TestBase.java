package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.pages.Common;
import pom.pages.seleniumEasy.FirstFormDemoPage;

public class TestBase {

    @BeforeMethod
   public void setUp() {
   //     FirstFormDemoPage.setUp();
        Common.setUp();

    }


    @AfterMethod
    public void tearDown() {
        //FirstFormDemoPage.close();
        Common.close();
    }

}
