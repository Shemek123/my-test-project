package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestConfig;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();

        if (testInstance instanceof TestConfig) {
            WebDriver driver = ((TestConfig) testInstance).driver;
            if (driver != null) {
                ScreenshotUtil.captureScreenshot(driver);
            }

            System.out.println("Przemek: captureScreenshot");
        }
    }
}
