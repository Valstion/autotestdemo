package pom.tests.demoqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.Locators;
import pom.pages.demoqa.ButtonsPage;
import pom.pages.demoqa.HomePage;
import pom.tests.TestBase;

public class ButtonTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open();
        HomePage.clickElementPage();
        ElementPage.clickToOpenButtonsPage();
    }

    @Test
    private void test(){
        ButtonsPage.sleep(3000);
    }

    @Test
    private void doubleClickButtonTest(){
        Common.doubleclickElementByAction(Locators.Demoqa.Elements.buttonDoubleKick);
        ButtonsPage.sleep(3000);
    }

    @Test
    private void rightClickButtontTest(){
        Common.rightClickElementByAction(Locators.Demoqa.Elements.buttonSecondKick);
        ButtonsPage.sleep(3000);
    }

}
