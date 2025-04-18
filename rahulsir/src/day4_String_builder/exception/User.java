package day4_String_builder.exception;

public class User {
	private String username;
	private String password; //must be min 8 and max. 15 characters long.
	public User()
	{
		username= "Vikas";
		password="resetabc123";
	}
	public User(String uname, String pass) throws InvalidPasswordException
	{
		username=uname;
		int passlength = password.length();
		if(passlength<8 || passlength>15)
		{
			InvalidPasswordException ipx = new InvalidPasswordException("Invalid Password");
			throw ipx;
		}
		password=pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws InvalidPasswordException {
		int passlength = password.length();
		if(passlength<8 || passlength>15)
		{
			InvalidPasswordException ipx = new InvalidPasswordException("Invalid Password");
			throw ipx;
		}
		
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
