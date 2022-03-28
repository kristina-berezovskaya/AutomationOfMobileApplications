import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{
    @Before
    public void textStartTest()
    {
        System.out.println("Start test");
    }

    @After
    public void textFinishTest()
    {
        System.out.println("finish test");
    }

    @Test
    public void myFirstTest()
    {
        System.out.println("First test");
    }

    @Test
    public void mySecondTest()
    {
        System.out.println("Second test");
    }

}
