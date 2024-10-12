package exSauceDemo;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.CartPage;
import pageObjectModel.HeaderPage;
import pageObjectModel.LoginPage;
import pageObjectModel.ProductPage;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ExoSauceDemo {
    static WebDriver driver;
    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void t001_logInUser() {
        LoginPage objLoginPage = new LoginPage(driver);
        ProductPage objProductPage = new ProductPage(driver);
        objLoginPage.logInAsUser();
        Assertions.assertTrue(objProductPage.getProductPageUrl().contains("inventory.html"), "Error:Article Page is not reached");
    }

    @Test
    public void t002_filterByPrice() {
        ProductPage objProductPage = new ProductPage(driver);
        objProductPage.setFilterLoHi();
        Assertions.assertTrue(objProductPage.isListInOrder(), "Error: List not ordered correctly");
    }

    @Test
    public void t003_addArticleToCart() {
        ProductPage objProductPage = new ProductPage(driver);
        HeaderPage objHeaderPage = new HeaderPage(driver);
        objProductPage.clickAddToCartBikeLight();
        Assertions.assertTrue(objHeaderPage.isArticleAdded(), "Error: Cart does not contains 1 element");

    }

    @Test
    public void t004_clickOnCartAndCheckArticle() {
        HeaderPage objHeaderPage = new HeaderPage(driver);
        CartPage objCartPage = new CartPage(driver);
        objHeaderPage.clickOnCart();
        Assertions.assertTrue(objCartPage.getUrlWebPage().contains("cart.html"));
        Assertions.assertEquals(objCartPage.getArticleInCart(), "Sauce Labs Bike Light", "Error: Article in cart is not the one expected");
        objCartPage.clickCheckout();

    }


}
