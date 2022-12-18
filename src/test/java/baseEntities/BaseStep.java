package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected StartAtlasianPage startAtlasianPage;
    protected ProjectsPage projectPage;
    protected BoardPage boardPage;
    protected CreateIssuePage createIssuePage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        startAtlasianPage = new StartAtlasianPage(driver);
        projectPage = new ProjectsPage(driver);
        boardPage = new BoardPage(driver);
        createIssuePage = new CreateIssuePage(driver);
    }


}
