// The "SpecialDay" class.
import java.awt.*;
import hsa.Console;

public class SpecialDay
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int month = 0, day = 0;

	while (true)
	{
	    month = c.readInt ();
	    day = c.readInt ();

	    if (month < 2)
	    {
		c.println ("Before");
	    }
	    else if (month > 2)
	    {
		c.println ("After");
	    }
	    else if (month == 2)
	    {
		if (day < 18)
		{
		    c.println ("Before");
		}
		else if (day > 18)
		{
		    c.println ("After");
		}
		else if (day == 18)
		{
		    c.println ("Special");
		}
	    }
	    c.println ();
	}

    } // main method
} // SpecialDay class
