package third_task;
import java.util.Scanner;

public class ShowCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入年份和代表该年第一天是星期几的数字: ");
		int year=input.nextInt();
		int day=input.nextInt();
		
		String[] month= {"January","Febrary","March","April","May","June","July","August","September","Octomber","November","December"};
		int[] monthDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			monthDay[1]=29;
		}

		for(int i=1;i<=12;i++) {
			System.out.println("             "+month[i-1]+year+"          ");
			System.out.println("————————————————————————————————————————————");
			System.out.println(" Sun   Mon  Tue   Wed   Thu   Fri   Sat");
			
			int count=0;
			//输出空格
			for(int j=1;j<=day;j++) {
				System.out.print("    ");//4
				count++;
			}
			//输出数字
			for(int k=1;k<=monthDay[i-1];k++) {
				System.out.printf("%2d    ", k);//4
				count++;
				if(count%7==0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			day=(day+monthDay[i-1])%7;
		}

	}

}
