package cmd;

import cmd.utils.PageWaiter;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    public Mandator login(String name, String password){
        $("#username").setValue(name);
        $("#password").setValue(password);
        $("#ok").click();
        new PageWaiter().waitForAngularRequestsToFinish();
        return new Mandator();
    }
}
