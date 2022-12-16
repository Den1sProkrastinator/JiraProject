package baseEntities;

import core.BrowsersService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ProjectPage;
import steps.LoginStep;
import steps.ProjectStep;
import steps.StartAtlasianStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;

    protected StartAtlasianStep startAtlasianStep;

    protected ProjectStep projectStep;
    @BeforeMethod
    public void setup() {

        driver = new BrowsersService().getDriver();
        loginStep = new LoginStep(driver);
        startAtlasianStep= new StartAtlasianStep(driver);
        projectStep = new ProjectStep(driver);
        driver.get(configuration.ReadProperties.getUrl());

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
