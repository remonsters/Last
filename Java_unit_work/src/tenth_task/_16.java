package tenth_task;

import java.util.Scanner;
import java.util.ArrayList;

public class _16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		int value = num1 + num2;

		
		System.out.print("What is "+ num1+" + "+ num2 + " ? ");
		
		int answer;
		
		answer = input.nextInt();
		
		while(answer != value) {
			
			if(!list.contains(answer)) {
				System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + " ? ");
				list.add(answer);
				answer = input.nextInt();
			}
			else if(list.contains(answer)) {
				System.out.print("You already entered " + answer);
				System.out.println();
				System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + " ? ");
				answer = input.nextInt();
				}
			}
			System.out.println("You got it!");
		}		
}
