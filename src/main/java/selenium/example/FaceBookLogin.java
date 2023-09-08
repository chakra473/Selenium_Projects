package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        WebElement userName=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userName.sendKeys("6385907201");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.sendKeys("Jayen@240403"+ Keys.ENTER);
        Thread.sleep(30000);
        driver.quit();
    }
}
