package page_models.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Drivers;
import utils.SiteUrls;
import utils.Waits;

public class Factory_Users_Navbar extends Factory__Index {


    Actions actionProvider;
    // CONSTRUCTOR
    public Factory_Users_Navbar(WebDriver driver) {
        super(SiteUrls.getHome());
        PageFactory.initElements(driver, this);

        actionProvider = new Actions(driver);
    }

    //
    // NAVBAR BUTTONS - LOCATORS
    //

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

    // company dropdown

    @FindBy (xpath = "//nav/ul/li")
    private WebElement navbar_company_dropdown;

    public WebElement getNavbar_company_dropdown() {
        return navbar_company_dropdown;
    }

    private final String dropdownEl = "//div[@class=\"main-menu-content\"]/nav/ul//li[@class=\"footm\"]/ul[@class=\"dropdown-menu-item\"]";

    @FindBy (xpath = dropdownEl + "/li/a[contains(text(), \"About Us\")]")
    private WebElement navbar_dropdown_aboutUs;

    @FindBy (xpath = dropdownEl + "/li/a[contains(text(), \"Terms of Use\")]")
    private WebElement navbar_dropdown_termsOfUse;

    @FindBy (xpath = dropdownEl + "/li/a[contains(text(), \"FAQ\")]")
    private WebElement navbar_dropdown_faq;

    @FindBy (xpath = dropdownEl + "/li/a[contains(text(), \"How to Book\")]")
    private WebElement navbar_dropdown_howToBook;

    //
    // NAVBAR BUTTONS - GETTERS
    //
    public WebElement getNavbar_logo() {return navbar_logo;}
    public WebElement getNavbar_home() {return navbar_home;}
    public WebElement getNavbar_hotels() {return navbar_hotels;}
    public WebElement getNavbar_flights() {return navbar_flights;}
    public WebElement getNavbar_tours() {return navbar_tours;}
    public WebElement getNavbar_visa() {return navbar_visa;}
    public WebElement getNavbar_blog() {return navbar_blog;}
    public WebElement getNavbar_offers() {return navbar_offers;}
    public WebElement getNavbar_company() {return navbar_company;}
    public WebElement getNavbar_dropdown_aboutUs() {return navbar_dropdown_aboutUs;}
    public WebElement getNavbar_dropdown_termsOfUse() {return navbar_dropdown_termsOfUse;}
    public WebElement getNavbar_dropdown_faq() {return navbar_dropdown_faq;}
    public WebElement getNavbar_dropdown_howToBook() {return navbar_dropdown_howToBook;}

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

    /**
     * Test navbar navigation where navbar element has a dropdown
     * <ol>
     *     <li>Navigate to the "fromUrl"</li>
     *     <li>Move mouse to the "dropdownEl" which is nav element with a dropdown</li>
     *     <li>Click on the "navEl" in the dropdown</li>
     *     <li>Assert arrival to the "toUrl"</li>
     * </ol>
     *
     * @param fromUrl : The URL of the page whose navbar we are testing
     * @param navEl : The WebElement in the navbar we are testing
     * @param toUrl : The Expected destination after click the navbar element
     */
    public void testDropDownLink(String fromUrl, WebElement dropdownEl, WebElement navEl, String toUrl) {

        // navigate to page with navbar being tested
        Drivers.getDriver().navigate().to(fromUrl);

        // check for that damn cookie popup message
        try {
            WebElement damnCookiePopup = Drivers.getDriver().findElement(new By.ById("cookie_stop"));
            Waits.forElement(damnCookiePopup);
            damnCookiePopup.click();
        } catch (Exception ignore) {}

        // Performs mouse move action onto the element with a dropdown
        new Actions(Drivers.getDriver()).moveToElement(dropdownEl).perform();

        // click that bad boiiii
        Waits.forElement_andClick(navEl);

        // assert proper url after navigation
        Assert.assertEquals(Drivers.getDriver().getCurrentUrl(), toUrl);
    }
}
