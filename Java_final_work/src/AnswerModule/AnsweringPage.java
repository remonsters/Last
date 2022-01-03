package AnswerModule;
import beans.*;
import java.io.*;
import java.util.Scanner;


public class AnsweringPage extends Page {

	@Override
	public Page execute() {
		// TODO Auto-generated method stub
		// 1.导入并解析文件
		File file = new File("data/Question","Question.txt");
		int cnt = 0;
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
				System.out.println("请输入您的答案：(若选择题请，输入大写字母)");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine();
				if (line.equals(userAnswer)) {
					System.out.println("回答正确");
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
					cnt++;
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
		int choice2=sc.nextInt();
		if(choice2==1)
			return new MainPage();

		else
			return null;
	}

}
