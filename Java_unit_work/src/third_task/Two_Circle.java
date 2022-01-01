package third_task;
import java.util.Scanner;

public class Two_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		
		double d=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
		
		if(d<=Math.abs(r1-r2)) {
			System.out.println("circle2 is inside circle1");
		}
		else if(d<=r1+r2) {
			System.out.println("circle2 overlops circles1");
		}
		else {
			System.out.println("circle2 does not overlops circle1");
		}

	}

}
