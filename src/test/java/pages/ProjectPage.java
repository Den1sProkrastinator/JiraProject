package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage {

private By createProjectLocator = By.cssSelector(".css-ryxqcb");

    public ProjectPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getCreateProjectLocator (){
        return waitService.waitForExists(createProjectLocator);
    }

}
