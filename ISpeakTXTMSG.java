// The "ISpeakTXTMSG" class.
import java.awt.*;
import hsa.Console;

public class ISpeakTXTMSG
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter phrase>");
	String phrase = c.readString ();

	if (phrase.equals ("CU"))
	{
	    c.println ("See you");
	}
	else if (phrase.equals (":-)"))
	{
	    c.println ("I'm happy");
	}
	else if (phrase.equals (":-("))
	{
	    c.println ("I'm unhappy");
	}
	else if (phrase.equals (";-)"))
	{
	    c.println ("wink");
	}
	else if (phrase.equals (":-P"))
	{
	    c.println ("stick out my tongue");
	}
	else if (phrase.equals ("(~.~)"))
	{
	    c.println ("sleepy");
	}
	else if (phrase.equals ("TA"))
	{
	    c.println ("totally awesome");
	}
	else if (phrase.equals ("CCC"))
	{
	    c.println ("Canadian Computing Competition");
	}
	else if (phrase.equals ("CUZ"))
	{
	    c.println ("because");
	}
	else if (phrase.equals ("TY"))
	{
	    c.println ("thank-you");
	}
	else if (phrase.equals ("YW"))
	{
	    c.println ("your're welcome");
	}
	else if (phrase.equals ("TTYL"))
	{
	    c.println ("talk to you later");
	}
	else
	{
	    c.println (phrase);
	}

    } // main method
} // ISpeakTXTMSG class
