package java_work2;

import java.util.Scanner;//Scanner is in the java.util package
public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers
		System.out.print("Enter three number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute average
		double average = (number1 + number2+ number3) / 3;
		
		// Display results 
		System.out.println("The average of " + number1 +" " + number2
		  + " " + number3 + " is " + average);
      
		input.close();
	}

}