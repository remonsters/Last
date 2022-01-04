package LoginModule;

import java.util.*;

import AnswerModule.AnsweringPage;
import StoryModule.StoryPage;
import beans.MainPage;
import beans.Page;

public class LoginPage extends Page
{
 
	/**
	 * 执行该页面的功能
	 */
	public Page execute() 
	{
 
		while (true)
		{
			System.out.println("-----------Welcome-----------");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.print("请选择要执行的功能：");
			Scanner sc = new Scanner(System.in);
			String choice = sc.nextLine();
			switch (choice)
			{
			case "1":
				// 登录功能
				System.out.println("-----------Login-----------");
				System.out.print("请输入用户名：");
				String username = sc.nextLine();
				System.out.print("请输入密码：");
				String password = sc.nextLine();
 
				if (UserManager.isLogin(username, password)) 
				{
					user = UserManager.getUser(username); // 把页面的用户设置为指定用户
					System.out.println("登录成功！");
					return new MainPage(); //进入主页面
				}
					
				else 
					System.out.println("用户名或密码错误！请重新登录！");
				break;
			case "2":
				// 注册功能
				System.out.println("-----------Regist-----------");
				System.out.print("请输入用户名：");
				String newID = sc.nextLine();
				System.out.print("请输入密码：");
				String newPassword = sc.nextLine();
				User newUser = new User();
				newUser.setID(newID);
				newUser.setpassword(newPassword);
				// 注册信息写入
				UserManager.regist(newUser);
				System.out.println("注册成功！");
				break;
			case "3":
				System.out.println("-----------Bye~-----------");
				return null;
			}
		}
	}
}



