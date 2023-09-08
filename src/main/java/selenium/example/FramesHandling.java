package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/selenium-tutorial.html");
        driver.switchTo().frame(0);
        WebElement ad1= driver.findElement(By.id("google_ads_iframe_/24132379/guru99.com_300x250_2_0"));
        ad1.click();

    }
}
