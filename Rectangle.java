import java.util.*;
	public class Rectangle {
	public static void main(String []args)	{
		double length, height, perimeter, area;

	Scanner keyinput = new Scanner (System.in);

	System.out.println("Please enter the length of the Rectangle");
	length = keyinput.nextDouble();
	System.out.println("Please enter the height of the Rectangle");
	height = keyinput.nextDouble();

	area = length * height;
	perimeter = 2 * length + 2 * height;
	System.out.println("The perimeter of the Rectangle is " + perimeter);
	System.out.println("The area of the Rectangle is " + area);

	}

}

