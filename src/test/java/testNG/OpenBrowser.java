package testNG;


import org.testng.annotations.Test;

public class OpenBrowser {

    @Test(priority = 0)
    public void openGoogle()
    {
        System.out.println("google opened");
    }
}
