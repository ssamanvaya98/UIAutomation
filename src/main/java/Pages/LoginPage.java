
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BaseClass {

    public static By email = By.id("email");
    public static By password = By.id("password");
    public static By loginButton = By.id("loginButton");


    public void loginWithEmailAndPassword(String emailId,String pass){
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}
