// The "WhatIsNDaddy" class.
import java.awt.*;
import hsa.Console;

public class WhatIsNDaddy
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int number = c.readInt ();

	int sum1 = 0;
	int sum2 = number;
	int count = 0;

	while (true)
	{
	    if (sum1 == sum2)
	    {
		count++;
		break;
	    }
	    count++;
	    sum1++;
	    sum2--;
	}
	
	c.println (count);

    } // main method
} // WhatIsNDaddy class
