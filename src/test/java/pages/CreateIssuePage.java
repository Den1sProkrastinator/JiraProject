package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateIssuePage extends BasePage {

    private By selectIssueTypeLocator = By.id("issue-create.ui.modal.create-form.type-picker.issue-type-select");
    private By issueTypeBugLocator = By.xpath("//div[@class=' css-1b6odlt'][.='Bug']");

    private By selectStatusLocator = By.cssSelector(".ewxv9o42");
    private By statusTypeInTestingLocator = By.id("issueTypeBugLocator");

    private By summaryLocator = By.className("summary");

    public CreateIssuePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectIssueTypeLocator() {
        return waitService.waitForExists(selectIssueTypeLocator);
    }

    public WebElement getIssueTypeBugLocator() {
        return waitService.waitForExists(issueTypeBugLocator);
    }

    public WebElement getSelectStatusLocator() {
        return waitService.waitForExists(selectStatusLocator);
    }
    public WebElement getStatusTypeInTestingLocator() {
        return waitService.waitForExists(statusTypeInTestingLocator);
    }

    public WebElement getSummaryLocator() {
        return waitService.waitForExists(summaryLocator);
    }

}
