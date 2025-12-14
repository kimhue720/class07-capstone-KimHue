package testcases.register;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class TC04_RegisterFailEmptyAllFields extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @Test
    public void testRegisterFailEmptyAllFields() {

        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);

        // Step 1: Go to homepage
        driver.get("https://demo1.cybersoft.edu.vn");

        // Step 2: Navigate to Register page
        homePage.navigateRegisterPage();

        // Step 3: DO NOT enter any field

        // Step 4: Click Register
        registerPage.clickRegister();

        // Step 5: Verify required message for all fields
        Assert.assertEquals(
                registerPage.getAccountErrorMessage(),
                "Đây là trường bắt buộc !",
                "Account error message is incorrect"
        );

        Assert.assertEquals(
                registerPage.getPasswordErrorMessage(),
                "Đây là trường bắt buộc !",
                "Password error message is incorrect"
        );

        Assert.assertEquals(
                registerPage.getConfirmPasswordErrorMessage(),
                "Đây là trường bắt buộc !",
                "Confirm password error message is incorrect"
        );

        Assert.assertEquals(
                registerPage.getNameErrorMessage(),
                "Đây là trường bắt buộc !",
                "Name error message is incorrect"
        );

        Assert.assertEquals(
                registerPage.getEmailErrorMessage(),
                "Đây là trường bắt buộc !",
                "Email error message is incorrect"
        );
    }
}
