import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeleteFromCartTest extends BaseTest{
    @Test
    public void deleteFromCart()
    {
        getHomePage().clickButtonMen();
        getMenPage().waitForPageLoadComplete(30);
        getMenPage().clickNewInButton();
        getMenPage().implicitWait(30);
        getMenPage().clickViewAllButton();
        getViewAllPage().waitForPageLoadComplete(30);
        getViewAllPage().clickProducrCard();
        getProductPage().waitForPageLoadComplete(30);
        getProductPage().clickPleaseSelected();
        getProductPage().implicitWait(5);
        getProductPage().clickSelectSize();
        getProductPage().clickAddToBagButton();
        getProductPage().clickCartButton();
        getProductPage().implicitWait(5);
        getProductPage().clickDeleteFromCartButton();
        assertTrue(getProductPage().cartZeroIsDisplayed());
    }
}
