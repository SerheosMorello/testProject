import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class UserTest {
    @Test
    public void TestNameTom(){
        String name = "Tom";
        User user = new User(name);
        Assert.assertEquals("Incorrect name", user.getName(), name);
    }
    @Test
    public void TestNameSem(){
        String name = "Sem";
        User user = new User(name);
        Assert.assertEquals("Incorrect name", user.getName(), name);
    }
}
