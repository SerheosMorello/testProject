package cmd.cbase;

import cmd.*;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class LCMSmokeTest extends BaseTest {

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Lifecycle Management");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @After
    public void returnToSearchTab(){
        if (new CommonModule().isPresentNote()){
            new CommonModule().closeNote();
        }
        if(! new CommonModule().isActiveSearchTab()){
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
    @WithTag("suite: smoke")
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
                checkObjectElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
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
                checkObjectElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
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
                checkObjectElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
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
    @WithTag("suite: smoke")
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
    @WithTag("suite: smoke")
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
    @WithTag("suite: smoke")
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
    @Ignore
    @WithTag("suite: smoke")
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
    @Ignore
    @WithTag("suite: smoke")
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
                new CommonModule().closeNote();
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
    @WithTag("suite: smoke")
    public void OpenHistoryLocations(){
        new CommonModule().
                selectNodeByGroup("Locations", new String[]{"History", "History"}).
                checkSearchRestriction("Search restriction - History - Locations").
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTableElementIsDispayed().
                checkRestrictionsFormIsDisplayed().
                checkTreeElementIsDisplayed().
                checkButtonIsDisplayedById("search").
                checkButtonIsDisplayedById("export").
                checkButtonIsDisplayedById("reset").
                checkButtonIsDisplayedById("erase").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void OpenHistoryLinks(){
        new CommonModule().
                selectNodeNumberByGroup("Links", new String[]{"History", "History"},"1").
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
        new CommonModule().closeNote();
        new CommonModule().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void OpenHistoryAdministrationAttributes(){
        new CommonModule().
                selectNodeByGroup("Attributes", new String[]{"History", "History administration"}).
                checkSearchRestriction("Search restriction - Admin Attribute-History").
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
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void OpenHistoryAdministrationLinks(){
        new CommonModule().
                selectNodeNumberByGroup("Links", new String[]{"History", "History administration"},"2").
                checkSearchRestriction("Search restriction - Admin Link-History").
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
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
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
                performSearch();
    }

    @Test
    @WithTag("suite: smoke")
    public void OpenTakeStockInWarehouse() {
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
                performSearch();
    }

    @Test
    @WithTag("suite: smoke")
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
        new CommonModule().closeNote();
        new CommonModule().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                closeActiveTab();
    }
}
