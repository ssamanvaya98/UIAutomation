package Pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public WebDriver driver;
    public BaseClass(){
        this.driver = Driver.initDriver();
    }
}
