package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoardPage extends BasePage {


    private By createButtonLocator = By.className("css-11vtz93");
    private By createButtonTargetLocator = By.className("css-9gygbf");

    public BoardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCreateButton() {
        return waitService.waitForVisibilityLocatedBy(createButtonLocator);
    }

    public WebElement getCreateButtonTarget() {
        return waitService.waitForVisibilityLocatedBy(createButtonTargetLocator);
    }
}
