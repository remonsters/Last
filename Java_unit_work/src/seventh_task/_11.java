package seventh_task;

import java.util.Scanner;
public class _11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print(" ‰»Îa,b,c,d,e,fµƒ÷µ£∫");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		LinearEquation num=new LinearEquation(a,b,c,d,e,f);
		boolean flag=num.isSolvable();
		if(!flag) {
			System.out.println("The equation has no soluation.");
		}
		else {
			System.out.println("The x is "+num.getX()+" and the y is "+num.getY());
		}
		

	}

}
