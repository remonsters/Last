package beans;

import java.util.Scanner;

import AnswerModule.AnsweringPage;
import LoginModule.UserManager;
import RiddleModule.RiddlePage;
import StoryModule.StoryPage;

public class MainPage extends Page {
	/*
	 * ��ҳ��
	 * 
	 */
	@Override
	public Page execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------function-----------");
		System.out.println("1 ����");
		System.out.println("2 �Ķ�С����");
		System.out.println("3 �µ���");
		System.out.println("4 �˳�");
		System.out.print("��ѡ��Ҫִ�еĹ��ܣ�");
		String choice_2 = sc.nextLine();
		switch (choice_2) {
		case "1":
			return new AnsweringPage();  //�������ҳ��
		case "2":
			return new StoryPage();   //�������ҳ��
		case "3":
			return new RiddlePage(); //�������ҳ��
		case "4":
			return null;  //�˳�
		}
		return null;
	}

}
