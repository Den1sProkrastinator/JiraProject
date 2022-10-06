package baseEntities;

import core.BrowsersService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.LoginStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    @BeforeMethod
    public void setup() {

        driver = new BrowsersService().getDriver();
        loginStep = new LoginStep(driver);
        driver.get(configuration.ReadProperties.getUrl());

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
