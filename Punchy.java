// The "Punchy" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;

public class Punchy
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int a = 0;
	int b = 0;
	String line;
	String token, letter;
	int choice = 0, value;

	while (choice != 7)
	{
	    line = c.readString ();
	    StringTokenizer st = new StringTokenizer (line);
	    token = st.nextToken ();
	    choice = Integer.parseInt (token);
	    letter = st.nextToken ();
	    token = st.nextToken ();
	    value = Integer.parseInt (token);
	    if (choice == 1)
	    {
		if (letter.equalsIgnoreCase ("A"))
		{
		    a = value;
		}
		else if (letter.equalsIgnoreCase ("B"))
		{
		    b = value;
		}
	    }
	    else if (choice == 2)
	    {
		if (letter.equalsIgnoreCase ("A"))
		{
		    c.println (a);
		}
		else if (letter.equalsIgnoreCase ("B"))
		{
		    c.println (b);
		}
	    }
	    else if (choice == 3)
	    {
		a += b;
	    }
	    else if (choice == 4)
	    {
		a *= b;
	    }
	    else if (choice == 5)
	    {
		a -= b;
	    }
	    else if (choice == 6)
	    {
		a /= b;
	    }
	    else if (choice == 7)
	    {
		break;
	    }
	}

    } // main method
} // Punchy class


