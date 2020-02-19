import org.junit.Assert;
import org.junit.Test;

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
