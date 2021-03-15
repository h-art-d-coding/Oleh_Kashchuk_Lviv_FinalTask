import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToWishListTest extends BaseTest {

    private String EXPECTED_ELEMENT = "1 item";

    @Test (priority = 1)
    public void checkAddToWishList()
    {
        getHomePage().clickButtonMen();
        getHomePage().implicitWait(30);
        getMenPage().clickShopNowButton();
        getHomePage().implicitWait(30);
        getMenPage().clickWishButtonList();
        getMenPage().clickSavedListButton();
        assertEquals(getSavedListPage().getItemsDiv(), EXPECTED_ELEMENT);
    }
}
