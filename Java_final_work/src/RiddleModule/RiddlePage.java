package RiddleModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import beans.MainPage;
import beans.Page;

public class RiddlePage extends Page {
	/*
	 * 执行猜谜页面功能
	 */
	public Page execute() {
		//找到猜谜谜题的文件路径
		File file = new File("data/Riddle","Riddle.txt");
		String line = null;
		boolean ifContinue = true;
		try (BufferedReader r = new BufferedReader(new FileReader(file));) {
			while (ifContinue) 
			{
				while (!(line = r.readLine()).equals("***"))
				{
	//				/
					System.out.println(line);
				}
				
				
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
			return new MainPage();  //返回主页面

		else
			return null;  //退出
	} 

}
