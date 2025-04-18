package day1;

public class Player {

	private String name;
	private int age;
	
	public Player()
	{
		System.out.println("Inside Player()");
	}

	public Player(String name, int age) {
		System.out.println("Inside Player(String int)");
		this.name = name;
		this.age = age;
	}

	public Player(int age, String name) {
		System.out.println("Inside Player(int String");
		this.age = age;
		this.name = name;
	}
	
	
}
