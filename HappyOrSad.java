// The "HappyOrSad" class.
import java.awt.*;
import hsa.Console;
import java.util.*;

public class HappyOrSad
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String line = "";
	int length = 0, happy = 0, sad = 0;

	while (true)
	{
	    line = c.readLine ();
	    StringTokenizer st = new StringTokenizer (line);
	    length = st.countTokens ();

	    for (int i = 0 ; i < length ; i++)
	    {
		c.println (st.nextToken ());
		if (st.nextToken ().equals (":-)"))
		{
		    happy++;
		}
		else if (st.nextToken ().equals (":-("))
		{
		    sad++;
		}
	    }

	    if (happy > sad)
	    {
		c.println ("Happy");
	    }
	    else if (happy < sad)
	    {
		c.println ("Sad");
	    }

	    c.println ();
	}

    } // main method
} // HappyOrSad class
