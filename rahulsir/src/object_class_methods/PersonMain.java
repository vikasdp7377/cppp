package object_class_methods;

public class PersonMain {

	public static void main(String[] args) {
		/*
		Person obj = new Person();
		int myage=26;
		System.out.println("My Age = "+myage);
		obj.show();
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastname());
		System.out.println(obj.getAge());
		System.out.println(obj.toString());
		System.out.println(obj);*/
		
		int myAge = 15;
		int  yourAge = 15;
		
		System.out.println("my age = your age ? "+(myAge==yourAge));
		Person obj = new Person("vikas","dawange",123);
		Person obj1 = new Person("vikas","dawange",123);
		System.out.println("is obj = obj1 ? "+(obj==obj1));
		System.out.println("using equals() operator "+(obj.equals(obj1)));
		
		
		
	
	}

}
