package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class ENTSmokeTest extends BaseTest {
    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Entity Manager");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openInbox(){
        new CommonModule().
                selectNode("Entity").
                checkSearchRestriction("Search restriction - Entity").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openEntityGroup(){
        new CommonModule().
                selectNode("Entity Group").
                checkSearchRestriction("Search restriction - Entity Group").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openRelationEntity(){
        new CommonModule().
                selectNode("Relation Entity").
                checkSearchRestriction("Search restriction - Relation Entity").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAttribute(){
        new CommonModule().
                selectNode("Attribute").
                checkSearchRestriction("Search restriction - Attribute").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDataSource(){
        new CommonModule().
                selectNode("Data source").
                checkSearchRestriction("Search restriction - Data source").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openBusinessGatewayEntity(){
        new CommonModule().
                selectNode("Business Gateway Entity").
                checkSearchRestriction("Search restriction - Business Gateway Entity").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openConfiguration(){
        new CommonModule().
                selectNodeByGroup("Configuration", new String[]{"Configuration data"}).
                checkSearchRestriction("Search restriction - Configuration").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openDataLayer(){
        new CommonModule().
                selectNodeByGroup("Data layer", new String[]{"Configuration data"}).
                checkSearchRestriction("Search restriction - Data layer").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAttributeSet(){
        new CommonModule().
                selectNodeByGroup("Attribute set", new String[]{"Configuration data"}).
                checkSearchRestriction("Search restriction - Attribute set").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAttributeLink(){
        new CommonModule().
                selectNodeByGroup("Attribute link", new String[]{"Configuration data"}).
                checkSearchRestriction("Search restriction - Attribute link").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }
}
