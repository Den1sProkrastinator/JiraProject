package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateIssuePage extends BasePage {

    //Issue Type fields
    private By selectIssueTypeLocator = By.id("issue-create.ui.modal.create-form.type-picker.issue-type-select");

    private By issueTypeBugLocator = By.xpath("//div[@class='sc-1lie33m-3 hpUCVg'][.='Bug']");

    //Status Type fields
    private By selectStatusLocator = By.xpath("//button[@aria-label='To Do - Change status']");
    private By selectStatusTypeInTestingLocator = By.cssSelector(".sc-1mohigh-0.fPuBnb");

    //Summary and Description fields
    private By summaryLocator = By.xpath("//*[@name='summary']");

    private By descriptionLocator = By.className("ua-chrome");

    //Button field
    private By createButtonTargetLocator= By.className("css-ryxqcb");




    public CreateIssuePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectIssueType() {
        return waitService.waitForExists(selectIssueTypeLocator);
    }

    public WebElement getIssueTypeBug() {
        return waitService.waitForExists(issueTypeBugLocator);
    }

    public WebElement getSelectStatus() {
        return waitService.waitForExists(selectStatusLocator);
    }

    public WebElement getStatusTypeInTesting() {
        return waitService.waitForVisibilityLocatedBy(selectStatusTypeInTestingLocator);
    }

    public WebElement getSummary() {
        return waitService.waitForExists(summaryLocator);
    }
    public WebElement getDescription() {
        return waitService.waitForExists(descriptionLocator);
    }
    public WebElement getCreateButton() {
        return waitService.waitForExists(createButtonTargetLocator);
    }

}
