package fouth_task;

public class _25 {
	public static void main(String[] args)
	{
		int i=0;
		int j=0;
		double tol=0;
		for(j=1;j<=10;j++)
		{
			tol=0;
			for(i=1;i<=j*10000;i++)
			{
				tol+=Math.pow(-1,i+1)/(2*i-1);
			}
			System.out.println(4*tol);
		}
	
	}
}
