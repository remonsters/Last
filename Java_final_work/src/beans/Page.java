package beans;
import LoginModule.User;

/**
 * ҳ�����
 * @author yc
 *
 */
public abstract class Page {
	protected static User user = null;
	
	/**
	 * ִ�и�ҳ��Ĺ��ܣ���������һ��Ҫִ�е�ҳ��
	 */
	public abstract Page execute();
}
