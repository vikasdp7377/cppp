package day1;

public class OnlineTraining extends Training {

	private String Link;

	
	
	public OnlineTraining() {
		//code to initialize meetinglink field
		Link="ww";
	}
	
	

	public OnlineTraining(String link) {
		super();
		Link = link;
	}



	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}
	
	
	
	
		
}
