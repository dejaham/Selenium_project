package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    @FindBy(id = "first-name")
    private WebElement inputFirstName;

    @FindBy(id = "last-name")
    private WebElement inputLastName;

    @FindBy(id = "postal-code")
    private WebElement inputPostalCode;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrlCheckout() {
        return driver.getCurrentUrl();
    }

    public void fillInformationInCheckout() {
        inputFirstName.click();
        inputFirstName.sendKeys("udemy");
        inputLastName.click();
        inputLastName.sendKeys("udemy");
        inputPostalCode.click();
        inputPostalCode.sendKeys("12345");

    }

    public void clickOnContinue() {
        continueBtn.click();
    }
}
