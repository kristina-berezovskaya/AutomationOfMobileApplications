import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        MainClass newObject = new MainClass();
        Assert.assertTrue("Doesn't return the digit  > 45", newObject.getClassNumber() > 45);
    }
}

