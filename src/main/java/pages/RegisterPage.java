package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends CommonPage {

    private By byTxtAccount = By.name("taiKhoan");;
    private By byTxtPassword = By.id("matKhau");;
    private By byTxtConfirmPassword = By.id("confirmPassWord");;
    private By byTxtName = By.id("hoTen");;
    private By byTxtEmail = By.id("email");;
    private By byBtnRegister = By.xpath("//button[.='Đăng ký']");;
    private By byLblRegisterMsg = By.id("swal2-title");;
    private By byLblEmailErrorMsg = By.id("email-helper-text");
    private By byLblConfirmPasswordErrorMsg = By.id("confirmPassWord-helper-text");
    private By byLblAccountErrorMsg = By.id("taiKhoan-helper-text");
    private By byLblPasswordErrorMsg = By.id("matKhau-helper-text");
    private By byLblNameErrorMsg = By.id("hoTen-helper-text");
    private By byDuplicateAccountMessage = By.cssSelector(".MuiAlert-message");
    private By byDuplicateEmailMessage =
            By.xpath("//div[contains(@class,'MuiAlert-message') and contains(text(),'Email đã tồn tại')]");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterAccount(String account) {
        sendKeys(byTxtAccount, account);
    }

    public void enterPassword(String password) {
        sendKeys(byTxtPassword, password);
    }

    public void enterConfirmPassword(String password) {
        sendKeys(byTxtConfirmPassword, password);
    }

    public void enterName(String name) {
        sendKeys(byTxtName, name);
    }

    public void enterEmail(String email) {
        sendKeys(byTxtEmail, email);
    }

    public void clickRegister() {
        click(byBtnRegister);
    }

    public String getMessage() {
        return getText(byLblRegisterMsg);
    }

    public String getEmailErrorMessage() {return getText(byLblEmailErrorMsg); }

    public String getConfirmPasswordErrorMessage() {return getText(byLblConfirmPasswordErrorMsg); }

    public String getAccountErrorMessage() {
        return getText(byLblAccountErrorMsg);
    }

    public String getPasswordErrorMessage() {
        return getText(byLblPasswordErrorMsg);
    }

    public String getNameErrorMessage() {
        return getText(byLblNameErrorMsg);
    }

    public String getDuplicateAccountMessage() { return getText(byDuplicateAccountMessage); }

    public String getDuplicateEmailMessage() { return getText(byDuplicateEmailMessage); }

}

