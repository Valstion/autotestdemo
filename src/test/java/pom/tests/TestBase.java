package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pom.pages.Common;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.utils.TestLestener;

@Listeners(TestLestener.class)
public class TestBase {

    @BeforeMethod
   public void setUp() {

        Common.setUp();

    }


   @AfterMethod
   public void tearDown() {

     Common.close();
 }

}
