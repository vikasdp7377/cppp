package day4_String_builder.exception;
//this is user defined exception specific  class.
public class InvalidPasswordException extends Exception {
//since this class is inherited from exception,it is checked exception.
//use RuntimeException as a parent in order to create unchecked exception.
	
	public InvalidPasswordException(String errormsg)
	{
		super(errormsg);
	}
}
