import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest{

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";

    @Test
    public void checkAddToCart() {
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
        assertEquals(getProductPage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }
}
