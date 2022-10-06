package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class LoginStep extends BaseStep {
    public LoginStep(WebDriver driver) {
        super(driver);
    }
    public void login(String email, String psw) {
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getContinueButton().click();
        loginPage.getPswInput().sendKeys(psw);
        loginPage.getContinueButton().click();
    }
}
