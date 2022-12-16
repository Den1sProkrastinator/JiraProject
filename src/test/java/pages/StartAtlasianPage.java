package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StartAtlasianPage extends BasePage {
    private By jiraSoftwareButtonLocator = By.cssSelector("[data-testid='start-product__JIRA_SOFTWARE_e44ceca4-5eef-485f-b2a4-5413932da788']");


    public StartAtlasianPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getJiraSoftwareButtonLocator (){return waitService.waitForExists(jiraSoftwareButtonLocator);}
}
