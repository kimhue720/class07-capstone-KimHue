package testcases.login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class TC04_LoginFail extends BaseTest {

    //class variable
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void testfailLogin() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        //Step 1: Go to https://demo1.cybersoft.edu.vn
        System.out.println("driver = " + driver);
        Reporter.log("Step 1: Go to https://demo1.cybersoft.edu.vn");
        driver.get("https://demo1.cybersoft.edu.vn");

        //Step 2: Click 'Đăng Nhập' link
        homePage.navigateLoginPage();

        //Step 3: Click login
        loginPage.clickLogin();

        //Step 4: Verify login fail
        //VP1: "Đây là trường bắt buộc !" message displays
        String actualLoginfailaccountMsg = loginPage.getMessageErrorAccount();
        Assert.assertEquals(actualLoginfailaccountMsg, "Đây là trường bắt buộc !", "Login fail");

        //VP2: "Đây là trường bắt buộc !" message displays
        String actualLoginfailpasswordMsg = loginPage.getMessageErrorPassword();
        Assert.assertEquals(actualLoginfailpasswordMsg, "Đây là trường bắt buộc !", "Login fail");
    }

}
