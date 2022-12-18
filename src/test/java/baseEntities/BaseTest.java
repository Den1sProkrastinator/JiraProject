package baseEntities;

import core.BrowsersService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BoardPage;
import steps.BoardStep;
import steps.LoginStep;
import steps.ProjectsStep;
import steps.StartAtlasianStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;

    protected StartAtlasianStep startAtlasianStep;

    protected ProjectsStep projectStep;
    protected BoardStep boardStep;
    @BeforeMethod
    public void setup() {

        driver = new BrowsersService().getDriver();
        loginStep = new LoginStep(driver);
        startAtlasianStep= new StartAtlasianStep(driver);
        projectStep = new ProjectsStep(driver);
        boardStep=new BoardStep(driver);
        driver.get(configuration.ReadProperties.getUrl());

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
