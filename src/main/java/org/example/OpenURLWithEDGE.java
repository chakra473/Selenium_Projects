package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenURLWithEDGE {
    public static void main(String[] args) {
        System.getProperty("webdriver.edge.driver","C:\\Users\\Chakra\\Downloads\\edgedriver_win64\\msedgedriver");

        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://www.baeldung.com/selenium-webdriver-get-vs-navigate#:~:text=In%20this%20quick%20article%2C%20we,as%20refreshing%20the%20current%20page.");
        driver.navigate().forward();
        driver.quit();
    }
}
