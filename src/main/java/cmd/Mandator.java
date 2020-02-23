package cmd;
import cmd.hendlers.DropDown;
import cmd.utils.PageWaiter;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;

public class Mandator {

    public StartPasge selectMandant(String mandant, String groups){

        new DropDown().selectOntionsByLabel("Mandator", mandant);
        new DropDown().selectOntionsByLabel("Group", groups);
        $("#ok").click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new StartPasge();
    }
}
