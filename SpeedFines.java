// The "SpeedFines" class.
import java.awt.*;
import hsa.Console;

public class SpeedFines
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter the speed limit: ");
	int speedlimit = c.readInt ();
	c.print ("Enter the recorded speed of the car: ");
	int recordedspeed = c.readInt ();

	if (speedlimit >= recordedspeed)
	{
	    c.println ("Congratulations, you are within the speed limit!");
	}
	else if (speedlimit < recordedspeed)
	{
	    int difference = recordedspeed - speedlimit;
	    if (difference > 0 && difference < 21)
	    {
		c.println ("You are speeding and your fine is $100.");
	    }
	    else if (difference > 20 && difference < 31)
	    {
		c.println ("You are speeding and your fine is $270.");
	    }
	    else if (difference > 30)
	    {
		c.println ("You are speeding and your fine is $500.");
	    }
	}

    } // main method
} // SpeedFines class


