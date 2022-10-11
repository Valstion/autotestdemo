package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class SelectDropDownDemoPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickDayFromDropDown(String value) {
        Common.selectOptionByValue(Locators.SeleniumEasy.SelectDropdownDemo.selectDayOfWeek, value);

    }

    public static String readMessageOfListDropDown() { return Common.getElementText(
            Locators.SeleniumEasy.SelectDropdownDemo.paragraphDayOfWeek
    );
    }
}