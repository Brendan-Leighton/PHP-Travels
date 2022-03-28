package page_models.users;
// SELENIUM
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory_Users_Home extends Factory__Index {

    // CONSTRUCTOR
    public Factory_Users_Home(WebDriver driver) {
        super(
                "https://www.phptravels.net/"
        );
        PageFactory.initElements(driver, this);
    }



}
