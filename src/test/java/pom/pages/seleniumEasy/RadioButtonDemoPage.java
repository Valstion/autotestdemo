package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class RadioButtonDemoPage {
    public static void open(String url) {
        Common.openUrl(url);

    }
    public static void clickRadioButton(String gender){
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputGender(gender));

    }

    public static void clickButtonGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.buttonCheckValue);
    }

    public static String readRadioButtonMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.paragraphRadioButton);
    }
}
