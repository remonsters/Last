package third_task;
import java.util.Scanner;

public class WeatherInTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		if((0-x)*100-(0-y)*0<=0 && (0-x)*(-100)-(100-y)*200<=0 && (200-x)*0-(0-y)*(-200)<=0 ) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}

	}

}
