package baseEntities;

import core.WaitService;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WaitService waitService;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        waitService = new WaitService(driver, Duration.ofSeconds(configuration.ReadProperties.timeout()));

    }

}
