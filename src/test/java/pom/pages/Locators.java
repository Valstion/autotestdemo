package pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Demoqa {
        public static class TextBox {
            public static By inputFullName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//*[@id='submit']");
            public static By paragraphName = By.xpath("//*[@id='name']");
            public static By emailName = By.xpath("//*[@id='userEmail']");
            public static By mesageEmail = By.xpath("//*[@id='email']");
            public static By currentAdress = By.xpath("//textarea[@id='currentAddress']");
            public static By readMessageAdress = By.xpath("//p[@id='currentAddress']");

        }

    }

    public static class SeleniumEasy {

        public static class FirstFormDemo {
            public static By inputFullName = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//form[@id='get-input']//button");
            public static By spanDisplay = By.xpath("//span[@id='display']");

            public static By inputValueA = By.xpath("//input[@id='sum1']");
            public static By inputValueB = By.xpath("//input[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By paragraphSumTotal = By.xpath("//*[@id='displayvalue']");
        }

        public static class CheckBoxDemo {
            public static By inputSingleCheckBox = By.xpath("//input[@id='isAgeSelected']");
            public static By divMessageText = By.xpath("//div[@id='txtAge']");
            public static By buttonGroupCheckbox = By.xpath("//*[@id='check1']");
            public static By inputMultipleCheckbox = By.xpath("//input[@class='cb1-element']");
        }
////
        public static class SelectDropdownDemo {
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By paragraphDayOfWeek = By.xpath("//p[@class='selected-value']");
            public static By buttonCheckedAll = By.xpath("//*[@id='check1']");

        }

        public static class RadioButtonDemo {
            public static By buttonCheckValue = By.xpath("//button[@id='buttoncheck']");
            public static By paragraphRadioButton = By.xpath(" //p[@class='radiobutton']");

            public static By inputGender(String gender) {
                return By.xpath(String.format("//input[@value='%s' and @name='optradio']", gender));
            }
        }

    }
}
