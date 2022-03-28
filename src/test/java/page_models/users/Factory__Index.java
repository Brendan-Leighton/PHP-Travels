package page_models;
// JAVA
import java.util.*;
// SELENIUM
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
// MY CUSTOM
import utils.Asserts;
import utils.Drivers;
import utils.Waits;

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

}
