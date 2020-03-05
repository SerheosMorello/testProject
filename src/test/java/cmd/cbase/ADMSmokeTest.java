package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class ADMSmokeTest extends BaseTest {
    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Administration");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAttachments(){
        new CommonModule().
                selectNode("Attachments").
                checkSearchRestriction("Search restriction - Attachments").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDataDictionarys(){
        new CommonModule().
                selectNode("Data dictionaries").
                checkSearchRestriction("Search restriction - Data dictionary").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDisplayAttributes(){
        new CommonModule().
                selectNode("Display attributes").
                checkSearchRestriction("Search restriction - Display attributes").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openSessions(){
        new CommonModule().
                selectNode("Sessions").
                checkSearchRestriction("Search restriction - Session").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkMainMenuPanelIsDisplayed().
                checkIconPanelIsDisplayed().
                checkTreeElementIsDisplayed().
                checkDetailElementIsDisplayed().
                checkButtonIsDisplayedById("remove").
                checkButtonIsDisplayedById("close").
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openLicensePool(){
        new CommonModule().
                selectNode("License pool").
                checkSearchRestriction("Search restriction - License pool").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    public void openLifecycle(){
        new CommonModule().
                selectNode("Lifecycle").
                checkSearchRestriction("Search restriction - Lifecycle").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openAdapters(){
        new CommonModule().
                selectNodeByGroup("Adapters", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Adapter").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openCableLine(){
        new CommonModule().
                selectNodeByGroup("Cable / line", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Cable / line").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openSwitchCabinet(){
        new CommonModule().
                selectNodeByGroup("Switch cabinet", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Switch cabinet").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDevices(){
        new CommonModule().
                selectNodeByGroup("Device", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Devices").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openAssemblyUnits(){
        new CommonModule().
                selectNodeByGroup("Assembly units", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Assembly units").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openJunctionBoxes(){
        new CommonModule().
                selectNodeByGroup("Junction boxes", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Junction boxes").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openSpliceCassettes(){
        new CommonModule().
                selectNodeByGroup("Splice cassettes", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Splice cassettes").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAntenna(){
        new CommonModule().
                selectNodeByGroup("Antenna", new String[]{"Master data"}).
                checkSearchRestriction("Search restriction - Antenna").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openLimitValues(){
        new CommonModule().
                selectNodeByGroup("Limit values", new String[]{"Coax data","Level calculation"}).
                checkSearchRestriction("Search restriction - Limit values").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openTilts(){
        new CommonModule().
                selectNodeByGroup("Tilts", new String[]{"Coax data","Level calculation"}).
                checkSearchRestriction("Search restriction - Tilts").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openServer(){
        new CommonModule().
                selectNodeByGroup("Server", new String[]{"Jobs"}).
                checkSearchRestriction("Search restriction - Server jobs").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDatabaseJobs(){
        new CommonModule().
                selectNodeByGroup("Database jobs", new String[]{"Jobs"}).
                checkSearchRestriction("Search restriction - Database jobs").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openIcon(){
        new CommonModule().
                selectNode("Icon").
                checkSearchRestriction("Search restriction - Icon").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

}
