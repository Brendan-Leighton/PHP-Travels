package utils;

/**
 * <strong>SINGLETON</strong>
 * Holds all URLs on the site.
 * URL come from {@link resources/Props.properties}
 */
public class SiteUrls {
    // SINGLETON
    private static SiteUrls SITE_URLS;
    // PROPS
    public static String home;
    public static String hotels;
    public static String tours;
    public static String flights;
    public static String visa;
    public static String blog;
    public static String offers;
    public static String company;
    public static String aboutUs;
    public static String termsOfUs;
    public static String faq;
    public static String howToBook;

    // CONSTRUCTOR
    private SiteUrls() {
        home = Props.getProp("url_user_home");
        hotels = Props.getProp("url_user_hotels");
        tours = Props.getProp("url_user_tours");
        flights = Props.getProp("url_user_flights");
        visa = Props.getProp("url_user_visa");
        blog = Props.getProp("url_user_blog");
        offers = Props.getProp("url_user_offers");
        company = Props.getProp("url_user_company");
        aboutUs = Props.getProp("url_user_about-us");
        termsOfUs = Props.getProp("url_user_terms-of-use");
        faq = Props.getProp("url_user_faq");
        howToBook = Props.getProp("url_user_how-to-book");
    }

    // GET this CLASS
    public static SiteUrls Get() {
        if (SITE_URLS == null) SITE_URLS = new SiteUrls();
        return SITE_URLS;
    }

    // URL GETTERS
    public static String getHome() {
        Get();
        return home;
    }

    public static String getHotels() {
        Get();
        return hotels;
    }

    public static String getTours() {
        Get();
        return tours;
    }

    public static String getFlights() {
        Get();
        return flights;
    }

    public static String getVisa() {
        Get();
        return visa;
    }

    public static String getBlog() {
        Get();
        return blog;
    }

    public static String getOffers() {
        Get();
        return offers;
    }

    public static String getCompany() {
        Get();
        return company;
    }

    public static String getAboutUs() {
        Get();
        return aboutUs;
    }

    public static String getTermsOfUs() {
        Get();
        return termsOfUs;
    }

    public static String getFaq() {
        Get();
        return faq;
    }

    public static String getHowToBook() {
        Get();
        return howToBook;
    }
}
