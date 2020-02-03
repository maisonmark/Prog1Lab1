import java.util.*;
public class MyAgeIs {
	public static void main(String[] args){

		Scanner keyinput = new Scanner (System.in);
		System.out.println("Please enter the year of your birth");
		int yearborn = keyinput.nextInt();

		int currentyear = 2020;
		int age = currentyear - yearborn;

		System.out.println(" Your curent age is " + age);
	}
}