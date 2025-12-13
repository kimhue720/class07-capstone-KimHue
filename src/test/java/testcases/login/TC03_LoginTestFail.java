package testcases.login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class TC03_LoginTestFail extends BaseTest {

    //class variable
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void testinValidLogin() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        //Step 1: Go to https://demo1.cybersoft.edu.vn
        System.out.println("driver = " + driver);
        Reporter.log("Step 1: Go to https://demo1.cybersoft.edu.vn");
        driver.get("https://demo1.cybersoft.edu.vn");

        //Step 2: Click 'Đăng Nhập' link
        homePage.navigateLoginPage();

        //Step 3: Enter account
        String newAcount = "kimhue@gmail.com";
        loginPage.enterAccount(newAcount);

        //Step 4: Click login
        loginPage.clickLogin();

        //Step 5: Verify login fail
        //VP1: "Đây là trường bắt buộc !" message displays
        String actualLoginfailMsg = loginPage.getMessageErrorPassword();
        Assert.assertEquals(actualLoginfailMsg, "Đây là trường bắt buộc !", "Login fail");

    }

}
