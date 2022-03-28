package page_models.users;

import org.openqa.selenium.WebDriver;
import utils.Drivers;

/**
 * <strong>SINGLETON</strong>
 * <br />
 * Used to initialize all Page Object Models.
 * <br />
 * Use <i>getFactories()</i> to instantiate.
 */
public class _Factories {
    private static _Factories FACTORIES;
    Factory_Users_Home

    private _Factories (WebDriver driver) {
        this.home = new Factory_Home(driver);
    }

    public static _Factories getFactories() {
        if (FACTORIES == null) {
            FACTORIES = new _Factories(Drivers.getDriver());
        }
        return FACTORIES;
    }
}
