// The "ReturningHome" class.
import java.awt.*;
import hsa.Console;

public class ReturningHome
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String line = "";
	String direction[] = new String [10];
	String street[] = new String [10];
	int count = 0;

	while (!line.equalsIgnoreCase ("SCHOOL"))
	{
	    line = c.readString ();
	    direction [count] = line;
	    line = c.readString ();
	    street [count] = line;
	    count++;
	}

	for (int i = count - 2 ; i >= 0 ; i--)
	{
	c.println ("Turn " + " onto " + street [i] + " street.");
	}

    } // main method
} // ReturningHome class
