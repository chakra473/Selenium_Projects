package selenium.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {
        System.getProperty("webdriver.chrome.driver",
                "C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://relevel.com/profile/u/chakravarthy");
        TakesScreenshot scrnshot=((TakesScreenshot)driver);
        File src= scrnshot.getScreenshotAs(OutputType.FILE);
        File target=new File("D:\\SeleniumScreenShot\\flipkart.jpg");
        FileHandler.copy(src,target);
        System.out.println("captured the screenshot");
        driver.quit();
    }
}
