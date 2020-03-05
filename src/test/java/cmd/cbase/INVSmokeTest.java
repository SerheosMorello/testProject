package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class INVSmokeTest extends BaseTest{

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Network Inventory");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openVirtualSwitch(){
        new CommonModule().returnToSearchTab().
                selectNode("Virtual switch").
                checkSearchRestriction("Search restriction - Virtual switch").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openLogicalGroup(){
        new CommonModule().returnToSearchTab().
                selectNode("Logical group").
                checkSearchRestriction("Search restriction - VSS").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }
}
