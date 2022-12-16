package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProjectPage;
import pages.StartAtlasianPage;
import steps.StartAtlasianStep;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected StartAtlasianPage startAtlasianPage;
    protected ProjectPage projectPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        startAtlasianPage = new StartAtlasianPage(driver);
        projectPage = new ProjectPage(driver);
    }


}
