package ac.za.cput;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    App ap = new App();

    public void testMultiply() throws Exception
    {
        assertEquals(442.0,ap.multiply());
    }
}
