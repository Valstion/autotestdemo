package pom.pages.demoqa;

import org.openqa.selenium.By;
import pom.pages.Common;

public class TextBaxPage {
    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                By.xpath("//input[@id='userName']")
        );
    }

    public static void clickButtonSubmit() {
        Common.clickElement(
                By.xpath("//*[@id='submit']")
        );
    }

    public static String readMessageFullName() {
        return Common.getElementText(
                By.xpath("//*[@id='name']")
        );
    }

    public static void enterEmail(String expectedUserEmail) {
        Common.sendKeysToElement(
                expectedUserEmail,
                By.xpath("//*[@id='userEmail']")
        );
    }

    public static String readMessageEmail() {
        return Common.getElementText(
                By.xpath("//*[@id='email']")
        );
    }

    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                By.xpath("//textarea[@id='currentAddress']")
        );
    }

    public static String readMessageCurrentAddress() {
        return Common.getElementText(
                By.xpath("//p[@id='currentAddress']")
        );
    }
}
