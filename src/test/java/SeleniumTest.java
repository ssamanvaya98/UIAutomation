import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class SeleniumTest extends BaseTest{

    private SeleniumTest(){
        super();
    }
    WebDriver driver = null;
    By welcomeBanner ;
    By cookieConsent ;
    String email_add ;
    String password_add;

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(cookieConsent).click();
        driver.findElement(welcomeBanner).click();
        By myAccount = By.id("navbarAccount");
        By login = By.id("navbarLoginButton");
        driver.findElement(myAccount).click();
        driver.findElement(login).click();


        driver.findElement(myAccount).click();
        driver.findElement(login).click();
        By newCustomerLink = By.id("newCustomerLink");
        By email = By.id("emailControl");
        By password = By.id("passwordControl");
        By repeatPassword = By.id("repeatPasswordControl");
        By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
        By openDropDown = By.className("mat-select-arrow");
        By securityAnswer = By.id("securityAnswerControl");
        By registerButton = By.id("registerButton");

        driver.findElement(newCustomerLink).click();
        driver.findElement(email).sendKeys(email_add);
        driver.findElement(password).sendKeys(password_add);
        driver.findElement(repeatPassword).sendKeys(password_add);
        driver.findElement(openDropDown).click();
        driver.findElement(selectOption).click();
        driver.findElement(securityAnswer).sendKeys("Test");
        driver.findElement(registerButton).click();
        Thread.sleep(1000);
    }

    @Test
    public void test2(){
//        driver.findElement(By.id("email")).sendKeys("jaya@test.com");
//        driver.findElement(By.id("password")).sendKeys("Password@123");
//        driver.findElement(By.id("loginButton")).click();
        new LoginPage().loginWithEmailAndPassword("jaya@test.com","Password@123");
        if(driver.findElement(By.xpath("//button[@aria-label='show the shopping cart']")).isDisplayed()){
            System.out.println("The test is passed");

        }else {
            System.out.println("The test is failed");
       }
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","/Users/soumyasamanvaya/Downloads/chromedriver");
//        driver = new ChromeDriver();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
//        driver.get("http://juice-shop.herokuapp.com/#/login");
        email_add = "username" + randomInt + "@gmail.com";
        password_add = "Hello";

        welcomeBanner = By.xpath("//button[@aria-label = 'Close Welcome Banner']");
        cookieConsent = By.xpath("//a[@aria-label='dismiss cookie message']");

        Thread.sleep(1000);
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }


//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver","/Users/soumyasamanvaya/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://juice-shop.herokuapp.com/#/login");
////        driver.findElement(By.xpath("//button[@aria-label='Close Welcome Banner']")).click();
////        driver.findElement(By.xpath("//a[@aria-label = 'dismiss cookie message']")).click();
//        new HomePage().skipBanner().navigateToLogin();
//        driver.manage().window().maximize();
//        driver.findElement(By.id("email")).sendKeys("jaya@test.com");
//        driver.findElement(By.id("password")).sendKeys("Password@123");
//        driver.findElement(By.id("loginButton")).click();
//        if(driver.findElement(By.xpath("//button[@aria-label='show the shopping cart']")).isDisplayed()){
//            System.out.println("The test is passed");
//
//        }else {
//            System.out.println("The test is failed");
//        }
//        driver.quit();
//    }
}