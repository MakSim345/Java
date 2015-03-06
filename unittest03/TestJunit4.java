import org.junit.Test;
import junit.framework.TestCase;
    
public class TestJunit4 extends TestCase
{
    int value1 = 2, value2 = 3, expectedResult = 5;
    
    @Test
    public void testSuccess()
    {
        assertTrue(value1 + value2 == expectedResult);
    }
    
    @Test
    public void testFail()
    {
        // assertTrue(value1 - value2 == expectedResult);
        assertTrue(value1 - value2 == -1);
    }
}

