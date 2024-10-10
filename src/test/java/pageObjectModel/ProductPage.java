package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(xpath = "//select[@data-test='product-sort-container']")
    private WebElement filterButton;
    @FindBy(xpath = "//option[@value='lohi']")
    private WebElement filterLoHi;

    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Verify product page's url
    public String getProductPageUrl() {
        return driver.getCurrentUrl();
    }

    public void setFilterLoHi() {
        filterButton.click();
        filterLoHi.click();
    }
}
