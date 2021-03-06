package AnswerModule;
import beans.*;
import java.io.*;
import java.util.Scanner;


public class AnsweringPage extends Page {
/*
 * 执行答题页面功能
 */
	@Override
	public Page execute() {
		//找到题库文件的路径
		File file = new File("data/Question","Question.txt");
		int cnt = 0;  //用来积分
		String line = null;
		boolean ifContinue = true; //用来判断是否继续答题
		try (BufferedReader r = new BufferedReader(new FileReader(file));) {
			while (ifContinue) 
			{
				while (!(line = r.readLine()).equals("***")) 
				{

					System.out.println(line);  //讲题展示给用户，“***”为分界符
				}
				line = r.readLine(); //line现在为答案
				System.out.println("请输入您的答案：(若选择题请，输入大写字母)");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine(); //用户输入答案
				if (line.equals(userAnswer)) {
					System.out.println("回答正确"); //用户输入的答案和line相同，加分
					cnt++;
				} else {
					System.out.println("回答错误，正确答案是"+ line);
				}
				// 提示用户是否下一题,如果是true，继续
				System.out.println("是否继续答题");
				System.out.println("1 继续答题");
				System.out.println("2 退出答题");
				Scanner sc=new Scanner(System.in);
				int choice=sc.nextInt();
				if(choice==1)
				{
					ifContinue=true;
				}
				else
					ifContinue=false;
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 输出用户的分数
		// 然后提示用户接下来干什么
		System.out.println("您本次测试的成绩是："+cnt);
		System.out.println("1 返回主页面");
		System.out.println("2 退出");
		Scanner sc=new Scanner(System.in);
		String choice2=sc.next();
		if(choice2=="1")
			return new MainPage();  //返回主页面

		else
			return null;  //退出
	}

}
