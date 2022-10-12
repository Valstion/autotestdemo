package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.seleniumEasy.CheckboxDemoPage;
import pom.tests.TestBase;

public class CheckBoxDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CheckboxDemoPage.open("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    @Test
    private void testSigleCheckBoxDemo(){
        String  expectedMessage = "Success - Check box is checked";
        String actualMessage = "";
        CheckboxDemoPage.clickSingleCheckbox();
        actualMessage = CheckboxDemoPage.readMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    private void testMultipleCheckBoxStatusWithCheckedAll(){
        String expectedButtonText = "Uncheck All";
        String actualButtonText = "";
        boolean expectedCheckboxStatus = true;
        boolean actualCheckboxStatus = false;
        CheckboxDemoPage.clickButtonCheckAll();
        actualButtonText = CheckboxDemoPage.readValueOfButtonUnckedAllUtton();
        Assert.assertEquals(actualButtonText, expectedButtonText);
        actualCheckboxStatus = CheckboxDemoPage.checkStatusesOfSelectedCheckBoxes(expectedCheckboxStatus);
        Assert.assertTrue(actualCheckboxStatus == expectedCheckboxStatus);




    }
}
