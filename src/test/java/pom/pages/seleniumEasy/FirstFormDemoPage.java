package pom.pages.seleniumEasy;

import org.openqa.selenium.By;
import pom.pages.Common;

public class FirstFormDemoPage {

    public static void setUp() {
        Common.setUp();
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void sleeo(int millis) {

        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.setKeeysToElement(
                expectedFullName,
                By.xpath("//input[@id=user-message]")
        );

    }

    public static void clickButtonShowMessage() {
        Common.clickElement(By.xpath("//form[@id='get-input']//button")
        );

    }

    public static String readMessage() {
        return Common.getElementText(By.xpath("//span[@id='display']"));
    }
}
