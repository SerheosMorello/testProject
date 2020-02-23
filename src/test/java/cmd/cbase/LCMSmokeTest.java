package cmd.cbase;

import cmd.*;
import cmd.hendlers.Tree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LCMSmokeTest {

    @BeforeClass
    public static void login(){
        open(instance.CMD.toString());
        new Login().login("command","command").
                selectMandant("FNT [1001]", "Administrator [Group]").
                closeNote();
        new StartPasge().
                openModule("cbase", "Lifecycle Management");
    }

    @AfterClass
    public static void logout(){
        new CommonModule().closeModuleTab();
        new StartPasge().logout();
    }

    @After
    public void returnToSearchTab(){
        if(! new CommonModule().isActiveSearchTab()){
            new StartPasge().closeNote();
            new ObjectTab().closeActiveTab();
            new CommonModule().returnToSearchTab();
        }
    }

    @Test
    public void OpenOverview(){
        new CommonModule().
                selectNodeByGroup("Overview", new String[]{"Main navigation LCM","Logbook","Event"}).
                checkSearchRestriction("Search restriction - Event - Overview").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenChange(){
        new CommonModule().
                selectNodeByGroup("Change", new String[]{"Main navigation LCM","Logbook","Event"}).
                checkSearchRestriction("Search restriction - Event - Change").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab().
                returnToSearchTab();
    }

    @Test
    public void OpenIncident(){
        new CommonModule().
                selectNodeByGroup("Incident", new String[]{"Main navigation LCM","Logbook","Event"}).
                checkSearchRestriction("Search restriction - Event - Incident").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenActivity(){
        new CommonModule().
                selectNodeByGroup("Activity", new String[]{"Main navigation LCM","Logbook","Event"}).
                checkSearchRestriction("Search restriction - Event - Activity").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenCategories(){
        new CommonModule().
                selectNode("Categories").
                checkSearchRestriction("Search restriction - Categories").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    public void OpenCIEventSearch(){
        new CommonModule().
                selectNodeByGroupNumber("CI-Event search", new String[]{"Reports"},"1").
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenCIChangeSearch(){
        new CommonModule().
                selectNodeByGroupNumber("CI-Change search", new String[]{"Reports"},"1").
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenCIIncidentSearch(){
        new CommonModule().
                selectNodeByGroupNumber("CI-Incident search", new String[]{"Reports"},"1").
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenCIActivitySearch(){
        new CommonModule().
                selectNodeByGroupNumber("CI-Activity search", new String[]{"Reports"},"1").
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenHistoryAttributes(){
        new CommonModule().
                selectNodeByGroup("Attributes", new String[]{"History", "History"}).
                checkSearchRestriction("Search restriction - History - Attributes").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch();
                new StartPasge().closeNote();
                new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenHistoryLocations(){
        new CommonModule().
                selectNodeByGroup("Locations", new String[]{"History", "History"}).
                checkSearchRestriction("Search restriction - History - Locations").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch();
        new StartPasge().closeNote();
        new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenHistoryLinks(){
        new CommonModule().
                selectNodeByGroup("Links", new String[]{"History", "History"}).
                checkSearchRestriction("Search restriction - History - Links").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch();
        new StartPasge().closeNote();
        new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenHistoryAdministrationAttributes(){
        new CommonModule().
                selectNodeByGroup("Attributes", new String[]{"History", "History administration"}).
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenHistoryAdministrationLinks(){
        new CommonModule().
                selectNodeByGroup("Links", new String[]{"History", "History administration"}).
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenScrapFromWarehouse(){
        new CommonModule().
                selectNodeByGroup("Scrap from warehouse", new String[]{"History", "Reports"}).
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenTakeStockInWarehouse(){
        new CommonModule().
                selectNodeByGroup("Take stock in warehouse", new String[]{"History", "Reports"}).
                checkSearchRestriction("Search restriction - Reports").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }

    @Test
    public void OpenCluster(){
        new CommonModule().
                selectNode("Cluster").
                checkSearchRestriction("Search restriction - Cluster").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkRestrictionsFormIsDisplayed().
                checkTableElementIsDispayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                performSearch();
        new StartPasge().closeNote();
        new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("show_details").
                closeActiveTab();
    }
}
