import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SavedListPage  extends BasePage{
    public SavedListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='itemCount_1ZeG5']")
    private WebElement itemsDiv;
    @FindBy(xpath = "//button[@class='deleteButton_Za13- deleteButton_2VxuB']")
    private WebElement deleteButton;
    @FindBy(xpath = "//h2[@class='noItemsPrompt_1TiQf']")
    private WebElement haveNoSaved;

    public String getItemsDiv()
    {
        return itemsDiv.getText();
    }
    public void clickDeleteButton()
    {
        deleteButton.click();
    }
    public boolean haveNoSavedIsDisplied(){
        return haveNoSaved.isDisplayed();
    }
}
