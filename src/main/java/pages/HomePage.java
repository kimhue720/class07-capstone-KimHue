package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPage {

    private By byLblUserProfile = By.xpath("//a[@href='/account']/h3");;

    private By byFirstMovieCard = By.xpath("//div[contains(@style,'the-gentlemen_gp09')]");

    private By byMovieList = By.xpath("//div[contains(@class,'ant-card')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getUserProfileName() {
        return getText(byLblUserProfile);
    }

    public void clickFirstMovie() { waitForVisibilityOfElementLocated(byFirstMovieCard);
        click(byFirstMovieCard);
    }

    public void waitForHomePageLoaded() {
        waitForVisibilityOfElementLocated(byMovieList);
    }

}
