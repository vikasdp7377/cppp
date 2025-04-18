package day4_String_builder.exception;

public class ThrowsMain {
	
	private static void doTest() throws Exception
	{
		//this method wants to intimate compiler that it may throw an exception but
		//not willing to handle it. its caller must handle it.
		System.out.println("aaaaa");
	}
	private static void beginTest() 
	{
		//this method needs to invoke doTest(). that means this method is the caller of doTest().
		try
		{
			doTest();
		}catch(Exception ex)
		{
			
		}
		//this method has handled the exception.
		
	}
	private static void startTest() throws Exception
	{
		//this method needs to invoke doTest(). that means this method is the caller of doTest().
		//this method also does not want to handle the exception. it wants to delegate this responsibility to its calller
		doTest();
	}
	private static void doSimpleTest() throws RuntimeException
	{
		
	}
	public static void main(String[] args) {
	
		beginTest();
		//since beginTest() has already fulfilled the requirement, main() is not required tp handle it.
		
		try
		{
			startTest();
		}
		catch(Exception ex)
		{
			
		}
	}

}
