package pom.tests.demoqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class DynamicTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        DynamicPropertiesPage.open("https://demoqa.com/dynamic-properties");
    }
    @Test
    private void testButtonWait(){
       // DynamicPropertiesPage.clickButtonEnableAfterSomeTime();
        DynamicPropertiesPage.clickButtonEnableAfterColorChange();
     //   DynamicPropertiesPage.clickButtonEnableForVisibleChange();
    }
}
