package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

    @FindBy(tagName = "h2")
    private WebElement titleConfirmation;

    WebDriver driver;
    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getWebUrlConfirmationPage() {
        return driver.getCurrentUrl();
    }

    public String getTitleConfirmationPayment() {
        return titleConfirmation.getText();
    }
}
