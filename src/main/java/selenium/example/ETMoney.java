package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ETMoney {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.getProperty("webdriver.chrome.driver",
                "C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etmoney.com/mutual-funds/filter/long-term-funds-return");
        WebElement investment_type= driver.findElement(By.xpath("//*[@id=\"investment-type\"]/ul/li[2]/label"));
        investment_type.click();
        WebElement longTerm=driver.findElement(By.xpath("//*[@id=\"list-of-returns\"]/ul/li[2]/label"));
        boolean check=longTerm.isSelected();
        System.out.println(check);
        WebElement hybrid_button= driver.findElement(By.xpath("//*[@id=\"categories\"]/ul/li[2]/div[1]/label"));
        hybrid_button.click();
        WebElement all_check_box= driver.findElement(By.xpath("//*[@id=\"HYBRID\"]/ul/li[1]/label"));
        boolean check_all=all_check_box.isSelected();
        System.out.println(check_all);
        WebElement aggressive_hybrid= driver.findElement(By.xpath("//*[@id=\"HYBRID\"]/ul/li[7]/label"));
        aggressive_hybrid.click();
        System.out.println(check_all);
        WebElement one_year_return=driver.findElement(By.xpath("//*[@id=\"mf_nav_table\"]/table/thead/tr/th[8]/div/strong"));
        one_year_return.click();
        WebElement showMoreFunds= driver.findElement(By.xpath("//span[contains(text(),'Show')]"));
        Thread.sleep(3000);
        showMoreFunds.click();
        Thread.sleep(3000);
        showMoreFunds.click();
        Thread.sleep(3000);
       /* Actions actions=new Actions(driver);
        actions.moveToElement(one_year_return).click().perform();*/
//        one_year_return.click();
        List<WebElement> descending_order=driver.findElements(By.xpath("//strong[(text()='Aggressive Hybrid')]//parent::a//parent::td[1]//following-sibling::td[7]"));
        int count=0;
        List<String> allReturns=new ArrayList<>();
        for (WebElement returns:
             descending_order) {
            String string= returns.getText();
            allReturns.add(string);
//            System.out.println(string);
            }
        /*System.out.println(allReturns);
        System.out.println(descending_order.size());*/
        List<WebElement> schemeNames=driver.findElements(By.xpath("//strong[text()='Aggressive Hybrid']//parent::a"));
        int count1=0;
        List<String> schemeNameList=new ArrayList<>();
        for (WebElement nameList:
             schemeNames) {
            schemeNameList.add(nameList.getText());
        }
//        System.out.println(schemeNameList);
        for (int i=0;i<schemeNames.size();i++){
            System.out.println(schemeNameList.get(i).replace("Aggressive Hybrid","")+":"+
                    allReturns.get(i));
        }
        }


    }
