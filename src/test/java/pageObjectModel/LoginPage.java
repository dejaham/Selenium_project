package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    // Page Factory
    //  username
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    //  password
    @FindBy(id = "password")
    private WebElement passwordInput;
    //  button login
    @FindBy(id = "login-button")
    private WebElement buttonLogin;

    WebDriver driver;
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Object
    public void logInAsUser() {
        // Fill username
        usernameInput.click();
        usernameInput.sendKeys("standard_user");
        // Fill password
        passwordInput.click();
        passwordInput.sendKeys("secret_sauce");
        // Click button login
        buttonLogin.click();

    }


}
