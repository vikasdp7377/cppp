package day1;

public class TrainMain {

	public static void main(String[] args) {
	
		Training tr = new OfflineTraining();
		//tr.getVenue;  has to be invoked using type casting
		OfflineTraining offtr = (OfflineTraining)tr;
		System.out.println(offtr.getVenue());
		System.out.println(tr.getDetails());

	}

}
