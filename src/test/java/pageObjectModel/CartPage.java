package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(className = "inventory_item_name")
    private WebElement articleInCart;

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrlWebPage() {
        return driver.getCurrentUrl();
    }

    public String getArticleInCart() {
        return articleInCart.getText();
    }

    public void clickCheckout() {
        checkoutBtn.click();
    }
}
