package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        WebElement newWindow= driver.findElement(By.id("button1"));
        newWindow.click();
        newWindow.click();
        String oldWindow= driver.getWindowHandle();
        Set<String> newWindows= driver.getWindowHandles();
        for (String handle:
             newWindows) {
            driver.switchTo().window((handle));
        }
        WebElement threeLines= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[1]/button"));
        threeLines.click();
        int noOfWindows= driver.getWindowHandles().size();
        System.out.println("no of windows opened:"+noOfWindows);
        for (String handle:
             newWindows) {
            if(!handle.equals(oldWindow)){
                driver.switchTo().window((handle));
                driver.close();
            }
        }

    }
}
