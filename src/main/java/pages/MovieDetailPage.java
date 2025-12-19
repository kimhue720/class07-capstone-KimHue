package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovieDetailPage extends CommonPage {

    // Nút Mua vé trên trang chi tiết phim
    private By btnBuyTicket =
            By.xpath("//button[normalize-space()='Mua vé']");

    public MovieDetailPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyTicket() {
        click(btnBuyTicket);
    }
}
