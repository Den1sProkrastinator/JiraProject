package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.BoardPage;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.StartAtlasianPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected StartAtlasianPage startAtlasianPage;
    protected ProjectsPage projectPage;
    protected BoardPage boardPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        startAtlasianPage = new StartAtlasianPage(driver);
        projectPage = new ProjectsPage(driver);
        boardPage = new BoardPage(driver);
    }


}
