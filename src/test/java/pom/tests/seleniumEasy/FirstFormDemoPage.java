package pom.tests.seleniumEasy;

import org.openqa.selenium.By;
import pom.pages.Common;

public class FirstFormDemoPage {

    public static Object clickButtonShowMessage() {
        Common.clickElement(
                By.xpath("//input[@id=user-button]")
        );
        return null;
    }

    public static void setup() {
        Common.setUp();
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void sleeo() {
        int millis = 3000;
        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.setKeeysToElement(expectedFullName, By.id("//input[@id=user-message]"));
        FirstFormDemoPage.sleep(3000);

    }

    private static void sleep(int i) {
        
    }

    public static String readMessage() {
        return Common.getElementText(
                By.xpath("nput[@id=user-message")
        );
    }
}
