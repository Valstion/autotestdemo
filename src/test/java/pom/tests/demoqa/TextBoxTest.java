package pom.tests.demoqa;

import org.testng.annotations.BeforeMethod;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.tests.TestBase;

public class TextBoxTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp(FirstFormDemoPage.open("https://demo.seleniumeasy.com/basic-first-form-demo.html");)

    }
}
