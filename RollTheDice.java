// The "RollTheDice" class.
import java.awt.*;
import hsa.Console;

public class RollTheDice
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.print ("Enter m: ");
	int m = c.readInt ();
	c.print ("Enter n; ");
	int n = c.readInt ();
	
    } // main method
} // RollTheDice class
