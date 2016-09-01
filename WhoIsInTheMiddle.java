// The "WhoIsInTheMiddle" class.
import java.awt.*;
import hsa.Console;

public class WhoIsInTheMiddle
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int bowls[] = new int [3];

	for (int i = 0 ; i < 3 ; i++)
	{
	    bowls [i] = c.readInt ();
	}

	int smallestsofar = bowls [0];
	int largestsofar = bowls [0];
	int middle = 1;

	for (int i = 1 ; i <= 2 ; i++)
	{
	    if (bowls [i - 1] > bowls [i])
	    {
		smallestsofar = bowls [i];
	    }
	    else if (bowls [i - 1] < bowls [i])
	    {
		largestsofar = bowls [i];
	    }
	}

	for (int i = 0 ; i < 3 ; i++)
	{
	    if (bowls [i] == smallestsofar)
	    {
		bowls [i] = 0;
	    }
	    else if (bowls [i] == largestsofar)
	    {
		bowls [i] = 0;
	    }
	}

	for (int i = 0 ; i < 3 ; i++)
	{
	    if (bowls [i] != 0)
	    {
		bowls [i] = middle;
	    }
	}

	c.println (middle);

    } // main method
} // WhoIsInTheMiddle class
