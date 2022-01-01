package third_task;
import java.util.Scanner;

public class AnotherISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number=input.nextInt();
		int d,d10;
		int sum=0;
		int x=number;
		
		for(int i=9;i>=1;i--) {
			d=number%10;
			number=number/10;
			sum=sum+d*i;
		}
		d10=sum%11;
		if(d10==10) {
			System.out.printf("The ISBN-10 number is %09d",x);
			System.out.println("X");
		}
		else {
			System.out.printf("The ISBN-10 number is %09d",x);
			System.out.println(d10);
		}
		}

	}

