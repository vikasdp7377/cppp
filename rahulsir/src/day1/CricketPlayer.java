package day1;

public class CricketPlayer extends Player {
	
	private int runs;
	
	public CricketPlayer(String name, int age,int runs) {
		//super(name,age);  if used.it must be the first statement.
		//if not used then it results into super() which invokes no argument constructor of base class
		
		this.runs=runs;
		
	}

}
