package steps;

import baseEntities.BaseStep;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BoardStep extends BaseStep {

    public void createButton(){
        Actions actions= new Actions(driver);
        actions
                .moveToElement(boardPage.getCreateButtonTargetLocator(),40,20)
                .build()
                .perform();
        boardPage.getCreateButtonLocator().click();
    }
    public BoardStep(WebDriver driver) {
        super(driver);
    }


}
