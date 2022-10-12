package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.tests.TestBase;

public class AlertBoxDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        AlertBoxDemoPAge.open("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }
    @Test
    private void testAlertBox(){
        AlertBoxDemoPAge.clickButtonToOpenAlertBox();
        AlertBoxDemoPAge.sleep(1500);
        AlertBoxDemoPAge.clickToCloseAlertBox();
        AlertBoxDemoPAge.sleep(1500);
    }
    @Test
    private void testAcceptConfirmBox(){
        String expectedMessage = "OK";
        String actualMessage = "";
        AlertBoxDemoPAge.clickButtonToOpenConfirmBox();
        AlertBoxDemoPAge.clickAcceptConfirmBox();
        actualMessage =AlertBoxDemoPAge.readMessageFromConfirmBox();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    private void testCanselConfirmBox(){
        String expectedMessage = "Cancel";
        String actualMessage = "";
        AlertBoxDemoPAge.clickButtonToOpenConfirmBox();
        AlertBoxDemoPAge.clickCalcelConfirmBox();
        actualMessage =AlertBoxDemoPAge.readMessageFromConfirmBox();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    private void testSendKeysToAlertBox(){
        String expectedMessage = "Jevgenij";
        String actualMessage;
        AlertBoxDemoPAge.clickButtonToOpenAlertBoxToAlert();
        AlertBoxDemoPAge.clickToCloseAlertBox(expectedMessage);
        AlertBoxDemoPAge.clickToAlertBox();
        actualMessage = AlertBoxDemoPAge.readMessageFromAlertBox();
    }
}
