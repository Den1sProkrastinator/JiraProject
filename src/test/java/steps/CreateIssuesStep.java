package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateIssuesStep extends BaseStep {
    public CreateIssuesStep(WebDriver driver) {
        super(driver);
    }

    public void selectBugIssues(){
        createIssuePage.getSelectIssueType().click();
        createIssuePage.getIssueTypeBug().click();

    }

    public void selectStatus(){
        createIssuePage.getSelectStatus().click();
        createIssuePage.getStatusTypeInTesting().click();
    }

    public void writeSummary(String summaryText){
        createIssuePage.getSummary().sendKeys(summaryText);
    }

    public void writeDescription(String descriptionText){
        createIssuePage.getDescription().sendKeys(descriptionText);
    }
    public void createIssue(){
        createIssuePage.getCreateButton().click();
    }

}
