package page_models;

import org.openqa.selenium.WebDriver;
import page_models.users.Factory_Users_Home;
import page_models.users.Factory_Users_Navbar;
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

    // USERS PAGES
    Factory_Users_Navbar navbar_users;
    Factory_Users_Home home_users;

    // CONSTRUCTOR
    private _Factories(WebDriver driver) {
        this.navbar_users = new Factory_Users_Navbar(driver);
        this.home_users = new Factory_Users_Home(driver);
    }

    // GETTER / INITIALIZER
    public static _Factories getFactories() {
        if (FACTORIES == null) {
            FACTORIES = new _Factories(Drivers.getDriver());
        }
        return FACTORIES;
    }

    //
    // PAGE OBJECT GETTERS
    //

    // USERS
    public static Factory_Users_Home getUsersHome() {
        return getFactories().home_users;
    }


    public static Factory_Users_Navbar getUsersNavbar() {
        return getFactories().navbar_users;
    }
}
