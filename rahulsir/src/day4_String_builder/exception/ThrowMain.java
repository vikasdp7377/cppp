package day4_String_builder.exception;

public class ThrowMain {

	private static int divide(int x, int y)
	{
		if(y==0)
		{
			RuntimeException rx = new RuntimeException("second value zero");
			throw rx;
		}
		return (x/y);
		
	}
	
	public static void main(String[] args) {
		
		int divide1=divide(22,0);
		System.out.println(divide1);

	}

}
