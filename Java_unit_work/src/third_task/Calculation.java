package third_task;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		double sum=0;
		int a=-1;
		double b,c;
		for(int j=1;j<=i;j++) {
			b=2*j-1;
			c=Math.pow(a, j+1);
			sum=sum+c/b;
		}
		System.out.println("¦°µÄÖµÎª: "+4*sum);

	}

}
