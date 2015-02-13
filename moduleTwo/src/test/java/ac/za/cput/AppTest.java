package ac.za.cput;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    App a = new App();
    public void testSum() throws Exception
    {
        assertEquals(112.0,a.sum());
    }
}
