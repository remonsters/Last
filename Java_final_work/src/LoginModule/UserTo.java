package LoginModule;

public interface UserTo
{
	boolean isLogin(String username, String password);
	void regist(User user);
}
