package RiddleModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import beans.MainPage;
import beans.Page;

public class RiddlePage extends Page {
	public Page execute() {
		// TODO Auto-generated method stub
		// 1.导入并解析文件
		File file = new File("data/Riddle","Riddle.txt");
		String line = null;
		boolean ifContinue = true;
		try (BufferedReader r = new BufferedReader(new FileReader(file));) {
			while (ifContinue) 
			{
				while (!(line = r.readLine()).equals("***"))
				{
	//				// 2.封装成一个Question对象
	//				Question question = new Question();
	//				question.description = line;
					// 3.展示给用户
					System.out.println(line);
				}
				/*
				 * 如果读到***，就是答案
				 * 4.读取用户答案，并校对
				 */
				line = r.readLine();
				System.out.println("请输入您的答案：");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine();
				if (line.equals(userAnswer)) {
					System.out.println("猜对了");
				} else {
					System.out.println("猜错了，谜语答案是"+ line);
				}
				// 提示用户是否下一题,如果是true，继续
				System.out.println("是否继续猜谜");
				System.out.println("1 继续猜迷");
				System.out.println("2 退出猜谜");
				Scanner sc=new Scanner(System.in);
				int choice=sc.nextInt();
				if(choice==1)
					ifContinue=true;
				else
					ifContinue=false;
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 输出用户的分数
		// 然后提示用户接下来干什么
		System.out.println("1 返回主页面");
		System.out.println("2 退出");
		Scanner sc=new Scanner(System.in);
		int choice2=sc.nextInt();
		if(choice2==1)
			return new MainPage();

		else
			return null;
	}

}
