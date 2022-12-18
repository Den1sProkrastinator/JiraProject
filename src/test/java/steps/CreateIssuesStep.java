package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateIssuesStep extends BaseStep {
    public CreateIssuesStep(WebDriver driver) {
        super(driver);
    }

    public void selectBugIssues(){
        createIssuePage.getSelectIssueTypeLocator().click();
        createIssuePage.getIssueTypeBugLocator().click();
    }

    public void selectStatus(){
        createIssuePage.getSelectStatusLocator().click();
        createIssuePage.getStatusTypeInTestingLocator().click();
    }

}
