package beans;

import StoryModule.StoryPage;

import java.util.Date;

import AnswerModule.AnsweringPage;
import LoginModule.LoginPage;
/**
 * ҳ�������
 * @author yc
 *
 */
public class PageManager {
	
	public static void main(String[] args)
	{
		Date startTime = new Date();
		transfer();
		Date endTime = new Date();
		System.out.println("��ʱ" + ((endTime.getTime() - startTime.getTime()) / 1000 / 60) + "����");
	}
	/**
	 * ҳ���л�
	 */
	public static void transfer() {
		   Page curPage = new LoginPage();
	        while (curPage != null) {
	            curPage = curPage.execute(); // execute()������һ��ִ�н��棬ͨ��ѭ���л�ҳ��
	           // lastPage = tmp; // ������һҳ���Ա��û�ִ�С�������һҳ��ѡ��
	        }
	}
}


