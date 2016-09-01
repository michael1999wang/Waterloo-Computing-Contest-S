// The "UpAndDown" class.
import java.awt.*;
import hsa.Console;

public class UpAndDown
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int NikkyForward = c.readInt ();
	int NikkyBackward = c.readInt ();
	int BryonForward = c.readInt ();
	int BryonBackward = c.readInt ();
	int steps = c.readInt ();
	int Bryonremainder = 0;
	int Bryontotalmovement = 0;
	int Nikkyremainder = 0;
	int Nikkytotalmovement = 0;

	int Nikkysum = NikkyForward + NikkyBackward;
	int Bryonsum = BryonForward + BryonBackward;
	int Nikkymovement = NikkyForward - NikkyBackward;
	int Bryonmovement = BryonForward - BryonBackward;

	int Nikkyfloor = steps / Nikkysum;
	int Bryonfloor = steps / Bryonsum;

	int Nikkysteps = steps - Nikkymovement * Nikkyfloor;
	int Bryonsteps = steps - Bryonmovement * Bryonfloor;

	if (Nikkysteps != 0)
	{
	    Nikkyremainder = Nikkysteps - NikkyForward;
	    Nikkytotalmovement = Nikkymovement + NikkyForward - Nikkyremainder;
	}
	if (Bryonsteps != 0)
	{
	    Bryonremainder = Bryonsteps - BryonForward;
	    Bryontotalmovement = Bryonmovement + BryonForward - Bryonremainder;
	}

	if (Nikkytotalmovement > Bryontotalmovement)
	{
	    c.println ("Nikky");
	}
	else
	{
	    c.println ("Bryon");
	}

    } // main method
} // UpAndDown class
