package tests;

import constants.AdminData;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends TestConfig
{

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("file:///C:/TestAutomation/TestAutomationTutorial/src/test/resources/login-form.html");
        //driver.get(baseUrl);

//        User newUser = new UserBuilder()
//                .withPassword("Secret123!")
//                .build();

        //loginPage.loginToApp(newUser.getUsername(), newUser.getPassword());

        loginPage.loginToApp(AdminData.VALID_USERNAME, AdminData.VALID_PASSWORD);

        String message = loginPage.getLoginMessage();
        Assert.assertEquals(message, "You are now logged in.!");
    }
}
