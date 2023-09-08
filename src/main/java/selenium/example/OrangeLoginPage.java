package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

//public class OrangeLoginPage {
//    public static void main(String[] args) throws InterruptedException, AWTException {
//        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(5000);
//       /* LoginPageObject.userName(driver).sendKeys("Admin");
//        LoginPageObject.password(driver).sendKeys("admin123");
//        LoginPageObject.loginButton(driver).click();*/
//        Thread.sleep(5000);
//        WebElement myInfo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
//        myInfo.click();
//        Thread.sleep(5000);
//        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastName']"));
//        lastName.click();
//        Robot robot=new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_A);
//        robot.keyRelease(KeyEvent.VK_A);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        lastName.clear();
//        lastName.sendKeys("murali");
//        /*WebElement userName=driver.findElement(By.name("username"));
//        WebElement password= driver.findElement(By.name("password"));
//        WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//        userName.sendKeys("Admin");
//        password.sendKeys("admin123");
//        loginButton.click();*/
//
//    }
//
//
//}
