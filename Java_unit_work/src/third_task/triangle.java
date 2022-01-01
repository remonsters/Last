package third_task;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three numbers of the triangle: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int Perimeter;
		if(a+b>c && a+c>b && b+c>a) {
			Perimeter=a+b+c;
			System.out.println("The perimeter of the triangle is "+Perimeter);
		}
		else {
			System.out.println("这些输入值不合法");
		}

	}

}
