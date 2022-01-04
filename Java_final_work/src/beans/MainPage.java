package beans;

import java.util.Scanner;

import AnswerModule.AnsweringPage;
import LoginModule.UserManager;
import RiddleModule.RiddlePage;
import StoryModule.StoryPage;

public class MainPage extends Page {
	/*
	 * 主页面
	 * 
	 */
	@Override
	public Page execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------function-----------");
		System.out.println("1 答题");
		System.out.println("2 阅读小故事");
		System.out.println("3 猜灯谜");
		System.out.println("4 退出");
		System.out.print("请选择要执行的功能：");
		String choice_2 = sc.nextLine();
		switch (choice_2) {
		case "1":
			return new AnsweringPage();  //进入答题页面
		case "2":
			return new StoryPage();   //进入故事页面
		case "3":
			return new RiddlePage(); //进入猜谜页面
		case "4":
			return null;  //退出
		}
		return null;
	}

}
