package ac.za.cput;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");

    }


    public float ifloat()
    {
        float q1 = (float) 10.47;
        return q1;
    }

    public int iiInt()
    {
        int num1 = 20;
        return num1;
    }

    public boolean equality()
    {
        String obj = new String();

        return true;
    }

    public boolean identity()
    {
        String iden = new String();
        iden = " identity";

        return true;
    }

    public String nullVal()
    {
        return null;
    }

    public String notNull()
    {
        String word = "Hello";
        return word;
    }

    public boolean iTrue()
    {
        return true;
    }

    public boolean iFalse()
    {
        return false;
    }

    public boolean failTest()
    {
        return true;
    }

    @Ignore
    @Test
    public String disableTest()
    {
        String d = "Disable Test";
        return d;
    }

    public String[] array1()
    {
        String [] arr1 = new String[]{"never","give","up"};
        return arr1;
    }


}