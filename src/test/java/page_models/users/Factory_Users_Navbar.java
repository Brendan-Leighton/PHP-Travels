package page_models.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Drivers;
import utils.SiteUrls;

public class Factory_Users_Navbar extends Factory__Index {
    // CONSTRUCTOR
    public Factory_Users_Navbar(WebDriver driver) {
        super(SiteUrls.getHome());
        PageFactory.initElements(driver, this);
    }

    // NAVBAR BUTTONS - LOCATORS
    @FindBy(xpath = "//div[@class=\"logo\"]/a")
    private WebElement navbar_logo;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Home\")]")
    private WebElement navbar_home;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Hotels\")]")
    private WebElement navbar_hotels;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Tours\")]")
    private WebElement navbar_tours;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"flights\")]")
    private WebElement navbar_flights;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"visa\")]")
    private WebElement navbar_visa;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Blog\")]")
    private WebElement navbar_blog;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Offers\")]")
    private WebElement navbar_offers;

    @FindBy (xpath = "//nav/ul/li/a[contains(text(), \"Company\")]")
    private WebElement navbar_company;

    // NAVBAR BUTTONS - GETTERS
    public WebElement getNavbar_logo() {return navbar_logo;}
    public WebElement getNavbar_home() {return navbar_home;}
    public WebElement getNavbar_hotels() {return navbar_hotels;}
    public WebElement getNavbar_flights() {return navbar_flights;}
    public WebElement getNavbar_tours() {return navbar_tours;}
    public WebElement getNavbar_visa() {return navbar_visa;}
    public WebElement getNavbar_blog() {return navbar_blog;}
    public WebElement getNavbar_offers() {return navbar_offers;}
    public WebElement getNavbar_company() {return navbar_company;}

    /**
     * Test navbar navigation.
     * <ol>
     *     <li>Navigate to "fromUrl"</li>
     *     <li>Click on "navEl"</li>
     *     <li>Assert arrival to "toUrl"</li>
     * </ol>
     *
     * @param fromUrl : The URL of the page whose navbar we are testing
     * @param navEl : The WebElement in the navbar we are testing
     * @param toUrl : The Expected destination after click the navbar element
     */
    public void test(String fromUrl, WebElement navEl, String toUrl) {
        Drivers.getDriver().navigate().to(fromUrl);
        navEl.click();
        Assert.assertEquals(Drivers.getDriver().getCurrentUrl(), toUrl);
    }
}
