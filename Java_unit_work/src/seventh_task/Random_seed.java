package seventh_task;
import java.util.Random;

public class Random_seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.print(number.nextInt(100)+" ");
		}

	}

}
