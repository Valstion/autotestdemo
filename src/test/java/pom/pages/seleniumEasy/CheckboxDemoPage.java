package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

import java.util.List;

public class CheckboxDemoPage {

    public static boolean checkStatusesOfSelectedCheckBoxes;

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.CheckBoxDemo.divMessageText);
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickSingleCheckbox() {

        Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.inputSingleCheckBox);
    }

    public static void clickButtonCheckAll() {
        Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.buttonGroupCheckbox);
    }

    public static String readValueOfButtonUnckedAllUtton() {
        return Common.getElementAttributeValue(Locators.SeleniumEasy.CheckBoxDemo.buttonGroupCheckbox,"value");
    }

    public static boolean checkStatusesOfSelectedCheckBoxes(boolean isStatusSet) {
        List<Boolean> statusList = Common.getStatusesOfSelectedCheckBoxes(
                Locators.SeleniumEasy.CheckBoxDemo.inputMultipleCheckbox);

        for (boolean status : statusList) {
            if (isStatusSet != status) return false;
        }

        return true;
    }
}
