import Constants.FrameworkConstants;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ReadPropertyFile;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    WebDriver driver = null;
    @BeforeMethod
    public void setUp() throws InterruptedException, IOException {
       // Cross browser testing - Factory Pattern
//        switch (ReadPropertyFile.getProperty("browser")){
//            case "IE":
//                driver = new InternetExplorerDriver();
//            case "CHROME":
//                System.setProperty("webdriver.chrome.driver",  FrameworkConstants.getChromedriverpath());
//                driver = new ChromeDriver();
//            case "FIREFOX":
//                System.setProperty("webdriver.chrome.driver",  FrameworkConstants.getChromedriverpath());
//                driver = new ChromeDriver();
//            default:
//                new Exception("INVALID DRIVER NAME");
//        }
//        System.setProperty("webdriver.chrome.driver",  FrameworkConstants.getChromedriverpath());
        System.setProperty("webdriver.chrome.driver","/Users/soumyasamanvaya/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://juice-shop.herokuapp.com");
//        driver.get(ReadPropertyFile.getProperty("url"));
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
