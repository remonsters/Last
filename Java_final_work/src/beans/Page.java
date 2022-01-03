package beans;
import LoginModule.User;

/**
 * 页面基类
 * @author yc
 *
 */
public abstract class Page {
	protected static User user = null;
	
	/**
	 * 执行该页面的功能，并返回下一个要执行的页面
	 */
	public abstract Page execute();
}
