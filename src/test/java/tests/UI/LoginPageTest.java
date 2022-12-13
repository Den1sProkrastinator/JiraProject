package tests.UI;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void login()  {
        loginStep.login(
                configuration.ReadProperties.username(),
                configuration.ReadProperties.password());
    }

}
