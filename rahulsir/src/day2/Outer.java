package day2;

public class Outer {
	
	private static String greeting = "Welcome";
	private static String message = "Hello";
	
	 void print() {
	        // Local class defined within the print() method
	        class msg {
	            String getMessage(String msg, String name) {
	                return msg + " " + name;
	            }
	        }
	        msg obj = new msg(); // Creating an instance of the local class
	        String greetingMessage = obj.getMessage("Welcome", "Tina");
	        System.out.println(greetingMessage); // Prints: Welcome Tina
	    }
	
	public static class Inner {
		
		public void print()
		{
			System.out.println(message);
			//System.out.println(greeting ); //error greeting is non-static(Not Accessible)
		}
		
		
			
		
	}
	
	
	// access static 
	public class NestedClass {

		public void print()
		{
			System.out.println(message);
			System.out.println(greeting);
		}

		
	}
	
}
