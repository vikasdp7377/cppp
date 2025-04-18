package entity;

import exception.InsufficieantFundException;

public final class CurrentAccount extends Account {

	
	
	public CurrentAccount() {
		
	}

	@Override
	public void deposit(double amount) {
		if(balance<0)
		{
			amount = amount*0.9;
		}
		balance+=amount;
		System.out.println(amount+"₹ Deposited");
	}

	@Override
	public void withdraw(double amount) throws InsufficieantFundException {
		
		balance-=amount;
		System.out.println(amount+"₹ Deposited");
	}


}
