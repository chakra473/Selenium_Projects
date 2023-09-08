package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EaseMyTrip {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
        WebElement more=driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/div[1]/ul/li[9]/a"));
        WebElement giftCard= driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/div[1]/ul/li[9]/div/a[3]"));
        Actions action=new Actions(driver);
        action.moveToElement(more).perform();
        action.click(giftCard).perform();
        WebElement fAQ=driver.findElement(By.xpath("//*[@id=\"faq\"]/di WebElement fAQ=driver.findElement(By.xpath(\"//*[@id=\\\"fav/div[2]/div[1]/div[2]"));
        String fAqQ1= fAQ.getText();
        System.out.println(fAqQ1);
        driver.quit();

        

    }
}
