	import java.util.*;
	public class Currency {
	public static void main(String[] args) {
		
		Scanner keyinput = new Scanner (System.in);
		System.out.println("Enter the amount of CAD you would like to convert");
		double CAD = keyinput.nextDouble();

		double USD = CAD * 0.76;
		double EUR = CAD * 0.68;

		System.out.println("CAD = " + CAD);	
		System.out.println("USD = " + USD);
		System.out.println("EUR = " + EUR);


	}
}