package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class StartAtlasianStep extends BaseStep {
    public StartAtlasianStep(WebDriver driver) {
        super(driver);
    }

    public void openProjectsPage(){
        startAtlasianPage.getJiraSoftwareButton().click();
    }
}
