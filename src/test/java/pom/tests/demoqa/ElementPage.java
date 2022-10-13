package pom.tests.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class ElementPage {
    public static void clickToOpenButtonsPage(){
        Common.clickElement(Locators.Demoqa.Elements.menuButtons);
    };
}
