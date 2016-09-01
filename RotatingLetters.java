// The "RotatingLetters" class.
import java.awt.*;
import hsa.Console;

public class RotatingLetters
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String letters[] = new String [7];
	letters [0] = "I";
	letters [1] = "O";
	letters [2] = "S";
	letters [3] = "H";
	letters [4] = "Z";
	letters [5] = "X";
	letters [6] = "N";

	String input = c.readString ();
	int length = input.length ();
	char letter;

	for (int i = 0 ; i < length ; i++)
	{
	    letter = input.charAt (i);
	    for (int e = 0 ; e < 8 ; e++)
	    {
		if (e = 7)
		{
		    c.println ("NO");
		    break;
		    break;
		}
		else if (String.valueOf (letter).equalsIgnoreCase (letters [e]))
		{
		    break;
		}
	    }
	}

    } // main method
} // RotatingLetters class


