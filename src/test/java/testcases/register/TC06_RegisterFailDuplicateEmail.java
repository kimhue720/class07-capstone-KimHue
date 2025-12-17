package testcases.register;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import java.util.UUID;

public class TC06_RegisterFailDuplicateEmail extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @Test
    public void registerFailDuplicateEmail() {

        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);

        // Step 1: Go to homepage
        driver.get("https://demo1.cybersoft.edu.vn");

        // Step 2: Navigate to Register page
        homePage.navigateRegisterPage();

        // Step 3: Enter NEW account but EXISTING email
        String newAccount = "kimhue" + UUID.randomUUID().toString().replace("-", "");

        registerPage.enterAccount(newAccount);
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.enterName("Kim Huệ");

        // Email đã tồn tại (bắt buộc là email đã register trước đó)
        registerPage.enterEmail("kimhue1234@gmail.com");

        // Step 4: Click Register
        registerPage.clickRegister();

        // Step 5: Verify duplicate email message
        String actualMsg = registerPage.getDuplicateEmailMessage();
        Assert.assertEquals(
                actualMsg,
                "Email đã tồn tại!",
                "Duplicate email message is incorrect"
        );
    }
}
