import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllPage extends BasePage{
    public ViewAllPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//article[@class='_2qG85dG'][1]")
    private WebElement productCard;

    public void clickProducrCard()
    {
        productCard.click();
    }
}
