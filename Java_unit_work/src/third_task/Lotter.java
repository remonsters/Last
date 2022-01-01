package third_task;
import java.util.Scanner;

public class Lotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*1000);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int number=input.nextInt();
		
		int number1=number/100;
		int number2=number/10%10;
		int number3=number%10;
		
		int lottery1=lottery/100;
		int lottery2=lottery/10%10;
		int lottery3=lottery%10;
		
		System.out.println("The lottery number is "+lottery);
		if(number==lottery) {
			System.out.println("Exact match: you win $10,000");
		}
		else if((number1==lottery1 && number2==lottery3 && number3==lottery2)
			|| (number1==lottery2 && number2==lottery1 && number3==lottery3)
			|| (number1==lottery2 && number2==lottery3 && number3==lottery1)
			|| (number1==lottery3 && number2==lottery1 && number3==lottery2)
			|| (number1==lottery3 && number2==lottery2 && number3==lottery1)) {
			System.out.println("Match all digits: you win $3,000");
		}
		else if(number1==lottery1 || number1==lottery2 || number1==lottery3
				|| number2==lottery1 || number2==lottery2 || number2==lottery3
				|| number3==lottery1 || number3==lottery2 || number3==lottery3) {
			System.out.println("Match one digits: you win $1,000");
		}
		else
			System.out.println("Sorry,no match");
	}

}
