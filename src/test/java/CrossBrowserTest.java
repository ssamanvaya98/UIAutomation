
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {

        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver =  new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver","/Users/soumyasamanvaya/Documents/Projects/QAMavenProject/src/main/resources/msedgedriver");
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver =  new FirefoxDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                throw new Exception("Incorrect Browser");
        }
    }

    @Test
    public void testBrowser() throws InterruptedException {


        driver.get("https://reqres.in/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='#support-heading']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("trigger-pro")).click();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(By.id("mce-EMAIL")).sendKeys("test"+randomInt+"@test.com");
        driver.findElement(By.id("mc-embedded-subscribe")).click();


    }

}
