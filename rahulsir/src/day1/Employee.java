package day1;

public class Employee {

	static {
		//this is static block and it gets called as soon as the class is loaded.
		//it can be used to initialization static variables.
		empCount=100;
		System.out.println("Employee class loaded");
	}
	private int empNo; //Non-static (Instance variable-copy is created per new instance)
	private String empName;
	private float empSal;
	private static int empCount; //static(class variable-copy is created per class)
	
	Employee()
	{
		empCount++;
	}
	public Employee(int empNo, String empName, float empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		empCount++;
	}
	
	public Employee(float empSal, String empName, int empNo) {
		super();
		this.empSal = empSal;
		this.empName = empName;
		this.empNo = empNo;
		empCount++;
	}
	//method to return the empCount
	int ReturnCount()  // this is non-static method
	{                  //it can access static as well as non-static variable. it can also access 'this'.
                       //it must be call using object reference		
		
		return empCount;
	}
	public static int ReturnCountAgain()
	{
		//only access static variale
		//empNo, empName can't access
		return empCount;
		
	}

}
