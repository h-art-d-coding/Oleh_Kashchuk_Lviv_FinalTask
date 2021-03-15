import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href,'facebook')]")
    private WebElement facebookLink;
    @FindBy(xpath = "//a[contains(@href,'snapchat')]")
    private WebElement snapchatLink;
    @FindBy(xpath = "//a[contains(@href,'instagram')]")
    private WebElement instagramLink;
    @FindBy(xpath = "//a[contains(@href,'top|men')]")
    private WebElement buttonMen;
    @FindBy(xpath = "//a[contains(@href,'top|women')]")
    private WebElement buttonWomen;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;
    @FindBy(xpath = "//header//button[@data-testid='country-selector-btn']")
    private WebElement flagButton;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement countrySelect;
    @FindBy(xpath = "//select[@id='country']//option[@value='US']")
    private WebElement countrySelectOptionUS;
    @FindBy(xpath = "//button[@data-testid='save-country-button']")
    private WebElement countrySaveButton;
    @FindBy (xpath = "//header//img[@alt='United States']")
    private WebElement usFlagIsDisplayed;
    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    private WebElement myWishListButton;



    public void clickOnFacebookLink()
    {
        facebookLink.click();
    }
    public void clickOnTelegramLink()
    {
        snapchatLink.click();
    }
    public void clickOnInstagramLink()
    {
        instagramLink.click();
    }
    public void clickButtonMen()
    {
        buttonMen.click();
    }
    public void searchByKeyword(final String keyword)
    {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickFlagButton()
    {
        flagButton.click();
    }
    public void clickCountrySelect()
    {
        countrySelect.click();
    }
    public void clickCountrySelectOption()
    {
        countrySelectOptionUS.click();
    }
    public void clickCountySave()
    {
        countrySaveButton.click();
    }
    public boolean usFlagIsDisplay()
    {
        return usFlagIsDisplayed.isDisplayed();
    }
    public void clickWishListButton()
    {
        myWishListButton.click();
    }

}
