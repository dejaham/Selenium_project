package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPart2Page {

    @FindBy(className = "inventory_item_name")
    private WebElement titleArticle;
    @FindBy(className = "inventory_item_price")
    private WebElement priceArticle;
    @FindBy(xpath = "//div[contains(@class, 'summary_total_label')]")
    private WebElement totalPriceArticle;
    @FindBy(id = "finish")
    private WebElement finishButton;


    WebDriver driver;
    public CheckoutPart2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrlWebPage() {
        return driver.getCurrentUrl();
    }

    public String getTitleArticle() {
        return titleArticle.getText();
    }

    public String getPriceArticle() {
        return priceArticle.getText();
    }

    public String getTotalPriceArticle() {
        return totalPriceArticle.getText();
    }

    public void clickOnFinishButton() {
        finishButton.click();
    }


}
