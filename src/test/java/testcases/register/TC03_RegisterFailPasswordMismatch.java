package testcases.register;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import java.util.UUID;

public class TC03_RegisterFailPasswordMismatch extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @Test
    public void testRegisterFailPasswordMismatch() {

        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);

        // Step 1: Go to homepage
        driver.get("https://demo1.cybersoft.edu.vn");

        // Step 2: Navigate to Register page
        homePage.navigateRegisterPage();

        // Step 3: Enter valid account
        String account = "kimhue" + UUID.randomUUID().toString().replace("-", "");
        registerPage.enterAccount(account);

        // Step 4: Enter password
        registerPage.enterPassword("123456");

        // Step 5: Enter confirm password (DIFFERENT)
        registerPage.enterConfirmPassword("1234567");

        // Step 6: Enter full name
        registerPage.enterName("Kim Huệ");

        // Step 7: Enter valid email
        registerPage.enterEmail(account + "@gmail.com");

        // Step 8: Click Register
        registerPage.clickRegister();

        // Step 9: Verify error message at Confirm Password field
        String actualConfirmPasswordErrorMsg =
                registerPage.getConfirmPasswordErrorMessage();

        Assert.assertTrue(
                actualConfirmPasswordErrorMsg.contains("Mật khẩu không khớp !"),
                "Confirm password error message is incorrect"
        );
    }
}
