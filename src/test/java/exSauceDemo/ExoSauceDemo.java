package exSauceDemo;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        Assertions.assertTrue(objProductPage.getProductPageUrl().contains("inventory.html"));
    }

    @Test
    public void t002_filterByPrice() {
        ProductPage objProductPage = new ProductPage(driver);
        objProductPage.setFilterLoHi();
        Assertions.assertTrue(objProductPage.isListInOrder());
    }


}
