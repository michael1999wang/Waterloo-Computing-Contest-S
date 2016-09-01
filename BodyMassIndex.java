// The "BodyMassIndex" class.
import java.awt.*;
import hsa.Console;

public class BodyMassIndex
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.println ("Enter height: ");
	int weight = c.readInt();
	c.println ("Enter weight: ");
	int height = c.readInt ();
	
	int bmi = weight / (height*height);
	
	if (bmi > 25)
	{
	c.println ("Overweight");
	}
	else if (bmi <= 25 && bmi >= 18.5)
	{
	c.println ("Normal weight");
	}
	else if (bmi > 25)
	{
	c.println ("Underweight");
	}
	
    } // main method
} // BodyMassIndex class
