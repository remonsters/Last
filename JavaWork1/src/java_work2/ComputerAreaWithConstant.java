package java_work2;

import java . util .Scanner; // Scannner is in the java.util package
public class ComputerAreaWithConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		//  Create a Scanner object
		Scanner input = new Scanner(System .in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area =  radius * radius * PI;
		
		// Display result
		System.out.println("The area for the circle of radius " +
		   radius + " is " + area);

		input.close();
	}

}
