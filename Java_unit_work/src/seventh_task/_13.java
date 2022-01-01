package seventh_task;

import java.util.Scanner;

public class _13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int r=input.nextInt();
		int c=input.nextInt();
		
		System.out.println("Enter the array: ");
		double[][] arr=new double[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=input.nextDouble();
			}
		}
		Location x=new Location();
		x=locateLargest(arr);
		System.out.println("The location of the largest element is "+x.maxValue+" at ("+x.row+","+x.column+")");
		

	}
	public static Location locateLargest(double[][] a) {
		Location num=new Location();
		for(int m=0;m<a.length;m++) {
			for(int n=0;n<a[0].length;n++) {
				if(num.maxValue<a[m][n] ) {
					num.maxValue=a[m][n];
					num.row=m;
					num.column=n;
				}
			}
		}
		return num;
	}

}
