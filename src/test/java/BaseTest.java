import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String ASOS_URL = "https://www.asos.com/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASOS_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }
    public MenPage getMenPage() {
        return new MenPage(getDriver());
    }
    public SavedListPage getSavedListPage() {
        return new SavedListPage(getDriver());
    }
    public ProductPage getProductPage() {
        return new ProductPage(getDriver());
    }
    public ViewAllPage getViewAllPage() {
        return new ViewAllPage(getDriver());
    }
    public WishListPage getWishListPage() {
        return new WishListPage(getDriver());
    }
    public LoginPage getLoginPage() {
        return new LoginPage(getDriver());
    }
}
