package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest {

    @Test
    public void openGooglePage() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();

    }
}
