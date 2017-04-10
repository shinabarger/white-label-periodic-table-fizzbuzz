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
        String expected = "NO";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doesinbecomeIn() throws Exception {
        String actual = Main.main("in");
        String expected = "IN";
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void conBecomeCON() throws Exception {
        String actual = Main.main("con");
        String expected = "CON";
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void genBecomesGeN() throws Exception {
        String actual = Main.main("gen");
        String expected = "GeN";
        Assert.assertEquals(expected, actual);

    }


}