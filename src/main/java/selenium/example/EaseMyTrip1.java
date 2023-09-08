package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.List;

public class EaseMyTrip1 {
    public static void main(String[]args) throws InterruptedException,
            IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();
        WebElement more = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[9]/a[1]"));
                Actions actions = new Actions(driver);
        actions.moveToElement(more).perform();
        Thread.sleep(10000);
        WebElement gifCard = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[9]/div[1]/a[3]"));
        actions.moveToElement(gifCard).click().perform();
        Thread.sleep(20000);
        WebElement faq = driver.findElement(By.xpath("//div[text()=\"FAQ's\"]"));
        actions.moveToElement(faq).perform();
        Thread.sleep(20000);
        WebElement question1 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div[1]/div[1]"));
                actions.moveToElement(question1).contextClick(question1).click(question1).perform();
        Thread.sleep(10000);
        WebElement answer = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div[1]/div[2]/p"));
                String text = answer.getText();
        System.out.println("answer of the question is :"+text);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        driver.quit();
    }
}
