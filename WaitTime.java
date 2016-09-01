// The "WaitTime" class.
import java.awt.*;
import hsa.Console;
import java.util.*;

public class WaitTime
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int numberOfMessages = c.readInt ();
	int friend[] = new int [numberOfMessages];
	String interaction[] = new String [numberOfMessages];
	String line;
	int delay1 = 0, final1 = 0;
	int delay2 = 0, final2 = 0;

	for (int i = 0 ; i < numberOfMessages ; i++)
	{
	    line = c.readLine ();
	    friend [i] = friendTokenizer (line);
	    interaction [i] = interactionTokenizer (line);
	}

	for (int i = 0 ; i < numberOfMessages ; i++)
	{
	    if (interaction [i].equalsIgnoreCase ("R"))
	    {
		if (friend [i] == 1)
		{
		    delay2++;
		}
		else if (friend [i] == 2)
		{
		    delay1++;
		}
	    }
	    else if (interaction [i].equalsIgnoreCase ("W"))
	    {
		delay1 += friend [i];
		delay2 += friend [i];
	    }
	    else if (interaction [i].equalsIgnoreCase ("S"))
	    {
		if (friend [i] == 1)
		{
		    delay1 = final1;
		    delay2++;
		}
		else if (friend [i] == 2)
		{
		    delay2 = final2
		    delay++;
		}
	    }
	    delay1++;
	    delay2++;
	}


    } // main method


    public static int friendTokenizer (String line)
    {
	String text;
	int value;

	StringTokenizer st = new StringTokenizer (line);

	text = st.nextToken ();
	text = st.nextToken ();

	value = Integer.parseInt (text);

	return value;
    }


    public static String interactionTokenizer (String line)
    {
	String text;

	StringTokenizer st = new StringTokenizer (line);

	text = st.nextToken ();

	return text;
    }
} // WaitTime class
