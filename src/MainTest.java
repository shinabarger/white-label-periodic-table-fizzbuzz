import org.junit.Assert;
import org.junit.Test;

/**
 * Created by davidshinabarger on 4/3/17.
 */

public class MainTest {
    @Test
    public void main() throws Exception {
        String actual = Main.main("buzz");
        String expected = "buzz";
        Assert.assertEquals(expected, actual);


    }


}