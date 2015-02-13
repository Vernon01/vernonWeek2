package ac.za.cput;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    App a4 = new App();

    public void testDivide() throws Exception
    {
        assertEquals(21.5, a4.divide());
    }
}
