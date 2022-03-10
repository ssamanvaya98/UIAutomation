package Pages;

import org.openqa.selenium.By;

public class UserRegristrationPage extends BaseClass{
    public static By newCustomerLink = By.id("newCustomerLink");
    public static By email = By.id("emailControl");
    public static By password = By.id("passwordControl");
    public static By repeatPassword = By.id("repeatPasswordControl");
    public static By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    public static By openDropDown = By.className("mat-select-arrow-wrapper");
    public static By securityAnswer = By.id("securityAnswerControl");
    public static By registerButton = By.id("registerButton");

    public void LoginUsingValidCredentials(String emailId, String passWord, String repeatPassWord,String key){
        driver.findElement(newCustomerLink).click();
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(repeatPassword).sendKeys(repeatPassWord);
        driver.findElement(openDropDown).click();
        driver.findElement(selectOption).click();
        driver.findElement(securityAnswer).sendKeys(key);
        driver.findElement(registerButton).click();
//        return this;
    }

}
