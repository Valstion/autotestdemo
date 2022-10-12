package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.RadioButtonDemoPage;
import pom.tests.TestBase;

public class RadioButtonDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RadioButtonDemoPage.open("https://demo.seleniumeasy.com/basic-radiobutton-demo.html\n");
    }

    @DataProvider(name = "DataProviderGender", parallel = true)
    private Object[][] provideDataForGender() {
        return new Object[][]{{"Male"}, {"Female"}};
    }


    @Test(dataProvider = "DataProviderGender")
    public void testRadioButtonDemo(String expectedGender) {

        String actualMessage = "";
        RadioButtonDemoPage.clickRadioButton(expectedGender);
        RadioButtonDemoPage.clickButtonGetCheckedValue();
        actualMessage = RadioButtonDemoPage.readRadioButtonMessage();


        Assert.assertTrue(actualMessage.contains(expectedGender),
                String.format("Actual [%s]; Expected [%s]", actualMessage, expectedGender));

    }
}
