// The "SumacSequences" class.
import java.awt.*;
import hsa.Console;

public class SumacSequences
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Term 1: ");
	int term1 = c.readInt ();
	c.print ("Term 2: ");
	int term2 = c.readInt ();

	int last = 1, current = 0, next = 0, count = 0;

	last = term1;
	current = term2;

	while (last > 0)
	{
	    next = last - current;
	    last = current;
	    current = next;
	    count++;
	}
	c.println (count);

    } // main method
} // SumacSequences class
