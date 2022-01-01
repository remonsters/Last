package third_task;
import java.util.Scanner;

public class LoanRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int amount=input.nextInt();
		System.out.print("Number of Years: ");
		int number=input.nextInt();
		
		double interestRate=5.0;
		double monthlyRate,monthlyPayment;
		double totalPayment;
		double annualRate=5.0;
		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment ");
		for(int i=1;i<=25;i++) {
			monthlyRate=annualRate/1200;
			monthlyPayment=amount*monthlyRate/(1-1/Math.pow(1+monthlyRate, number*12));
			totalPayment=monthlyPayment*number*12;
			System.out.printf("%.3f%%\t\t%14.2f\t\t%16.2f\n",interestRate,monthlyPayment,totalPayment);
			interestRate=interestRate+0.125;
			annualRate=annualRate+0.125;
		}

	}

}
