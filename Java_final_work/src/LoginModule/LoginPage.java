package LoginModule;

import java.util.*;

import AnswerModule.AnsweringPage;
import StoryModule.StoryPage;
import beans.MainPage;
import beans.Page;

public class LoginPage extends Page
{
 
	/**
	 * ִ�и�ҳ��Ĺ���
	 */
	public Page execute() 
	{
 
		while (true)
		{
			System.out.println("-----------Welcome-----------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.print("��ѡ��Ҫִ�еĹ��ܣ�");
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			switch (choice)
			{
			case "1":
				// ��¼����
				System.out.println("-----------Login-----------");
				System.out.print("�������û�����");
				String username = sc.nextLine();
				System.out.print("���������룺");
				String password = sc.nextLine();
 
				if (UserManager.isLogin(username, password)) 
				{
					user = UserManager.getUser(username); // ��ҳ����û�����Ϊָ���û�
					System.out.println("��¼�ɹ���");
					return new MainPage(); //������ҳ��
				}
					
				else 
					System.out.println("�û�����������������µ�¼��");
				break;
			case "2":
				// ע�Ṧ��
				System.out.println("-----------Regist-----------");
				System.out.print("�������û�����");
				String newID = sc.nextLine();
				System.out.print("���������룺");
				String newPassword = sc.nextLine();
				User newUser = new User();
				newUser.setID(newID);
				newUser.setpassword(newPassword);
				// ע����Ϣд��
				UserManager.regist(newUser);
				System.out.println("ע��ɹ���");
				break;
			case "3":
				System.out.println("-----------Bye~-----------");
				return null;
			}
		}
	}
}



