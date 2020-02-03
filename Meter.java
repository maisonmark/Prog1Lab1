	import java.util.*;
	public class Meter {
	public static void main(String []args)	{

	Scanner keyinput = new Scanner (System.in);
	System.out.println("Please enter the distance in meters you would like to convert to feet");
	double DISTANCE = keyinput.nextDouble();

	double FEET = DISTANCE / 3.28084;

	System.out.println("The distance converted from meters to feet is " + FEET);

	}	
}