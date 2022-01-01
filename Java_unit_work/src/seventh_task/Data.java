package seventh_task;

import java.util.Date;

public class Data {
	public static void main(String[] args) {
		int d=10000;
		for(int i=0;i<8;i++) {
			Date time=new Date(d);
			System.out.println(time.toString());
			d*=10;
		}
	}

}
