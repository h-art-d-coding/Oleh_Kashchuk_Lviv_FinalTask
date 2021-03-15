import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeleteButtonTest extends BaseTest{
    @Test
    private void checkDeleteFromWishlist()
    {
        getHomePage().clickButtonMen();
        getHomePage().implicitWait(30);
        getMenPage().clickShopNowButton();
        getHomePage().implicitWait(30);
        getMenPage().clickWishButtonList();
        getMenPage().clickSavedListButton();
        getSavedListPage().clickDeleteButton();
        assertTrue(getSavedListPage().haveNoSavedIsDisplied());
    }
}
