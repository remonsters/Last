package seventh_task;

import java.util.Scanner;

public class Math_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three numbers of a,b,c: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		QuadraticEquation num=new QuadraticEquation(a,b,c);
		double flag=num.getDiscriminant();
		if(flag>0) {
			System.out.println("两个根分别为："+num.getRoot1()+" , "+num.getRoot2());
		}
		else if(flag==0) {
			System.out.println("只有一个根，为："+num.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}
		
	}

}
