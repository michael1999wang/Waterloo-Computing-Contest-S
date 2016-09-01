// The "WhoHasSeenTheWind" class.
import java.awt.*;
import hsa.Console;

public class WhoHasSeenTheWind
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int sum = 0;
	int time = 0;

	c.print ("Enter the humidity factor: ");
	int humidity = c.readInt ();
	c.print ("Enter the maximum number of hours that Margret will wait for the balloon: ");
	int hours = c.readInt ();

	for (int i = 1 ; i <= hours ; i++)
	{
	    sum = -6 * i * i * i * i + humidity * i * i * i + 2 * i * i + i;

	    if (sum == 0)
	    {
		time = i;
		break;
	    }
	    if (i = hours && sum != 0)
	    {
	    c.println ("The balloon does not touch the ground in the given time");
	    break;
	    }
	}

	c.println ("The balloon first touches the ground at hour:");
	c.println (time);

    } // main method
} // WhoHasSeenTheWind class
