package fouth_task;
import java.util.*;
public class _19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i=1;
		int j=0;
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		for(i=0;i<n;i++)  
		   {
			for(j=1;j<n-i;j++)
				System.out.print("  ");
			
			for(j=0;j<i;j++)
				System.out.print((int)Math.pow(2,j)+" ");
			
		    System.out.print((int)Math.pow(2,i)+" ");
		    
		    for(j=i-1;j>=0;j--)
		    	System.out.print((int)Math.pow(2,j)+" ");
		    
			for(j=1;j<n;j++)
				System.out.print("  ");
			
			System.out.print("\n");
		   }
	}

}
