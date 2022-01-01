package fouth_task;

public class _27 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	     int i = 0;
	     int cnt=0;
	     int flag=0;
	    for(i=101;i<=2100;i++)
	    {
	        flag=0;
	    	if((i%4==0&&i%100!=0) || (i%400==0))
	    	{
	    		System.out.print(i+" ");
	      		cnt++;
	      		flag=1;
	    	}
	    	if(cnt%10==0&&flag==1)
	    		System.out.print("\n");
	    	
	    }
	    System.out.print("\nThe cnt is " + cnt);

	}

}
