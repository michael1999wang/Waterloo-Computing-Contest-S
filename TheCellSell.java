// The "TheCellSell" class.
import java.awt.*;
import hsa.Console;

public class TheCellSell
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int a = 0, b = 0;

	c.println ("Number of daytime minutes?");
	int daytime = c.readInt ();
	c.println ("Number of evening minutes?");
	int evening = c.readInt ();
	c.println ("Number of weekend minutes?");
	int weekend = c.readInt ();

	if (daytime > 100)
	{
	    a += (daytime - 100) * 0.25;
	}
	if (daytime > 250)
	{
	    b += (daytime - 250) * 0.45;
	}
	
	a += evening * 0.15;
	b += evening * 0.35;

	a += weekend * 0.2;
	b += weekend + 0.25;

	c.println ("Plan A costs " + a);
	c.println ("Plan B costs " + b);
	
	if (a > b)
	{
	    c.println ("Plan B is the cheapest.");
	}
	else if (a < b)
	{
	    c.println ("Plan A is the cheapest.");
	}
	else
	{
	    c.println ("Plan A and B are the same price.");
	}

    } // main method
} // TheCellSell class
