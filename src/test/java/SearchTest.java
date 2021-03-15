import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest{

    private String SEARCH_KEYWORD = "Topman denim skinny shorts in black";
    private String EXPECTED_SEARCH_QUERY = "q=topman+denim+skinny+shorts+in+black";

    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }
}
