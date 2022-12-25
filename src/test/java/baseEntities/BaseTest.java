package baseEntities;

import core.BrowsersService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BoardPage;
import pages.CreateIssuePage;
import steps.*;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;

    protected StartAtlasianStep startAtlasianStep;

    protected ProjectsStep projectStep;
    protected BoardStep boardStep;
    protected CreateIssuesStep createIssuesStep;

    @BeforeMethod
    public void setup() {

        driver = new BrowsersService().getDriver();
        loginStep = new LoginStep(driver);
        startAtlasianStep = new StartAtlasianStep(driver);
        projectStep = new ProjectsStep(driver);
        boardStep = new BoardStep(driver);
        createIssuesStep = new CreateIssuesStep(driver);
        driver.get(configuration.ReadProperties.getUrl());
        loginStep.login(configuration.ReadProperties.username(), configuration.ReadProperties.password());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
