package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        //WebElement sauceLabBackBag = null;
        try {
           WebElement sauceLabBackBag = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        } catch (NoSuchElementException e){
            System.out.println(e);

        }
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        Thread.sleep(10000);
        //sauceLabBackBag.click();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.close();
    }
}
