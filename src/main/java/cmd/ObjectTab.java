package cmd;
import cmd.utils.PageWaiter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.junit.Assert.*;

import static com.codeborne.selenide.Selenide.$;

public class ObjectTab {

    public CommonModule clickCloseButton(){
        $("#close").click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new CommonModule();
    }

    public CommonModule closeActiveTab(){
        $(By.xpath(".//div[@class='module-tabs-list']//li[contains(@class, 'active-tab')]/cmd-close-button")).click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new CommonModule();
    }

    public CommonModule returnToSearchTab (){
        $(By.xpath(".//div[@class='module-tabs-list']//li//span[text()='Search']")).click();
        return new CommonModule();
    }

    public ObjectTab checkTreeElementIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-tree")).isDisplayed());
        return this;
    }

    public ObjectTab checkIconPanelIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-icon-bar-menu")).isDisplayed());
        return this;
    }

    public ObjectTab checkMainMenuPanelIsDisplayed(){
        Assert.assertTrue($(By.xpath("//cmd-main-menu")).isDisplayed());
        return this;
    }

    public ObjectTab checkDetailElementIsDisplayed(){
        Assert.assertTrue($(By.xpath(".//cmd-container[contains(@class, 'detail')]")).isDisplayed());
        return this;
    }

    public ObjectTab checkButtonIsDisplayedById(String buttonId){
        Assert.assertTrue($(By.xpath(".//button[@id='"+ buttonId+"']")).isDisplayed());
        return this;
    }

    public ObjectTab checkButtonsIsDisplayed(){
        Assert.assertTrue($("#saveandclose").isDisplayed());
        Assert.assertTrue($("#save").isDisplayed());
        Assert.assertTrue($("#reset").isDisplayed());
        Assert.assertTrue($("#close").isDisplayed());
        return this;
    }

    public ObjectTab checkObjectElementsIsDisplayed(){
        checkMainMenuPanelIsDisplayed();
        checkIconPanelIsDisplayed();
        checkTreeElementIsDisplayed();
        checkDetailElementIsDisplayed();
        checkButtonsIsDisplayed();
        return this;
    }

}
