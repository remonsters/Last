package AnswerModule;
import beans.*;
import java.io.*;
import java.util.Scanner;


public class AnsweringPage extends Page {
/*
 * ִ�д���ҳ�湦��
 */
	@Override
	public Page execute() {
		//�ҵ�����ļ���·��
		File file = new File("data/Question","Question.txt");
		int cnt = 0;  //��������
		String line = null;
		boolean ifContinue = true; //�����ж��Ƿ��������
		try (BufferedReader r = new BufferedReader(new FileReader(file));) {
			while (ifContinue) 
			{
				while (!(line = r.readLine()).equals("***")) 
				{

					System.out.println(line);  //����չʾ���û�����***��Ϊ�ֽ��
				}
				line = r.readLine(); //line����Ϊ��
				System.out.println("���������Ĵ𰸣�(��ѡ�����룬�����д��ĸ)");
				Scanner in = new Scanner(System.in);
				String userAnswer = in.nextLine(); //�û������
				if (line.equals(userAnswer)) {
					System.out.println("�ش���ȷ"); //�û�����Ĵ𰸺�line��ͬ���ӷ�
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
		String choice2=sc.next();
		if(choice2=="1")
			return new MainPage();  //������ҳ��

		else
			return null;  //�˳�
	}

}
