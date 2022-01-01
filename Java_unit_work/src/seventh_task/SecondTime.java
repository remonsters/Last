package seventh_task;

import java.util.Arrays;
import java.util.Random;

public class SecondTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100000];
		Random num=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=num.nextInt(100000);
		}
		StopWatch time=new StopWatch();
		Arrays.sort(arr);
		time.stop();
		System.out.println(time.getElapsedTime()+"ºÁÃë");

	}

}
