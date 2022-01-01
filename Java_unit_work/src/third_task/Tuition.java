package third_task;
import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double start=10000;
		double sum=0;
		for(int i=0;i<10;i++) {
			start=start+start*0.05;
		}
		System.out.println("10年后的学费是："+start);
		for(int i=0;i<4;i++) {
			start=start+start*0.05;
			sum+=start;
		}
	
		System.out.println("10年后的4年内的总学费是："+sum);

	}

}
