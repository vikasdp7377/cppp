package day2;

public class CurrencyMain {

	public static void main(String[] args) {
		
		CurrencyCoverter c;
		c= new DollarToRupeeConverter();
		float ruppes = c.doConverter(1500);
		System.out.println("$1500 = INR : "+ruppes);
		
		c = new RupeeToPoundConverter();
		float pounds=c.doConverter(500000);
		System.out.println("INR 500000 = GBP : "+pounds);
		
		c= new DollarToRupeeConverter();
		float ruppes1 = c.doConverter(2);
		System.out.println("$2 = INR : "+ruppes1);
		
		c = new RupeeToPoundConverter();
		float pounds1=c.doConverter(500);
		System.out.println("INR 500 = GBP : "+pounds1);

	}

}
