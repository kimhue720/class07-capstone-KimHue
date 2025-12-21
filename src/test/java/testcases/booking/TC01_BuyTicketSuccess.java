package testcases.booking;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BookingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MovieDetailPage;

public class TC01_BuyTicketSuccess extends BaseTest {

    @Test
    public void buyTicketSuccessfully() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MovieDetailPage movieDetailPage = new MovieDetailPage(driver);
        BookingPage bookingPage = new BookingPage(driver);

        // Step 0: Go to home
        driver.get("https://demo1.cybersoft.edu.vn");

        // Step 1: Login
        homePage.navigateLoginPage();
        loginPage.login("KimHue93", "Kim123456@");

        //  CHỜ HOME LOAD XONG
//        homePage.waitForHomePageLoaded();

        // Step 2: Chọn phim đầu tiên
        homePage.clickFirstMovie();

        // Step 3: Click Mua vé
//        movieDetailPage.clickBuyTicket();

        // Step 4: Chọn suất chiếu
        movieDetailPage.selectShowTime();

        // Step 5: Chọn ghế
        bookingPage.selectSeat("86");
        // Step 6: Đặt vé
        bookingPage.clickBookTicket();
    }
}
