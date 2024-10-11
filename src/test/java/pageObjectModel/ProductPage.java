package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductPage {
    @FindBy(xpath = "//select[@data-test='product-sort-container']")
    private WebElement filterButton;
    @FindBy(xpath = "//option[@value='lohi']")
    private WebElement filterLoHi;
    @FindBy(xpath = "//div[@data-test='inventory-item-price']")
    private List<WebElement> listPrice;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartBikeLight;

    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Verify product page's url
    public String getProductPageUrl() {
        return driver.getCurrentUrl();
    }

    // filtre de prix croissant
    public void setFilterLoHi() {
        filterButton.click();
        filterLoHi.click();
    }

    public boolean isListInOrder() {
        // Liste String ou on va recupérer tous les élements de notre list de WebElements
        List<String> list = new ArrayList<>();
        // Créer une boucle FOR, permet de lire chaque element de listPrice pour les ajouter dans list
        for(WebElement orderList: listPrice) {
            list.add(orderList.getText().replaceAll("[^\\d]", ""));
        }

        // iterator = taille de notre list
        Iterator<String> iterator = list.iterator();
        // convertir le premier élément d'un iterator en un int
        int current, previous = Integer.parseInt(iterator.next());
        while (iterator.hasNext()) {
            current = Integer.parseInt(iterator.next());
            if(previous>current) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public void clickAddToCartBikeLight() {
       addToCartBikeLight.click();
    }
}
