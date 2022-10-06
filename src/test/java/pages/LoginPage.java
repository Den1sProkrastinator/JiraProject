package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private By emailInputLocator = By.name("username");
    private By continueButtonLocator = By.className("css-19see2r");
    private By pswInputLocator = By.id("password");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailInput() {
        return waitService.waitForExists(emailInputLocator);
    }
    public WebElement getContinueButton() {
        return waitService.waitForExists(continueButtonLocator);
    }
    public WebElement getPswInput() {
        return waitService.waitForExists(pswInputLocator);
    }
}
