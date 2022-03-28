import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MainClassTest
{
    @Test
    public void testGetClassString()
    {
        MainClass newObject = new MainClass();
        String StringFromMainClass = newObject.getClassString().toLowerCase();
        String StringCheck = "hello";

        Assert.assertTrue("String from MainClass doesn't contain Hello/Hello", StringFromMainClass.contains(StringCheck));
    }
}