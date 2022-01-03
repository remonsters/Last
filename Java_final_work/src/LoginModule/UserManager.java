package LoginModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ��̬�����࣬����User����
 * @author yc
 *
 */
public class UserManager
{
	//private static ArrayList<User> array = new ArrayList<User>();
	 
	public static boolean isLogin(String ID, String password) // �ж��˺������Ƿ���ȷ
	{
		File file=new File("data/user", ID+".txt");
		if (!file.exists()) {
			return false;
		} else {
			String info = null;
			try (BufferedReader reader = new BufferedReader(new FileReader(file));) { // ������Ϣ
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
	 * ���ļ��ж�ȡ���ݣ�������User����
	 * @return
	 */
	public static User getUser(String ID) {
		User user = null;
		File ID_password=new File("data/user", ID+".txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(ID_password));) { // ������Ϣ
			String info = reader.readLine();
			String[] infos = info.split(":");
			user = new User(infos[0], infos[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}
 
	public static void regist(User user) // �û����ݴ���ļ�
	{
		File ID_password=new File("data/user", user.getID()+".txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ID_password));) { // ����Ϣд���ļ�
			String info = user.getID() + ":" + user.getPassword();
			writer.write(info);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
