package tests;
// JAVA
import java.io.IOException;
// SELENIUM : web driver
import org.openqa.selenium.WebDriver;
// TEST NG
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
// LOG-4-J
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
// CUSTOM
import page_models._Factories;
import utils.Asserts;
import utils.Drivers;
import utils.SiteUrls;
import utils.Waits;

public class _BaseTest {
    private _Factories FACTORIES;
    WebDriver driver;
    Waits waits;
    Asserts asserts;
    SiteUrls urls;
    static Logger logger = LogManager.getLogger(_BaseTest.class);

    @BeforeSuite
    public void setup() throws IOException {
//        PropertyConfigurator.configure("C:\\Users\\br3nd\\IdeaProjects\\GenSpark\\PHP-Travels\\src\\test\\java\\resources\\log4j2-test.properties");

        // INITIALIZE WEB-DRIVER
        driver = Drivers.getDriver();
        driver.manage().window().maximize();

        // INITIALIZE UTILS - must initialize web-drivers first
        waits = Waits.getWaits();
        asserts = Asserts.getAsserts();
        FACTORIES = _Factories.getFactories();
        urls = SiteUrls.Get();

        // HERE FOR REFERENCE, UNCOMMENT TO USE
//        logger.info("@BeforeTest: info");
//        logger.warn("@BeforeTest: warn");
//        logger.error("@BeforeTest: error");
//        logger.debug("@BeforeTest: debug");
//        logger.fatal("@BeforeTest: fatal");
    }

    @AfterTest
    public void teardown() { Drivers.quit(); }
}
