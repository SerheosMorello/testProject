package cmd.cbase;

import cmd.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;

@RunWith(SerenityRunner.class)
public class BaseTest  {

    @BeforeClass
    public static void login(){
        Configuration.remote ="http://172.27.2.79:4444/wd/hub";
        Configuration.startMaximized = true;
        open(instance.CMD.toString());
        new Login().login("command","command");
            new CommonModule().closeNote();
                new Mandator().selectMandant("FNT [1001]", "Administrator [Group]");
                    new CommonModule().closeNote();

    }

    @AfterClass
    public static void logout(){
        new StartPasge().logout();
    }

}
