package fouth_task;
import java.util.Scanner;    //����Scanner��
public class _17 {
	public static void main (String[] args)
	{
		int i,j;
		// ����Scanner����������������
	   Scanner input = new Scanner(System.in); 
	   
	   
	   System.out.println("Enter a integer between 1 and 15:  ");
	   int n = input.nextInt();
	   
	   //�Ե�i�н��в���
	   for(i=1;i<=n;i++)  
	   {
		   // ������������ߵĿո񲿷�
		  for(j=0;j<n-i;j++)
		  {
		      	System.out.print("  ");
		  }
		  
		   // ����������м�����ֲ���
		  for(j=i;j>=1;j--)
		  {
			  if(j<10)  System.out.print(j + " ");
		  }
		  for(j=1;j<=i;j++)
		  {
			  if(j!=1)
				  System.out.print(j + " ");
		  }
		  
		  // ����������ұߵĿո񲿷�
		  for(j=0;j<n-i;j++)
		  {
		      	System.out.print("  ");
		  }
		  
		  //��ʼһ�еĲ���
		  System.out.print("\n");
	   }
	}

}
