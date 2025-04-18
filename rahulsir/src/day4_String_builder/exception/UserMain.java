package day4_String_builder.exception;

public class UserMain {

	public static void main(String[] args) {
		
		User firstUser = null,secondUser = null;
		firstUser = new User();
		try {
			secondUser = new User("admin","asAdmin");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Enter password between 8 to 15");
			System.out.println(msg);
			
		}
		finally {
			System.out.println(firstUser);
			System.out.println(secondUser);
		}

	}

}
