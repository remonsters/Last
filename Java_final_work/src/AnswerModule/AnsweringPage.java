package AnswerModule;
import beans.*;
import java.io.*;
import java.util.Scanner;


public class AnsweringPage extends Page {

	@Override
	public Page execute() {
		// TODO Auto-generated method stub
		// 1.���벢�����ļ�
		File file = new File("data/Question","Question.txt");
		int cnt = 0;
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
				System.out.println("���������Ĵ𰸣�(��ѡ�����룬�����д��ĸ)");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine();
				if (line.equals(userAnswer)) {
					System.out.println("�ش���ȷ");
					cnt++;
				} else {
					System.out.println("�ش������ȷ����"+ line);
				}
				// ��ʾ�û��Ƿ���һ��,�����true������
				System.out.println("�Ƿ��������");
				System.out.println("1 ��������");
				System.out.println("2 �˳�����");
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
		
		// ����û��ķ���
		// Ȼ����ʾ�û���������ʲô
		System.out.println("�����β��Եĳɼ��ǣ�"+cnt);
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
