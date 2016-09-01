// The "IconScaling" class.
import java.awt.*;
import hsa.Console;

public class IconScaling
{
    static Console c;           // The output console   

    public static void main (String[] args)
    {
	c = new Console ();

	int k = c.readInt ();
	int lines = 3 * k;

	for (int i = 0 ; i < k ; i++)
	{
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print ("*");
	    }
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print ("X");
	    }
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print ("*");
	    }m
	    c.println ();
	}
	for (int i = 0 ; i < k ; i++)
	{
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print (" ")d;
	    }
	    for (int e = 0 ; e < k * 2 ; e++)
	    {
		c.print ("X");
	    }
	    c.println ();
	}
	for (int i = 0 ; i < k ; i++)
	{
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print ("*");
	    }
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print (" ");
	    }
	    for (int e = 0 ; e < k ; e++)
	    {
		c.print ("*");
	    }
	    c.println ();
	}

    } // main method
} // IconScaling class
