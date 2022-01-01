package third_task;
import java.util.Scanner;

public class Calculation_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		double e=1;
		double item=1;
		for(int j=2;j<=i;j++) {
			e=e+item;
			item=item/j;
		}
		System.out.println(e);

	}

}
