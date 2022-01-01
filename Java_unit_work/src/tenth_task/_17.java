package tenth_task;

import java.util.ArrayList;
import java.util.Scanner;

public class _17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int n,i,num;
		int sum=1;
		int x = m;
		for(i = 2; i <= x; i++) {
			if(x % i == 0) {
				n = i;
				if(isPrime(n)) {
					list.add(n);
				}
				x = x / i;
			}
		}
		int[] array1 = new int[list.size()];
		for(i = 0; i < list.size(); i++) {
			array1[i] = list.get(i);
		}
		int[] a = new int[array1.length];
		for(i = 0;i < array1.length; i++) {		
			a[i] = 0;
			for(int j = 0;j < array1.length; j++) {
				if(array1[i] == array1[j]) {
					a[i]++;
				}
			}
		}
		for(i = 0;i < array1.length; i++) {
			if(a[i] % 2 != 0) {
				sum *=array1[i];
			}
		}
		System.out.println("The smallest number n for m to be a perfect squar is " + sum);
		System.out.println(" m * n is " + m*sum);
	}
	private static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
