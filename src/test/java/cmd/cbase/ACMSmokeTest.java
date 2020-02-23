package cmd.cbase;

import cmd.*;
import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class ACMSmokeTest{



    @BeforeClass
    public static void login(){
        Configuration.remote ="http://localhost:4444/wd/hub/";
        open(instance.CMD.toString());
        new Login().login("command","command").
                selectMandant("FNT [1001]", "Administrator [Group]").
                closeNote();
        new StartPasge().
                openModule("cbase", "Accessory Management");
    }

    @AfterClass
    public static void logout(){
        new CommonModule().closeModuleTab();
        new StartPasge().logout();
    }

    @Test
    public void OpenContract(){
        new CommonModule().
                selectNode("Contract").
                checkSearchRestriction("Search restriction - Contract").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }


    @Test
    public void OpenFrameworkContract(){
        new CommonModule().
                selectNode("Framework contract").
                checkSearchRestriction("Search restriction - Framework contract").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenMaintenanceContract(){
        new CommonModule().
                selectNode("Maintenance contract").
                checkSearchRestriction("Search restriction - Maintenance contract").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenOrganization(){
        new CommonModule().
                selectNode("Organization").
                checkSearchRestriction("Search restriction - Organization").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenPerson(){
        new CommonModule().
                selectNode("Person").
                checkSearchRestriction("Search restriction - Person").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenPersonGroup(){
        new CommonModule().
                selectNode("Person group").
                checkSearchRestriction("Search restriction - Person group").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenAssemblyPart(){
        new CommonModule().
                selectNode("Assembly part").
                checkSearchRestriction("Search restriction - Assembly part").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenAssemblyPartMaster(){
        new CommonModule().
                selectNode("Assembly part master").
                checkSearchRestriction("Search restriction - Assembly part master").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenMaintenanceWindow(){
        new CommonModule().
                selectNode("Maintenance window").
                checkSearchRestriction("Search restriction - Maintenance window").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenQualityOfService(){
        new CommonModule().
                selectNode("Quality of Service").
                checkSearchRestriction("Search restriction - Quality of Service").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenTrafficEngineeringRule(){
        new CommonModule().
                selectNode("Traffic Engineering Rule").
                checkSearchRestriction("Search restriction - Traffic Engineering Rule").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenServiceLevelAgreement(){
        new CommonModule().
                selectNode("Service Level Agreement").
                checkSearchRestriction("Search restriction - Service Level Agreement").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

    @Test
    public void OpenKey(){
        new CommonModule().
                selectNode("Key").
                checkSearchRestriction("Search restriction - Key").
                checkCommonModuleElementsIsDisplayed().
                performSearch().
                openFirestRow().
                checkObjectElementsIsDisplayed().
                clickCloseButton();

    }

}
