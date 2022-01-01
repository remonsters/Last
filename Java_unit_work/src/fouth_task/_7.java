package fouth_task;

public class _7 {

	public static void main(String[] args) {
		int i;
		int expense = 10000;
		int total = 0;
		for(i = 0;i<10 ;i++)
		{
			expense *= (1+0.05);
		}
		System.out.println("The expense of ten year after is: "+ expense);
		total = expense;
		for(i=0;i<4;i++)
		{
			total *= (1+ 0.05);
		}
		System.out.println(total);
	}
	         
}
