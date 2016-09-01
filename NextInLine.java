// The "NextInLine" class.
import java.awt.*;
import hsa.Console;

public class NextInLine
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int age1 = c.readInt ();
	int age2 = c.readInt ();
	
	int difference = age2 - age1;
	
	c.println (age2 + difference);
	
    } // main method
} // NextInLine class
