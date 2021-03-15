import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement singnInLink;

    public void clickSignInLink()
    {
        singnInLink.click();
    }
}
