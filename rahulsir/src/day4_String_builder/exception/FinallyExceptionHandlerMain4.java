package day4_String_builder.exception;

import java.security.DigestException;

public class FinallyExceptionHandlerMain4 {

	public static void main(String[] args) {

		// A program to accpet 2 number as command line arguments and print their
		// addition
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("Addition = " + (num1 / num2));

		} catch (ArithmeticException ex) {
			System.out.println("divide by Zero.... " + ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter at least 2 num....." + ex);
		} catch (Exception ex) {
			System.out.println("Generic block...");
		} // finally
			// {
		System.out.println("Done.......");
		// }

	}

}
//the catch block of child type must appear before the catch block of parent type.