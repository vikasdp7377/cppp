package day1;

public class EmployeeMain {

	static {
		System.out.println("Employee Main class Loaded");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main class loaded");
		Employee e1 = new Employee();
		Employee e2 = new Employee(101,"Vikas",4563.87f);
		Employee e3 = new Employee(45324.34f,"Vikas",02);
		
		//System.out.println("Employee Count = "+Employee.empCount);
		System.out.println("Employee Count = "+e1.ReturnCount());
		System.out.println("Employee count = "+Employee.ReturnCountAgain());
		for(int i=0; i<5; i++)
		{
			new Employee();
		}
		System.out.println("Employee Count = "+e1.ReturnCount());
		System.out.println("Employee count = "+e1.ReturnCountAgain());
		System.out.println("Employee count = "+Employee.ReturnCountAgain());
		
	}

}
