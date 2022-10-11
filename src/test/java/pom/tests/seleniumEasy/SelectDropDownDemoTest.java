package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.SelectDropDownDemoPage;
import pom.tests.TestBase;

public class SelectDropDownDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SelectDropDownDemoPage.open("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

    }

    @Test
    private void textSelectListDemo() {
        String actualMessage = "";
        String expectedWeekOfDay = "Tuesday";
        SelectDropDownDemoPage.clickDayFromDropDown(expectedWeekOfDay);
       actualMessage = SelectDropDownDemoPage.readMessageOfListDropDown();



        Assert.assertTrue(
                actualMessage.contains(expectedWeekOfDay),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage, expectedWeekOfDay

                )
        );

    }
}
