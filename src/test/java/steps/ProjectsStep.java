package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class ProjectsStep extends BaseStep {

    public ProjectsStep(WebDriver driver) {
        super(driver);
    }

    public void createProjectButtonClick(){
        projectPage.getCreateProject().click();
    }

    public void choseProject(String projectName){projectPage.getProject(projectName).click();}
}
