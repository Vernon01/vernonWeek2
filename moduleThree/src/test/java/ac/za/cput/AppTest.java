package ac.za.cput;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   App a3 = new App();

    public void testSubtract() throws Exception
    {
        assertEquals(33.0,a3.subtract());
    }
}
