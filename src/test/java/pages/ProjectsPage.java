package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage extends BasePage {

private By createProjectLocator = By.cssSelector(".css-ryxqcb");
private String projectLocator = "//div/span[@class and text()='Replace']";

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getCreateProject (){
        return waitService.waitForExists(createProjectLocator);
    }

    public WebElement getProject(String projectName) {
        return waitService.waitForExists(By.xpath(projectLocator.replace("Replace", projectName)));
    }
}
