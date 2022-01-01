package third_task;
import java.util.Scanner;

public class ShowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of lines(1-15): ");
		int number=input.nextInt();
		int i,j,k,m;
		for(i=1;i<=number;i++) {
			for(j=number-i;j>=1;j--) {
				System.out.print("  ");
			}
//			for(int k=-(i-1);k<=i-1;k++) {
//				System.out.print(Math.abs(k)+1+" ");
//			}
			for(m=i;m>=1;m--) {
				System.out.printf("%2d",m);
			}
			for(k=2;k<=i;k++) {
				System.out.printf("%2d",k);
			}
			
			System.out.println();
		}
	}

}
