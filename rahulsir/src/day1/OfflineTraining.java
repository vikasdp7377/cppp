package day1;

public class OfflineTraining extends Training {
	
	private String venue;

	
	
	public OfflineTraining() {
		super();
		venue="MET NaShik";
	}

	public OfflineTraining(String moduleNmae, int duration, String venue) {
		super(moduleNmae, duration);
		this.venue = venue;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	public void conductTraining()
	{
		super.conductTraining();
		System.out.println("Conducting training at "+venue +" on "+getModuleNmae()+" for "+getDuration()+" hours");
	}
	public String getDetails()
	{
		String trainingDetails = super.getDetails();
		String venueDetails=" >--> venue : "+venue;
		String finalDetails=trainingDetails+venueDetails;
		return finalDetails;
	}

}
