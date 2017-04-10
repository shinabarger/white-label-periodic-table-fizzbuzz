import org.junit.Assert;
import org.junit.Test;

/**
 * Created by davidshinabarger on 4/3/17.
 */

public class MainTest {

    @Test
    public void doesLetterBGetCapitalized() throws Exception {
        String actual = Main.main("b");
        String expected = "B";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doesnobecomeNo() throws Exception {
        String actual = Main.main("no");
        String expected = "No";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doesinbecomeIn() throws Exception {
        String actual = Main.main("in");
        String expected = "In";
        Assert.assertEquals(expected, actual);

    }
    @Test
    //TODO make this work
    public void conBecomeCoN() throws Exception {
        String actual = Main.main("con");
        String expected = "CoN";
        Assert.assertEquals(expected, actual);

    }


}