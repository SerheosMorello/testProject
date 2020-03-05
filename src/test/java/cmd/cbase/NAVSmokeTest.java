package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class NAVSmokeTest extends BaseTest {

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Navigator");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openZone(){
        new CommonModule().returnToSearchTab().
                selectNode("Zone").
                checkSearchRestriction("Search restriction - Zone").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkNavigatorElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openTopzone(){
        new CommonModule().returnToSearchTab().
                selectNode("Topzone").
                checkSearchRestriction("Search restriction - Topzone").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkNavigatorElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openLogicalGroup(){
        new CommonModule().returnToSearchTab().
                selectNode("Logical group").
                checkSearchRestriction("Search restriction - Logical group").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkNavigatorElementsIsDisplayed().
                closeActiveTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openNodes(){
        new CommonModule().returnToSearchTab().
                selectNode("Nodes").
                checkSearchRestriction("Search restriction - Nodes").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkNavigatorElementsIsDisplayed().
                closeActiveTab();
    }
}
