package pom.tests.seleniumEasy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.FirstFormDemoTest;
import pom.tests.TestBase;

public class firstFormDemoTest extends TestBase {


    @Test
    private void test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
