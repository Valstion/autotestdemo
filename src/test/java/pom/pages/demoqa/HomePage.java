package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

import java.time.LocalDateTime;

public class HomePage {
    public static void open() {
        Common.openUrl("https://demoqa.com/");
    }

    public static void clickElementPage() {
       // Common.clickElement(Locators.Demoqa.Home.menuElement);
        Common.clickElementByAction(Locators.Demoqa.Home.menuElement);
    }
}
