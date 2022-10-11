package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.tests.TestBase;

public class firstFormDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        FirstFormDemoPage.open("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    private void testInputFieldSeleniumEasy() {
        String expectedFullName = "Jevgenij";
        String actualFullName;

        FirstFormDemoPage.enterFullName(expectedFullName);
        FirstFormDemoPage.clickButtonShowMessage();
        actualFullName = FirstFormDemoPage.readMessage();

        Assert.assertEquals(actualFullName, expectedFullName);
    }

    @DataProvider(name = "DataProviderTwoInputsFields")
    private Object[][] provideDataforTwoInputsFields() {
        return new Object[][]{{"5", "5", "10"}, {"3", "b", "NaN"}, {"a", "0", "NaN"}, {"penki", "Penki", "NaN"},};
    }

    @Test(dataProvider = "DataProviderTwoInputsFields")
    private void testTwoInputFields(String input1, String input2,String expectedSumTotal ) {

        String actualSumTotal;

        FirstFormDemoPage.enterValueA(input1);
        FirstFormDemoPage.enterValueB(input2);
        FirstFormDemoPage.clickButtonGetTotal();
        actualSumTotal = FirstFormDemoPage.readSumTotal();

        Assert.assertEquals(actualSumTotal, expectedSumTotal);
    }
}
