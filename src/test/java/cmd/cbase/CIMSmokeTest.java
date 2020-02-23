package cmd.cbase;

import cmd.CommonModule;
import cmd.Login;
import cmd.StartPasge;
import cmd.instance;
import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class CIMSmokeTest {

    @BeforeClass
    public static void login(){
        Configuration.remote ="http://localhost:4444/wd/hub/";
        open(instance.CMD.toString());
        new Login().login("command","command").
                selectMandant("FNT [1001]", "Administrator [Group]").
                closeNote();
        new StartPasge().
                openModule("cbase", "CI Management");
    }

    @AfterClass
    public static void logout(){
        new CommonModule().closeModuleTab();
        new StartPasge().logout();
    }

    @Test
    public void OpenGraphic(){
        new CommonModule().
                selectNode("Graphic").
                checkSearchRestriction("Search restriction - Graphic").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenGraphicTemplate(){
        new CommonModule().
                selectNode("Graphic template").
                checkSearchRestriction("Search restriction - Template").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

}
