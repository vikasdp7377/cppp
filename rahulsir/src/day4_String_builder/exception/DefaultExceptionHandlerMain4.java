package day4_String_builder.exception;

import java.security.DigestException;

public class DefaultExceptionHandlerMain4 {

	public static void main(String[] args) {

		//A program to accpet 2 number as command line arguments and print their addition
		try
		{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println("Addition = "+(num1/num2));
			
		}
		//this feature was added by java version 7
		//Rule: Exception classes used int 'catch' block must not be in parent-chald relationship
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ex)
		{
			if(ex instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Enter at least 2 num.....");
			}
			else
			{
				System.out.println("divide by Zero.... ");
			}
			System.out.println(ex);
		}
		/*catch( ArithmeticException ex)
		{
			System.out.println("divide by Zero.... "+ex);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Enter at least 2 num....."+ex);
		}*/
	}

}
