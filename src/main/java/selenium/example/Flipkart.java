package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;

public class Flipkart {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement travel= driver.findElement(By.xpath(""));
        Actions actions=new Actions(driver);
        actions.moveToElement(travel).build().perform();
        actions.click(travel);
        //driver.quit();

    }
}
