package testcases.register;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class TC05_RegisterFailDuplicateAccount extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @Test
    public void registerFailDuplicateAccount() {

        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);

        // Step 1: Go to homepage
        driver.get("https://demo1.cybersoft.edu.vn");

        // Step 2: Navigate to Register page
        homePage.navigateRegisterPage();

        // Step 3: Enter EXISTING account
        registerPage.enterAccount("kimhue");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.enterName("Kim Huệ");
        registerPage.enterEmail("kimhue1234"); // email không quan trọng

        // Step 4: Click Register
        registerPage.clickRegister();

        // Step 5: Verify duplicate account message
        String actualMsg = registerPage.getDuplicateAccountMessage();
        Assert.assertEquals(
                actualMsg,
                "Tài khoản đã tồn tại!",
                "Duplicate account message is incorrect"
        );
    }
}
