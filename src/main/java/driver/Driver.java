package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

    public static WebDriver driver;

    public static WebDriver initDriver(){
        if (driver==null) {
            System.setProperty("webdriver.chrome.driver", "/Users/soumyasamanvaya/Downloads/chromedriver");

            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver!=null) {
            driver.quit();
        }
        driver = null;

    }
}
