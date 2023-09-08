package selenium.example;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Amazon {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=10311643283168243939&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300955&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        WebElement dropDownAll= driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        //dropDownAll.click();
        //Select select=new Select(dropDownAll);
        //select.selectByVisibleText("Electronics");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("mobiles under 20k"+ Keys.ENTER);
        Actions actions=new Actions(driver);
        WebElement link = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
        actions.moveToElement(link);
        actions.click(link).perform();
        //TakesScreenshot takesScreenshot=new

    }
}
