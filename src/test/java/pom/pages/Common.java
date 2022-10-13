package pom.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pom.utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void cancelAlert() {
    }

    ;

    public static void setUp() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void close() {
        Driver.close();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }


    public static String getElementAttributeValue(By locator, String atributeName) {
        return getElement(locator).getAttribute(atributeName);
    }


    public static List<Boolean> getStatusesOfSelectedCheckBoxes(By locator) {
        List<WebElement> elements = Common.getElements(locator);
        List<Boolean> statuses = new ArrayList<>();
        for (WebElement element : elements) {
            statuses.add(element.isSelected());
        }
        return statuses;
    }

    public static Alert getAlert() {
        getAlert();
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert();
    }
}



