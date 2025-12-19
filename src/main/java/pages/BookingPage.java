package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage extends CommonPage {

    // Suất chiếu (link dẫn tới trang chọn ghế)
    private By byShowTime = By.xpath("//a[contains(@href,'/purchase/')]");

    // Ghế còn trống (button chưa disabled)
    private By bySeat = By.xpath("//button[not(@disabled)]");

    // Nút ĐẶT VÉ
    private By byBtnBookTicket = By.xpath("//span[normalize-space()='ĐẶT VÉ']/ancestor::button");

    public BookingPage(WebDriver driver) {
        super(driver);
    }

    // Step 4: chọn suất chiếu
    public void selectShowTime() {
        click(byShowTime);
    }

    // Step 5: chọn ghế
    public void selectSeat() {
        click(bySeat);
    }

    // Step 6: đặt vé
    public void clickBookTicket() {
        click(byBtnBookTicket);
    }
}
