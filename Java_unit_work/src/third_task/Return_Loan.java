package third_task;
import java.util.Scanner;

public class Return_Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		int Loanamount=input.nextInt();
		
		System.out.print("Number of Years: ");
		int years=input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualRate=input.nextDouble();
		
		double monthlyRate=annualRate/1200;
		double monthlyPayment=Loanamount*monthlyRate/(1-1/Math.pow(1+monthlyRate, years*12));
		double totalPayment=monthlyPayment*years*12;
		
		System.out.println();
		
		System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
		System.out.printf("Total Payment: %.2f\n",totalPayment);
		
		System.out.println();
		
		System.out.print("Payment#\tInterest\tPrincipal\tBalance");
		
		System.out.println();
		
		double balance=Loanamount;
		for(int i=1;i<=years*12;i++) {
			double interest=monthlyRate*balance;
			double principal=monthlyPayment-interest;
			balance=balance-principal;
			System.out.printf("%2d\t\t%.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
		}
		
		

	}

}
