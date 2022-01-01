package fouth_task;
import java.util.Scanner;    //导入Scanner类
public class _17 {
	public static void main (String[] args)
	{
		int i,j;
		// 创建Scanner类对象接收输入数据
	   Scanner input = new Scanner(System.in); 
	   
	   
	   System.out.println("Enter a integer between 1 and 15:  ");
	   int n = input.nextInt();
	   
	   //对第i行进行操作
	   for(i=1;i<=n;i++)  
	   {
		   // 输出金字塔左半边的空格部分
		  for(j=0;j<n-i;j++)
		  {
		      	System.out.print("  ");
		  }
		  
		   // 输出金字塔中间的数字部分
		  for(j=i;j>=1;j--)
		  {
			  if(j<10)  System.out.print(j + " ");
		  }
		  for(j=1;j<=i;j++)
		  {
			  if(j!=1)
				  System.out.print(j + " ");
		  }
		  
		  // 输出金字塔右边的空格部分
		  for(j=0;j<n-i;j++)
		  {
		      	System.out.print("  ");
		  }
		  
		  //开始一行的操作
		  System.out.print("\n");
	   }
	}

}
