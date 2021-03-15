import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@data-test-id='add-button']")
    private WebElement addToBagButton;
    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement pleaseSelected;
    @FindBy(xpath = "//select[@data-id='sizeSelect']//option[2]")
    private WebElement selectSize;
    @FindBy (xpath = "//span[@class='_1z5n7CN']")
    private WebElement cartButtton;
    @FindBy(xpath = "//button[@aria-label='Delete this item']")
    private WebElement deleteFromCart;
    @FindBy(xpath = "//a[@aria-label='Bag 0 items']")
    private WebElement bugZeroItems;

    public void clickAddToBagButton()
    {
        addToBagButton.click();
    }
    public void clickPleaseSelected()
    {
        pleaseSelected.click();
    }
    public void clickSelectSize()
    {
        selectSize.click();
    }
    public boolean cartZeroIsDisplayed()
    {
        return bugZeroItems.isDisplayed();
    }
    public void clickCartButton()
    {
        cartButtton.click();
    }
    public void clickDeleteFromCartButton()
    {
        deleteFromCart.click();
    }

    public String getTextOfAmountProductsInCart()
    {
        return cartButtton.getText();
    }
}
