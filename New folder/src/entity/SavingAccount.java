package entity;

import exception.InsufficieantFundException;

public final class SavingAccount extends Account implements Profitable {

	private static final double MIN_BAl = 6000;
	private static float rate=0.05f;
	public SavingAccount() {
		balance = MIN_BAl;
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+"₹ Deposited");
	}

	@Override
	public void withdraw(double amount) throws InsufficieantFundException {
		if(balance-amount<MIN_BAl)
			throw new InsufficieantFundException("minimum 5000 required on account");
		balance-=amount;
		System.out.println(amount+"₹ Deposited");
		
	}

	@Override
	public void addInterest(int year) {
		balance = (balance*rate*year)/100;
		
	}

}
