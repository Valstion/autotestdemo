package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
    private static WebDriver driver;

    public static void setDriver() {
        WebDriverManager.operadriver().setup();
        driver = new ChromeDriver(setUpOptions());
        driver.manage().deleteAllCookies();
    }

    public static void openUrl(String url) {
        driver.get(url);

    }

    public static void close() {
        driver.quit();
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device=scale=factor=0.75");
        return options;
    }

}
