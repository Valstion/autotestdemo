package pom.tests.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class DynamicPropertiesPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonEnableAfterSomeTime() {
        Common.waitToElementToBEClickable(Locators.Demoqa.Elements.buttonDynamicWait);
        Common.clickElement(Locators.Demoqa.Elements.buttonDynamicWait);
    }

    public static void clickButtonEnableAfterColorChange() {
        String attributeName = "class";
        String attibuteValue = "text-danger";


        Common.clickButtonChangeCorolAfter(Locators.Demoqa.Elements.buttonDynamicColor, attributeName,attibuteValue);
        Common.clickElement(Locators.Demoqa.Elements.buttonDynamicColor);
    }

    public static void clickButtonEnableForVisibleChange() {
        Common.clickButtonWithVizibleChange(Locators.Demoqa.Elements.buttonDynamicSwizzleAfter);
        Common.clickElement(Locators.Demoqa.Elements.buttonDynamicSwizzleAfter);
    }
}
