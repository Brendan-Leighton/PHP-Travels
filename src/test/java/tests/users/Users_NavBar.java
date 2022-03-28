package tests.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page_models._Factories;
import page_models.users.Factory_Users_Navbar;
import tests._BaseTest;
import utils.*;

import java.util.HashMap;
import java.util.Map;

public class Users_NavBar extends _BaseTest {

    private Factory_Users_Navbar Navbar;
    public Users_NavBar() {
       Navbar = _Factories.getUsersNavbar();
    }

    // NAVBAR from HOME
    @Test
    public void Home_to_Home() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_home(), SiteUrls.getHome());
    }

    @Test
    public void Home_to_LogoHome() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_logo(), SiteUrls.getHome());
    }

    @Test
    public void Home_to_Hotels() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_hotels(), SiteUrls.getHotels());
    }

    @Test
    public void Home_to_Flights() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_flights(), SiteUrls.getFlights());
    }

    @Test
    public void Home_to_Tours() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_tours(), SiteUrls.getTours());
    }

    @Test
    public void Home_to_Visa() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_visa(), SiteUrls.getVisa());
    }

    @Test
    public void Home_to_Blog() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_blog(), SiteUrls.getBlog());
    }

    @Test
    public void Home_to_Offers() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_offers(), SiteUrls.getOffers());
    }

    @Test
    public void Home_to_Company() {
        Navbar.test(SiteUrls.getHome(), Navbar.getNavbar_company(), SiteUrls.getCompany());
    }

    // NAVBAR from HOTELS

    @Test
    public void Hotels_to_Home() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_home(), SiteUrls.getHome());
    }

    @Test
    public void Hotels_to_LogoHome() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_logo(), SiteUrls.getHome());
    }

    @Test
    public void Hotels_to_Hotels() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_hotels(), SiteUrls.getHotels());
    }

    @Test
    public void Hotels_to_Flights() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_flights(), SiteUrls.getFlights());
    }

    @Test
    public void Hotels_to_Tours() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_tours(), SiteUrls.getTours());
    }

    @Test
    public void Hotels_to_Visa() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_visa(), SiteUrls.getVisa());
    }

    @Test
    public void Hotels_to_Blog() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_blog(), SiteUrls.getBlog());
    }

    @Test
    public void Hotels_to_Offers() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_offers(), SiteUrls.getOffers());
    }

    @Test
    public void Hotels_to_Company() {
        Navbar.test(SiteUrls.getHotels(), Navbar.getNavbar_company(), SiteUrls.getCompany());
    }
}
