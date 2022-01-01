package third_task;
import java.util.Scanner;

public class ShowWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入年份和代表该年第一天是星期几的数字: ");
		int year=input.nextInt();
		int day=input.nextInt();
		
		String[] month= {"January","Febrary","March","April","May","June","July","August","September","Octomber","November","December"};
		String[] week= {"Monday","Tuesday","Wednesday","Thurday","Friday","Saturday","Sunday"};
		int[] monthDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			monthDay[1]=29;
		}
		
		for(int i=1;i<=12;i++) {
			System.out.printf("%s 1, %d is %s\n",month[i-1],year,week[day-1]);
			day=(day+monthDay[i-1])%7;
			if(day==0) {
				day=7;
			}
		}
	}

}
