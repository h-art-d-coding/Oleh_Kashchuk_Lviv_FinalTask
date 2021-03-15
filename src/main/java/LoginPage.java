import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='Username']")
    private WebElement userNameInput;
    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passWordInput;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//li[@id='loginErrorMessage']")
    private WebElement logginErrorMessage;

    public void inputNameField(final String keyword)
    {
        userNameInput.sendKeys(keyword);
    }
    public void inputPassField(final String keyword)
    {
        passWordInput.sendKeys(keyword);
    }
    public void clickSubmitButton()
    {
        submitButton.click();
    }
    public boolean getLoginErrorMessage(){
        return logginErrorMessage.isDisplayed();
    }
}
