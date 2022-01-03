package LoginModule;

public class User
{
	private String ID;
	private String password;
	 
    public User()
    {
    	
    };
    
    public User(String ID, String password) {
    	this.ID = ID;
    	this.password = password;
    }
   
    public void setID(String newID)
    {
    	this.ID=newID; 
    }
    
    public void setpassword(String newpassword)
    {
    	this.password=newpassword;
    }
    
    public String getPassword() 
    {
		return password;
	}
 
	public String getID() 
	{
		return ID;
	}
    
}
