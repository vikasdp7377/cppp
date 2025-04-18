package day4_String_builder.exception;

public class NoExceptionHandlerMain {

	public static void main(String[] args) {

		//A program to accpet 2 number as command line arguments and print their addition
		try
		{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println("Addition = "+(num1+num2));
			
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Enter at least 2 number");
		}
	
	}

}
