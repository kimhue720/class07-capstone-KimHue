package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage extends CommonPage {



    // Ghế còn trống (button chưa disabled)
    //private By bySeat = By.xpath("//button[not(@disabled)]");

    // Nút ĐẶT VÉ
    private By byBtnBookTicket = By.xpath("//span[normalize-space()='ĐẶT VÉ']/ancestor::button");

    public BookingPage(WebDriver driver) {
        super(driver);
    }



    // Step 5: chọn ghế
    public void selectSeat(String numberSeat) {
        By bySeat = By.xpath("//button[not(@disabled)][span[contains(text(),'"+numberSeat+"')]]");
        click(bySeat);
    }

    // Step 6: đặt vé
    public void clickBookTicket() {
        click(byBtnBookTicket);
    }
}
