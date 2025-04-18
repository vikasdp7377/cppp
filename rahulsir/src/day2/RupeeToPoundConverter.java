package day2;

public class RupeeToPoundConverter implements CurrencyCoverter {

	@Override
	public float doConverter(float amountInRupees)  {
		float amountInPound=amountInRupees/pound_to_ruppe;
		return amountInPound;
	}

	
}
