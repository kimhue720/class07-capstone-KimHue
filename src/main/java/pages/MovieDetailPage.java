package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovieDetailPage extends CommonPage {

    // Nút Mua vé trên trang chi tiết phim
    private By btnBuyTicket =
            By.xpath("//button[normalize-space()='Mua vé']");
    // Suất chiếu (link dẫn tới trang chọn ghế)
    private By byShowTime = By.xpath("//a[contains(@href,'/purchase/')][p[contains(text(),'07-12-2025')]][p[contains(text(),'06:00')]]");

    public MovieDetailPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyTicket() {
        click(btnBuyTicket);
    }
    // Step 4: chọn suất chiếu
    public void selectShowTime() {
        click(byShowTime);
    }
}
