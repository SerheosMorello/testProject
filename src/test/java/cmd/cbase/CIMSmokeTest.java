package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class CIMSmokeTest extends BaseTest {

    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "CI Management");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
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
    @WithTag("suite: smoke")
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
