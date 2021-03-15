import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SocialLinksTest extends BaseTest {

    private final String FACEBOOK_URL = "https://www.facebook.com/ASOS/";
    private final String SNAPCHAT_URL = "https://www.snapchat.com/add/asosfashion";
    private final String INSTAGRAM_URL = "https://www.instagram.com/asos/";

    @Test(priority = 1)
    public void checkFacebookLinkWork(){
        getHomePage().clickOnFacebookLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(FACEBOOK_URL));
    }
    @Test(priority = 2)
    public void checkSnapchatLinkWork(){
        getHomePage().clickOnTelegramLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(SNAPCHAT_URL));
    }
    @Test(priority = 3)
    public void checkInstagramLinkWork(){
        getHomePage().clickOnInstagramLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(INSTAGRAM_URL));
    }
}
