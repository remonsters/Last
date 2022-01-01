package third_task;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个十进制整数： ");
		int number=input.nextInt();
		int[] arr=new int[32];
		int i = 0;
		while(number!=0) {
			arr[i]=number%2;
			number/=2;
			i++;
		}
		for(i-=1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
