package third_task;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten number: ");
		double average;
		double variance;
		double sum=0;
		double total=0;
		for(int i=1;i<=10;i++) {
			double number=input.nextDouble();
			sum+=number;
			total+=Math.pow(number, 2);
		}
		average=sum/10.0;
		variance=Math.sqrt((total-(Math.pow(sum, 2)/10.0))/9.0);
		System.out.println("The mean is "+average);
		System.out.printf("The standard deviation is %.5f",variance);

	}

}
