package pom.pages.tv3;

import pom.pages.Common;
import pom.pages.Locators;

import java.util.NoSuchElementException;

public class HomePage {
    public static void aceptPrivacyConfirmation() {
        Common.clickButtonWithVizibleChange(Locators.tv3.formPrivacyConfirmation);
        Common.clickElement(Locators.tv3.buttonConfirm);
        Common.sleep(3000);
    }

    ;


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickOnSuzie() {
        Common.clickElement(Locators.tv3.linkMenuClick);
    }

    public static boolean checkElementIsActivatedd() {
        try {
            Common.getElements(Locators.tv3.linkMenuClick);
            return true;
        } catch (NoSuchElementException e) {

        }
        return false;
    }
}




