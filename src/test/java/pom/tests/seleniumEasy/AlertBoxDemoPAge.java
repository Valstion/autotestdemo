package pom.tests.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;


public class AlertBoxDemoPAge {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonToOpenAlertBox() {
        Common.clickElement(Locators.SeleniumEasy.AlertBoxDemo.buttonDisplayAlertBox);
    }

    public static void sleep(int milis) {
        Common.sleep(milis);
    }

    public static void clickToCloseAlertBox() {
        Common.acceptAlert();

    }

    public static void clickButtonToOpenConfirmBox() {
        Common.clickElement(Locators.SeleniumEasy.AlertBoxDemo.buttonDisplayConfirmBox);
    }

    public static void clickAcceptConfirmBox() {
        Common.acceptAlert();
    }

    public static String readMessageFromConfirmBox() {
        return Common.getElementText(Locators.SeleniumEasy.AlertBoxDemo.paragrafConfirmBox);
    }

    public static void clickCalcelConfirmBox() {
         Common.cancelAlert();
    }

    public static void clickButtonToOpenAlertBoxToAlert() {Common.clickElement();
    }
    public static void sendKeysToAlert(String sendKeys){getAlert}

    public static String readMessageFromAlertBox() {
        return Common.getElementText(Locators.SeleniumEasy.AlertBoxDemo.paragrafConfirmBox);    }

    public static void clickToAlertBox() {
    }
}
