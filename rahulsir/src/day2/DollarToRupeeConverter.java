package day2;

public class DollarToRupeeConverter implements CurrencyCoverter {

	@Override
	public float doConverter(float amountInDollars) {
		float amountInRupees = amountInDollars * dollar_to_rupee;
		return amountInRupees;
	}

}
