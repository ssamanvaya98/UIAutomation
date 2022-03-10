import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegristrationPage;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;


public class SeleniumTest1  {
//    public SeleniumTest1(){
//        super();
//    }
    public WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.driver = Driver.initDriver();
        driver.get("http://juice-shop.herokuapp.com");
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        new HomePage().skipBanner().navigateToLogin();
//        driver.findElement(By.xpath("//button[@aria-label='Close Welcome Banner']")).click();
//        driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")).click();
        driver.manage().window().maximize();

    }

    @Test
    public void test1(){

        new LoginPage().loginWithEmailAndPassword("barf@test.com","Password@123");

//        driver.findElement(By.id("email")).sendKeys("barf@test.com");
//        driver.findElement(By.id("password")).sendKeys("Password@123");
//
//        driver.findElement(By.id("loginButton")).click();
        Driver.quitDriver();

    }

    @Test
    public void test2() throws InterruptedException {
//        By myAccount = By.id("navbarAccount");
//        By login = By.id("navbarLoginButton");
//        driver.findElement(myAccount).click();
//        driver.findElement(login).click();
//        new UserRegristrationPage().LoginUsingValidCredentials("abcd@test.com","Password@123","Password@123","abc");


//        By myAccount = By.id("navbarAccount");
//        By login = By.id("navbarLoginButton");
//        driver.findElement(myAccount).click();
//        driver.findElement(login).click();


//        driver.findElement(myAccount).click();
//        driver.findElement(login).click();
//        new HomePage().skipBanner().navigateToLogin();

//        By newCustomerLink = By.id("newCustomerLink");
//        By email = By.id("emailControl");
//        By password = By.id("passwordControl");
//        By repeatPassword = By.id("repeatPasswordControl");
//        By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
//        By openDropDown = By.className("mat-select-arrow");
//        By securityAnswer = By.id("securityAnswerControl");
//        By registerButton = By.id("registerButton");
//
//        driver.findElement(newCustomerLink).click();
//        driver.findElement(email).sendKeys("abcd@test.com");
//        driver.findElement(password).sendKeys("Password@123");
//        driver.findElement(repeatPassword).sendKeys("Password@123");
//        driver.findElement(openDropDown).click();
//        driver.findElement(selectOption).click();
//        driver.findElement(securityAnswer).sendKeys("Test");
//        driver.findElement(registerButton).click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        new UserRegristrationPage().LoginUsingValidCredentials("abcde"+randomInt+"@gmail.com","Password@123","Password@123","abc");
//        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }


//    @AfterMethod
//    public void tearDown(){
//        Driver.quitDriver();
//    }


}
