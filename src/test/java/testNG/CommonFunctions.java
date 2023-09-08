package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
    WebDriver driver;
    @BeforeSuite
    public void openWebBrowser(){
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.getProperty("webdriver.chrome.driver",
                "C:\\Users\\Chakra\\Downloads\\chromedriver_win32\\chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/?stype=lo&jlou=AffR80ycFFJ2Qhl9hHx4YuJs-UoMvZSVpqhTQOJ-hNjpvt4Ph6C8mitb2xDntDGUnoJkHk9iv0bHkq36MaVSmNQF0znQyeT3NKHUSSu5-YJeAA&smuh=29367&lh=Ac8XwkUK_XE6dYGKDcU");
    }
}
