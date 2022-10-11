package pom.pages.demoqa;

import org.openqa.selenium.By;
import pom.pages.Common;
import pom.pages.Locators;

public class TextBoxPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.Demoqa.TextBox.inputFullName
        );
    }

    public static void clickButtonSubmit() {
        Common.clickElement(
                Locators.Demoqa.TextBox.buttonSubmit
        );
    }

    public static String readMessageFullName() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.paragraphName
        );
    }

    public static void enterEmail(String expectedUserEmail) {
        Common.sendKeysToElement(
                expectedUserEmail,
                Locators.Demoqa.TextBox.emailName
        );
    }

    public static String readMessageEmail() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.mesageEmail
        );
    }

    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                Locators.Demoqa.TextBox.currentAdress
        );
    }

    public static String readMessageCurrentAddress() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.readMessageAdress
        );
    }
}
