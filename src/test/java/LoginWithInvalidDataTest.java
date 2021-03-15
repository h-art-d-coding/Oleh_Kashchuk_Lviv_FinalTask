import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginWithInvalidDataTest extends BaseTest{

    public String TEST_EMAIL = "test@test.com";
    public String TEST_PASSWORD = "TEST";
    @Test
    public void checkThatUserCantLoginWithIncorrectData()
    {
        getHomePage().waitForPageLoadComplete(30);
        getHomePage().clickWishListButton();
        getWishListPage().waitForPageLoadComplete(30);
        getWishListPage().clickSignInLink();
        getLoginPage().waitForPageLoadComplete(30);
        getLoginPage().inputNameField(TEST_EMAIL);
        getLoginPage().implicitWait(10);
        getLoginPage().inputPassField(TEST_PASSWORD);
        getLoginPage().implicitWait(10);
        getLoginPage().clickSubmitButton();
        assertTrue(getLoginPage().getLoginErrorMessage());
    }

}
