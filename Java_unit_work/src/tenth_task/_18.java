package tenth_task;

import java.util.Scanner;
import java.util.ArrayList;
public class _18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account l = new Account("George" , 1122 , 1000.0);
		ArrayList <Transaction> list = new ArrayList<>();
		
		l.deposit(30);
		l.deposit(40);
		l.deposit(50);
		
		l.withDraw(5);
		l.withDraw(4);
		l.withDraw(2);
		
		System.out.println(l.getId() + " " + l.getRate() + " " + l.getBalance() + " "  );
		
		list = l.getList();
		for(int i = list.size()-1;i >= 0;i--) {
			System.out.println(list.get(i));
		}

	}

}
