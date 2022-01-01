package second_task;
import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter annual interest rate in percentage. e.g., 7.25
		System.out.print("Enter annual interest rate, e.g., 7.25: ");
		
		// Obtain monthly interest rate
		double monthlyInterestRate = input.nextDouble();
		
		//Enter number of years
		System.out.print(
				"Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Display results
		System.out.println("The monthly payment is $" + 
		    (int)(monthlyInterestRate * 100) / 100.0);
		System.out.println("The total payment is $" + 
		    (int)(totalPayment * 100) / 100.0);
		input.close();
		
		
		 
		

	}

}
