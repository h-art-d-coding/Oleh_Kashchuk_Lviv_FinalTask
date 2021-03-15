import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChangeCountryTest extends BaseTest{

    @Test
    public void checkFiterBySale()
    {
        getHomePage().clickFlagButton();
        getHomePage().implicitWait(5);
        getHomePage().clickCountrySelect();
        getHomePage().clickCountrySelectOption();
        getHomePage().clickCountySave();
        assertTrue(getHomePage().usFlagIsDisplay());
    }
}
