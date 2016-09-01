// The "WhichAlien" class.
import java.awt.*;
import hsa.Console;

public class WhichAlien
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("How many antennas?");
	int antennas = c.readInt ();
	c.print ("How many eyes?");
	int eyes = c.readInt ();

	if (antennas >= 3 && eyes <= 4)
	{
	    c.println ("TroyMartian");
	}
	else if (antennas <= 3 && eyes >= 2)
	{
	    c.println ("VladSaturnian");
	}
	else if (antennas <= 2 && eyes <= 3)
	{
	    c.println ("GraemeMercurian");
	}

    } // main method
} // WhichAlien class
