package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageBase {
private final By usernameInput = By.id("username");
private final By passwordInput = By.id("password");
private final By loginButton = By.xpath("//button[text()='Login']");
private final By messageLabel = By.id("message");

private WebDriverWait wait;

public LoginPage(WebDriver driver) {
    super(driver);
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Page-specific wait
}

public void open(String url) {
    driver.get(url);
}

public void loginToApp(String userName, String password) {
    enterUsername(userName);
    enterPassword(password);
    clickLogin();
}

public void enterUsername(String username) {
    WebElement element = driver.findElement(usernameInput);
    typeText(element, username);
}

public void enterPassword(String password) {
    WebElement element = driver.findElement(passwordInput);
    typeText(element, password);
}

public void clickLogin() {
    WebElement button = driver.findElement(loginButton);
    click(button);
}

public String getLoginMessage() {
    WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(messageLabel));
    return getText(message);
}
}
