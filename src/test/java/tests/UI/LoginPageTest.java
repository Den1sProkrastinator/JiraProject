package tests.UI;

import baseEntities.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void login() throws InterruptedException {

        startAtlasianStep.openProjectsPage();
        projectStep.choseProject("TestScrumProject");
        Thread.sleep(1000);
        boardStep.createButton();
        createIssuesStep.selectBugIssues();
        createIssuesStep.selectStatus();
        createIssuesStep.writeSummary("Test text");
        createIssuesStep.writeDescription("Test Test");
        createIssuesStep.createIssue();

    }


    //тест на проверку поля для ввода на граничные значения
    //
//    @Test
//    public void boundaryValue() {
//        authorization();
//
//    }
}
