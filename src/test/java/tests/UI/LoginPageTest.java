package tests.UI;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void login() throws InterruptedException {
        loginStep.login(
                configuration.ReadProperties.username(),
                configuration.ReadProperties.password());
        startAtlasianStep.openProjectsPage();
        projectStep.choseProject("TestScrumProject");
        Thread.sleep(2000);
    }

}
