package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
    @FindBy(name = "email")
    public static WebElement username;
    @FindBy(name="pass")
    public static WebElement password;
    @FindBy(name = "login")
    public static WebElement login_button;

    /*public static WebElement userName(WebDriver driver){
       return driver.findElement(By.name("username"));
    }
    public static WebElement password(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    public static WebElement loginButton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    }*/
}
