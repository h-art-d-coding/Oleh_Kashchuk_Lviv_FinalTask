import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenPage extends BasePage
{
    public MenPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='cta__inner']")
    private WebElement shopNowButton;
    @FindBy(xpath = "//article[@id='product-23372316']//button[@class='_2HTnAzH M3dcC1z']")
    private WebElement wishButton;
    @FindBy(xpath = "//a[contains(@href,'saved-lists')]")
    private WebElement savedListButton;
    @FindBy(xpath = "//button[@data-id='029c47b3-2111-43e9-9138-0d00ecf0b3db']")
    private WebElement newInButton;
    @FindBy(xpath = "//a[contains(@href,'/men/new-in/cat/?cid=27110&nlid=mw|new+in|new+p')]")
    private WebElement viewAllButton;
    public void clickShopNowButton()
    {
        shopNowButton.click();
    }
   public void clickWishButtonList()
   {
       wishButton.click();
   }
   public void clickSavedListButton()
   {
       savedListButton.click();
   }
   public void clickNewInButton()
   {
       newInButton.click();
   }
   public void clickViewAllButton()
   {
       viewAllButton.click();
   }
}
