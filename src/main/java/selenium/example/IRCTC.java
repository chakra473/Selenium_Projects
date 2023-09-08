package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement searchbutton=driver.findElement(By.xpath("//button[@label=\"Find Trains\"]"));
        String attribute = searchbutton.getAttribute("class");
        System.out.println("value of the class attribute is:"+attribute);
        WebElement from=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
        from.sendKeys("TRL"+Keys.ENTER);
        WebElement to=driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
        to.sendKeys("MAS"+Keys.ENTER);
        String attribute1 = to.getAttribute("class");
        System.out.println("value of the class attribute is:"+attribute1);
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")).click();
        System.out.println("clicked on search button");
    }
}
