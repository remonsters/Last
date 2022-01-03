package beans;

import StoryModule.StoryPage;

import java.util.Date;

import AnswerModule.AnsweringPage;
import LoginModule.LoginPage;
/**
 * 页面管理类
 * @author yc
 *
 */
public class PageManager {
	
	public static void main(String[] args)
	{
		Date startTime = new Date();
		transfer();
		Date endTime = new Date();
		System.out.println("用时" + ((endTime.getTime() - startTime.getTime()) / 1000 / 60) + "分钟");
	}
	/**
	 * 页面切换
	 */
	public static void transfer() {
		   Page curPage = new LoginPage();
	        while (curPage != null) {
	            curPage = curPage.execute(); // execute()返回下一个执行界面，通过循环切换页面
	           // lastPage = tmp; // 保存上一页，以便用户执行“返回上一页”选项
	        }
	}
}


