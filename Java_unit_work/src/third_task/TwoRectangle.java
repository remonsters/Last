package third_task;
import java.util.Scanner;

public class TwoRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-,y-coordinates, width, and height: ");
		double r1center_x=input.nextDouble();
		double r1center_y=input.nextDouble();
		double r1width=input.nextDouble();
		double r1height=input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2center_x=input.nextDouble();
		double r2center_y=input.nextDouble();
		double r2width=input.nextDouble();
		double r2height=input.nextDouble();
		
		double inMinx=r1center_x-(r1width-r2width)/2;
		double inMaxx=r1center_x+(r1width-r2width)/2;
		double inMiny=r1center_y-(r1height-r2height)/2;
		double inMaxy=r1center_y+(r1height-r2height)/2;
		
		double outMinx=r1center_x-(r1width+r2width)/2;
		double outMaxx=r1center_x+(r1width+r2width)/2;
		double outMiny=r1center_y-(r1height+r2height)/2;
		double outMaxy=r1center_y+(r1height+r2height)/2;
		
		if(r2center_x>=inMinx && r2center_x<=inMaxx && r2center_y>=inMiny && r2center_y<=inMaxy) {
			System.out.println("r2 is inside r1");
		}
		else if(r2center_x<outMinx || r2center_x>outMaxx || r2center_y<outMiny || r2center_y>outMaxy){
			System.out.println("r2 does not overlaps r1");
		}
		else {
			System.out.println("r2 overlops r1");
		}

	}

}
