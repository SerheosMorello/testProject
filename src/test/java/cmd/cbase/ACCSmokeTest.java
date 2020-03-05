package cmd.cbase;

import cmd.CommonModule;
import cmd.StartPasge;
import net.thucydides.core.annotations.WithTag;
import org.junit.*;

public class ACCSmokeTest extends BaseTest {
    @BeforeClass
    public static void openModule(){
        new StartPasge().
                openModule("cbase", "Access Management");
    }

    @AfterClass
    public static void closeModule(){
        new CommonModule().closeModuleTab();
    }

    @Test
    @WithTag("suite: smoke")
    public void openUser(){
        new CommonModule().
                selectNode("User").
                checkSearchRestriction("Search restriction - User").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openGroup(){
        new CommonModule().
                selectNode("Group").
                checkSearchRestriction("Search restriction - Group").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openMandator(){
        new CommonModule().
                selectNode("Mandator").
                checkSearchRestriction("Search restriction - Mandator").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @Ignore
    @WithTag("suite: smoke")
    public void openPrivilege(){
        new CommonModule().
                selectNode("Privilege").
                checkSearchRestriction("Search restriction - Privilege").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openAttributePrivilege(){
        new CommonModule().
                selectNode("Attribute privilege").
                checkSearchRestriction("Search restriction - Attribute privilege").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openForeignAccessRestriction(){
        new CommonModule().
                selectNode("Foreign access restriction").
                checkSearchRestriction("Search restriction - Foreign access restriction").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

    @Test
    @WithTag("suite: smoke")
    public void openLDAPServer(){
        new CommonModule().
                selectNode("LDAP server").
                checkSearchRestriction("Search restriction - LDAP server").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();
    }

}
