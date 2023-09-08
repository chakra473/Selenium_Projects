package testNG;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium.example.LoginPageObject;

public class FaceBookLogin extends CommonFunctions{

    @Test
    public void checkTitle(){
        PageFactory.initElements(driver, LoginPageObject.class);
        String title= driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up","Actual title is not" +
                " equal to expected title");
        System.out.println("Verified the Title of the website is "+title);
    }
    @Test
    @Parameters({"username1","password1"})
    public void verifyLogin(String userName,String password) throws InterruptedException {

        PageFactory.initElements(driver, LoginPageObject.class);
        LoginPageObject.username.sendKeys(userName);
        LoginPageObject.password.sendKeys(password);
        LoginPageObject.login_button.click();
    /* WebElement emailIdField= driver.findElement(By.xpath("//*[@id=\"email\"]"));
     WebElement passwordField= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
     emailIdField.sendKeys(userName);
     passwordField.sendKeys(password);
     WebElement signInButton = driver.findElement(By.xpath(
                "//button[@data-testid='royal_login_button']"));
     signInButton.click();*/
     /*WebElement userProfile = driver.findElement(By.xpath(
                "//*[@id=\"mount_0_0_tz\"]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));
     Assert.assertTrue(userProfile.isDisplayed(),"user profile is not displayed");
     System.out.println("user is logged in successfully");*/

    }
}
