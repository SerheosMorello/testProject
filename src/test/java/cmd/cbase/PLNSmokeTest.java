package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import cmd.hendlers.DropDown;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class PLNSmokeTest extends BaseTest {
    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Planning");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openProtocol(){
        new CommonModule().
                selectNode("Protocol").
                checkSearchRestriction("Search restriction - Protocol").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openZoneDistributor(){
        new CommonModule().
                selectNodeByGroup("Zone / distributor", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - ReportsZone / distributor").
                checkCommonModuleElementsIsDisplayed();
        new DropDown().selectOntionsByLabel("Campus","[Autonomous system]");
        new CommonModule().performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openStatistic(){
        new CommonModule().
                selectNodeByGroup("Statistic", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - ReportsStatistic").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openPatchJobs(){
        new CommonModule().
                selectNodeByGroup("Patch jobs", new String[]{"Reports"}).
                checkSearchRestriction("Search restriction - ReportsPatch jobs").
                checkCommonModuleElementsIsDisplayed();
        new DropDown().selectOntionsByLabel("Campus","[Autonomous system]");
        new CommonModule().performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

}
