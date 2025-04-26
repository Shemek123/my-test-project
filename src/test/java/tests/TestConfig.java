package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static config.WebDriverFactory.createDriver;

public class TestConfig {
    public WebDriver driver;
    protected String baseUrl;

    @Parameters({"browser", "url"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser,
                      @Optional("https://dev.example.com") String url) {
        driver = createDriver(browser);
        driver.manage().window().maximize();
        baseUrl = url;
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
