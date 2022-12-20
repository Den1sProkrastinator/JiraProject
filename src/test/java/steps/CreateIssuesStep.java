package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateIssuesStep extends BaseStep {
    public CreateIssuesStep(WebDriver driver) {
        super(driver);
    }

    public void selectBugIssues(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        createIssuePage.getSelectIssueTypeLocator().click();
        createIssuePage.getStatusTypeInTestingLocator().sendKeys("Bug");
        createIssuePage.getStatusTypeInTestingLocator().sendKeys(Keys.ENTER);


    }

    public void selectStatus(){
        createIssuePage.getSelectStatusLocator().click();
        createIssuePage.getStatusTypeInTestingLocator().click();
    }

}
