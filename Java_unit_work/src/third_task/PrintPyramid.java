package third_task;

public class PrintPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,m;
		for(i=1;i<=8;i++) {
			for(j=8-i;j>=1;j--) {
				System.out.print("    ");
			}
			for(k=1;k<=i;k++) {
					System.out.printf("%4d",(int)Math.pow(2, k-1));
			}
			for(m=i-1;m>=1;m--) {
				System.out.printf("%4d",(int)Math.pow(2, m-1));
			}
			System.out.println();
		}
	}

}
