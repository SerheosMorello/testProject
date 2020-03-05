package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import cmd.hendlers.DropDown;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class OBJSmokeTest extends BaseTest {

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Object Management");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openLocationData(){
        new CommonModule().
                selectNode("Location data").
                checkSearchRestriction("Search restriction - Location data").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openRoomData(){
        new CommonModule().
                selectNode("Room data").
                checkSearchRestriction("Search restriction - Room data").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openCableSearch(){
        new CommonModule().
                selectNode("Cable search").
                checkSearchRestriction("Search restriction - Cable search").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openObjectSearch(){
        new CommonModule().
                selectNode("Object search").
                checkSearchRestriction("Search restriction - Object search").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAdvancedObjectSearch(){
        new CommonModule().
                selectNode("Advanced object search").
                checkSearchRestriction("Search restriction - Advanced object search").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openSwitchCabinetObjectSearch(){
        new CommonModule().
                selectNode("Switch cabinet object search").
                checkSearchRestriction("Search restriction - Switch cabinet object search").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openUsageUnitOfSwitchCabinets(){
        new CommonModule().
                selectNodeByGroup("Usage (unit) of switch cabinets.", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Usage (unit) of switch cabinets.").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openObjectsInZonesNumber(){
        new CommonModule().
                selectNodeByGroup("Objects in Zones - number -", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Objects in Zones - number -").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openObjectsInZonesDetailed(){
        new CommonModule().
                selectNodeByGroup("Objects in zones - detailed -", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Objects in zones - detailed -").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openPortUtilizationOfActiveComponents(){
        new CommonModule().
                selectNodeByGroup("Port utilization of active components", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Port utilization of active components").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openInventoryOfRooms(){
        new CommonModule().
                selectNodeByGroup("Inventory of rooms", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Inventory of rooms").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openInventoryOfSwitchCabinets(){
        new CommonModule().
                selectNodeByGroup("Inventory of switch cabinets", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Inventory of switch cabinets").
                performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openFixcableUsage(){
        new CommonModule().
                selectNodeByGroup("Fixcable usage", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Fixcable usage");
        new DropDown().selectOntionsByLabel("Campus","[Autonomous system]");
        new CommonModule().performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDestinationQuery(){
        new CommonModule().
                selectNodeByGroup("Destination query", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Destination query");
        new DropDown().selectOntionsByLabel("Campus","[Autonomous system]");
        new CommonModule().performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openSignalTracingOfZone(){
        new CommonModule().
                selectNodeByGroup("Signal tracing of a zone", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - Signal tracing of a zone");
        new DropDown().selectOntionsByLabel("Campus","[Autonomous system]");
        new CommonModule().performSearch();
        new CommonModule().closeNote();
        new CommonModule().
                checkCommonModuleElementsIsDisplayed().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

}
