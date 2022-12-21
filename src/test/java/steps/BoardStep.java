package steps;

import baseEntities.BaseStep;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BoardStep extends BaseStep {

    public void createButton() {

        Actions actions = new Actions(driver);
        actions
                .moveToElement(boardPage.getCreateButtonTarget(), 30, 20)
                .build()
                .perform();

        boardPage.getCreateButton().click();
    }

    public BoardStep(WebDriver driver) {
        super(driver);
    }


}
