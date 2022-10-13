package pom.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;

import javax.swing.*;
import java.time.Duration;
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
        return Driver.getDriver().switchTo().alert();
    }

    public static void acceptAlert() {
        getAlert().accept();
    }

   // public static void cancelAlert() {getAlert().dismiss();}

    public static void sendKeysToAlert(String sendKeys) {
        getAlert().sendKeys(sendKeys);
    }
    public static void clickElementByAction(By locator){WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.click();
        actions.perform();
    }
    public static void doubleclickElementByAction(By locator){WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.doubleClick();
        actions.perform();
    }
    public static void rightClickElementByAction(By locator){WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.contextClick();
        actions.perform();
    }
    public static void waitToElementToBEClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickButtonChangeCorolAfter(By locator , String attibutename, String attibuteValue) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.attributeContains(locator, attibutename,attibuteValue));
    }

    public static void clickButtonWithVizibleChange(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}



