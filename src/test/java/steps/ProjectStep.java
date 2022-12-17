package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class ProjectStep extends BaseStep {

    public ProjectStep(WebDriver driver) {
        super(driver);
    }

    public void createProjectButtonClick(){
        projectPage.getCreateProjectLocator().click();
    }

    public void choseProject(String projectName){projectPage.getProjectLocator(projectName).click();}
}
