package day2;

public class OuterMain {
	
	public static void main(String args[])
	{
		Outer.Inner i = new Outer.Inner();
		i.print();
		
		Outer out = new Outer();
		Outer.NestedClass on = new Outer().new NestedClass();
		out.print();
		on.print();
		
		//Converting 5000 euros to INR using currencyConverter
		//anonymous class
		System.out.println("Converting 500 euros to INR using currencyConverter");
		CurrencyCoverter cc = new CurrencyCoverter() {
			
			@Override
			public float doConverter(float amount) {
				// TODO Auto-generated method stub
				float amountInRupees = amount*90.17f;
				
				return amountInRupees;
			}
		};
		float INR = cc.doConverter(5000);
		System.out.println(INR);
	}

}
