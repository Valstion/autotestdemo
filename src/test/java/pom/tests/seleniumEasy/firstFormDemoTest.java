package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class firstFormDemoTest extends TestBase {


    @Test
    private void testInputFieldsSeleniumEasy() {
        String expectedFullName = "Jevgenij";
        String actualFullName;
        FirstFormDemoPage.enterFullName(expectedFullName);
        FirstFormDemoPage.clickButtonShowMessage();
        actualFullName = FirstFormDemoPage.readMessage();
        Assert.assertEquals(actualFullName, expectedFullName);

    }

}
