package cmd;

import cmd.hendlers.Tree;
import cmd.utils.PageWaiter;
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CommonModule {

    public CommonModule selectNode(String nodeName){ ;
        new Tree().selectTreeByName(nodeName);
        new PageWaiter().waitForAngularRequestsToFinish();
        return this;
    }

    public CommonModule selectNodeByGroup(String node, String[] group){
        new Tree().selectNodeByGroupe(node, group);
        new PageWaiter().waitForAngularRequestsToFinish();
        return  this;
    }

    public CommonModule selectNodeByGroupNumber(String node, String[] group, String number){
        new Tree().selectNodeByGroupeNumber(node, group, number);
        new PageWaiter().waitForAngularRequestsToFinish();
        return  this;
    }

    public CommonModule performSearch() {
        $("#search").click();

        new PageWaiter().waitForAngularRequestsToFinish();

        if ($(By.xpath(".//div[contains(@class,'QuestionDialog')]")).isDisplayed()){
            $("#no").click();
        }
        new PageWaiter().waitForAngularRequestsToFinish();
        return this;
    }

    public ObjectTab openFirestRow(){
        $(By.xpath(".//cmd-table//div[@class='body']//div[contains(@class, 'data-row')][1]")).doubleClick();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new ObjectTab();
    }

    public StartPasge closeModuleTab(){
        $(By.xpath(".//cmd-service-container//ul/li[contains(@class, 'active-tab')]/cmd-close-button")).click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new StartPasge();
    }

    public Boolean isActiveSearchTab(){
        if ($(By.xpath(".//div[@class='module-tabs-list']//li[1]")).
                is(Condition.attribute("class","active-tab"))) {
            return true;
        } else return false;
    }

    public CommonModule returnToSearchTab (){
        $(By.xpath(".//div[@class='module-tabs-list']//li//span[text()='Search']")).click();
        return new CommonModule();
    }

    public CommonModule checkSearchRestriction(String name){
        $("#restriction-title").should(Condition.text(name));
        return this;
    }

    public CommonModule checkTreeElementIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-tree")).isDisplayed());
        return this;
    }

    public CommonModule checkTableElementIsDispayed(){
        Assert.assertTrue($(By.xpath("//cmd-table")).isDisplayed());
        return this;
    }

    public CommonModule checkRestrictionsFormIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-form")).isDisplayed());
        return this;
    }

    public CommonModule checkButtonsIsDisplayed(){
        Assert.assertTrue($("#search").isDisplayed());
        Assert.assertTrue($("#excel").isDisplayed());
        Assert.assertTrue($("#csv").isDisplayed());
        Assert.assertTrue($("#reset").isDisplayed());
        return this;
    }

    public CommonModule checkIconPanelIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-icon-bar-menu")).isDisplayed());
        return this;
    }

    public CommonModule checkMainMenuPanelIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-main-menu")).isDisplayed());
        return this;
    }

    public CommonModule checkButtonIsDisplayedById(String buttonId){
        Assert.assertTrue($(By.xpath(".//button[@id='"+ buttonId+"']")).isDisplayed());
        return this;
    }

    public CommonModule checkCommonModuleElementsIsDisplayed(){
        checkMainMenuPanelIsDisplayed();
        checkIconPanelIsDisplayed();
        checkTreeElementIsDisplayed();
        checkRestrictionsFormIsDisplayed();
        checkButtonsIsDisplayed();
        checkTableElementIsDispayed();
        return this;
    }

}
