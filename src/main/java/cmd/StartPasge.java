package cmd;
import cmd.utils.PageWaiter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPasge {

    public StartPasge closeNote(){
        while ($(By.xpath(".//div[contains(@class, 'window')]")).isDisplayed()){
            $("#ok").click();
        }
        return this;
    }

    public StartPasge easySearch(String text)  {
        $("#searchContainer > div.header > div.search-field > input").
                setValue(text).
                pressEnter();
        return this;

    }

    public CommonModule openModule(String group, String moduleName){
        $(By.xpath(".//cmd-main-menu//li[@class='"+ group+"']")).click();
        $(By.xpath(".//div[contains(@class, 'cmd-menu-content')]//div[@class='label' and text()='"+ moduleName+"']")).
                hover().
                click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new CommonModule();
    }

    public Login logout(){
        $("#logout ").click();
        new PageWaiter().waitForAngularRequestsToFinish();
        $("#username").isDisplayed();
        return new Login();
    }

}
