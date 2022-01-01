package seventh_task;

import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date=new GregorianCalendar();
		System.out.print(date.get(GregorianCalendar.YEAR)+"年");
		System.out.print(date.get(GregorianCalendar.MONTH)+"月");
		System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		
		System.out.println();
		
		date.setTimeInMillis(1234567898765L);
		System.out.print(date.get(GregorianCalendar.YEAR)+"年");
		System.out.print(date.get(GregorianCalendar.MONTH)+"月");
		System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		
	}

}
