package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void typeText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

}
