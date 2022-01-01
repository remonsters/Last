package seventh_task;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入四个端点值：");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		
		double a=-(y2-y1)/(x2-x1);
		double b=1.0;
		double c=-(y4-y3)/(x4-x3);
		double d=1.0;
		double e=a*x1+y1;
		double f=c*x3+y3;
		
		LinearEquation num=new LinearEquation(a,b,c,d,e,f);
		boolean flag=num.isSolvable();
		if(!flag) {
			System.out.println("The equation has no soulation.");
		}
		else {
			System.out.println("交点坐标为("+num.getX()+","+num.getY()+")");
		}

	}

}
