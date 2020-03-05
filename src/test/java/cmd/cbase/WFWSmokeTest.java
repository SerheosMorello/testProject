package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class WFWSmokeTest extends BaseTest {

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Workflow");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openInbox(){
        new CommonModule().
                selectNodeByGroup("Inbox", new String[]{"User functions"}).
                checkSearchRestriction("Search restriction - Inbox").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("save").
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openProcessDefinition(){
        new CommonModule().
                selectNodeByGroup("Process definitions", new String[]{"Admin functions"}).
                checkSearchRestriction("Search restriction - Process definition").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("save").
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openProzessInstance(){
        new CommonModule().
                selectNodeByGroup("Process instances", new String[]{"Admin functions"}).
                checkSearchRestriction("Search restriction - Prozess instance").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("save").
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openActivities(){
        new CommonModule().
                selectNodeByGroup("Activities", new String[]{"Admin functions"}).
                checkSearchRestriction("Search restriction - Activity").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAcceptedActivities(){
        new CommonModule().
                selectNodeByGroup("Accepted activities", new String[]{"Admin functions"}).
                checkSearchRestriction("Search restriction - Accepted activity").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }
}
