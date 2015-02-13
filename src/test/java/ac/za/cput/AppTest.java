package ac.za.cput;

import junit.framework.Assert;
import org.junit.Ignore;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
@Ignore
public class AppTest

{
    private App app = new App();
    private float q1 = (float) 10.47;
    private int num1 = 20;


    String obj = new String("obj");
    String iden = new String("iden");



    @org.junit.Test
    public void testFloat() throws Exception {
        Assert.assertEquals(q1, app.ifloat());
    }

    @org.junit.Test
    public void testInt() throws Exception {
        assertEquals(num1, app.iiInt());
    }

    @org.junit.Test
    public void testEquality() throws Exception {
        Assert.assertSame(obj, obj);
    }

    @org.junit.Test
    public void testIdentity() throws Exception {
        Assert.assertSame(iden, iden);
    }

    @org.junit.Test
    public void testNullVal() throws Exception {
        assertNull(app.nullVal());
    }

    @org.junit.Test
    public void testNotNull() throws Exception {
        assertNotNull(app.notNull());
    }

    @org.junit.Test
    public void testTrue() throws Exception {

        assertTrue(app.iTrue());
    }

    @org.junit.Test
    public void testFalse() throws Exception {

        assertFalse(app.iFalse());
    }

    @Ignore
    @org.junit.Test
    public void testFailtest() throws Exception
    {
        Assert.fail("failed");
    }



    @Ignore
    @org.junit.Test
    public void testDisabletest() throws Exception
    {
        assertEquals("Disable Test", app.disableTest());
    }


    @org.junit.Test
    public void testArray1() throws Exception
    {
        String[] arr1 = new String[]{"never", "give", "up"};
        String[] testArray = app.array1();

        assertArrayEquals(arr1, testArray);

    }

}