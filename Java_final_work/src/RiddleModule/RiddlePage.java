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
		// 1.���벢�����ļ�
		File file = new File("data/Riddle","Riddle.txt");
		String line = null;
		boolean ifContinue = true;
		try (BufferedReader r = new BufferedReader(new FileReader(file));) {
			while (ifContinue) 
			{
				while (!(line = r.readLine()).equals("***"))
				{
	//				// 2.��װ��һ��Question����
	//				Question question = new Question();
	//				question.description = line;
					// 3.չʾ���û�
					System.out.println(line);
				}
				/*
				 * �������***�����Ǵ�
				 * 4.��ȡ�û��𰸣���У��
				 */
				line = r.readLine();
				System.out.println("���������Ĵ𰸣�");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine();
				if (line.equals(userAnswer)) {
					System.out.println("�¶���");
				} else {
					System.out.println("�´��ˣ��������"+ line);
				}
				// ��ʾ�û��Ƿ���һ��,�����true������
				System.out.println("�Ƿ��������");
				System.out.println("1 ��������");
				System.out.println("2 �˳�����");
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
		
		// ����û��ķ���
		// Ȼ����ʾ�û���������ʲô
		System.out.println("1 ������ҳ��");
		System.out.println("2 �˳�");
		Scanner sc=new Scanner(System.in);
		int choice2=sc.nextInt();
		if(choice2==1)
			return new MainPage();

		else
			return null;
	}

}
