package LoginModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 静态工具类，管理User对象
 * @author yc
 *
 */
public class UserManager
{
	//private static ArrayList<User> array = new ArrayList<User>();
	 
	public static boolean isLogin(String ID, String password) // 判断是否注册，
	{
		//先找到以ID为文件名的ID是否存在
		File file=new File("data/user", ID+".txt");
		if (!file.exists()) {
			//不存在直接返回false
			return false;
		} else {
			//若存在，再判断密码是否正确，若正确返回true，若错误返回false
			String info = null;
			try (BufferedReader reader = new BufferedReader(new FileReader(file));) { 
				info = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (info.split(":")[1].equals(password)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * 从文件中读取数据，并返回User对象
	 * @return
	 */
	public static User getUser(String ID) {
		User user = null;
		File ID_password=new File("data/user", ID+".txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(ID_password));) { 
			// 读入信息，以“：”分隔，前面为infos[0]为用户的ID，后面的为inof[1]为用户的密码
			String info = reader.readLine();
			String[] infos = info.split(":");
			user = new User(infos[0], infos[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}
 
	public static void regist(User user) //注册， 用户数据存进文件，文件名是用户的ID
	{
		File ID_password=new File("data/user", user.getID()+".txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ID_password));) { // 把信息写入文件
			String info = user.getID() + ":" + user.getPassword();
			writer.write(info);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
