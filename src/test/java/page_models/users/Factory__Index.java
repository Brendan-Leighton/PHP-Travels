package page_models.users;
// JAVA
import java.util.*;
// SELENIUM
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
// TEST-NG
import org.testng.asserts.SoftAssert;
// MY CUSTOM
import utils.*;

/**
 * <h3>WebPageFactory METHODS:</h3>
 * <ul>
 *      <li>getButton_Home(): get "Home" button from navbar</li>
 *      <li>getUrl(): gets this pages url</li>
 *      <li>navigateTo(): given an ArrayList of WebElements,
 *          <ol><li>The driver will go to the site's Home-page</li>
 *          <li>loop and click the WebElements in the list</li>
 *          <li>assert the final URL matches this.url</li></ol></li>
 * </ul>
 */
public abstract class Factory__Index {
    // PROPS
    private final String pageUrl;
    private final String pageHomeUrl = SiteUrls.getHome();;
    private final List<WebElement> navigationElements = new ArrayList<>();

    // CONSTRUCTOR
    public Factory__Index(String webPageUrl) {
        pageUrl = webPageUrl;
//        spreadsheet_data = pages.BaseTest.getSpreadsheet_Data();
    }



    /**
     * <h1>Navigate to this page</h1>
     * <ol>
     *     <li>Check if we're already on this webpage</li>
     *     <li>IF: Not on this page, go to website's home-page</li>
     *     iteration not yet added
     *     <li>Iterate a List of WebElements to traverse the site until we get to this page</li>
     * </ol>
     */
    public void navigateTo() {
        if (Drivers.getDriver().getCurrentUrl().equals(this.pageHomeUrl)) {
            return;
        }

        // navigate to home page
        Drivers.getDriver().navigate().to(this.pageHomeUrl);
        // wait for page load and assert correct url
        Asserts.navigation_toUrl(this.pageHomeUrl);
    }

    public String getUrl() {
        return this.pageUrl;
    }
}
