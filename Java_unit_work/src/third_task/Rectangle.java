package third_task;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x<0) {
			x=-x;
		}
		if(y<0) {
			y=-y;
		}
		if(x<(10/2) && y<(5.0/2)) {
			System.out.println("Point ("+x+","+y+") is in the rectangle");
		}
		else {
			System.out.println("Point ("+x+","+y+") is not in the rectangle");
		}
	}

}
