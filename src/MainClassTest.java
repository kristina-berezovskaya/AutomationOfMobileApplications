import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainClass newObject = new MainClass();
        Assert.assertTrue("Method getLocalNumber doesn't return int 14 ",newObject.getLocalNumber() == 14);
    }
}
