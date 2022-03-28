package tests.users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_models._Factories;
import page_models.users.Factory_Users_Home;
import tests._BaseTest;
import utils.Asserts;

public class Users_Home extends _BaseTest {

    Factory_Users_Home HOME;

    public Users_Home() {
        // PAGE FACTORIES
        HOME = _Factories.getUsersHome();
    }

    @BeforeMethod
    public void toHome() {
        HOME.navigateTo();
    }

    @Test
    public void PracticeTests() {
    }
}
