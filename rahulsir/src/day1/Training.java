package day1;

public class Training {
	
	private String moduleNmae;
	private int duration;
	
	public Training() {
		moduleNmae="oop using java";
		duration=40;
		
	}

	public Training(String moduleNmae, int duration) {
		super();
		this.moduleNmae = moduleNmae;
		this.duration = duration;
	}

	public String getModuleNmae() {
		return moduleNmae;
	}

	public void setModuleNmae(String moduleNmae) {
		this.moduleNmae = moduleNmae;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void conductTraining()
	{
		System.out.println("Conducting training......");
	}
	public String getDetails()
	{
		String details="Module Name : "+moduleNmae+", duration (Hrs) "+duration;
		return details;
	}
	
	
}
