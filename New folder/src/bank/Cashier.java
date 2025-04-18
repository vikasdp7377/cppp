package bank;

import entity.Account;
import entity.SavingAccount;
import util.BankManager;

public class Cashier {

	public static void main(String[] args) {
		
		System.out.println("💱🏦-------Welcome to Bank------🏦💱");
		Account jack = BankManager.openSavingAccount();
		System.out.println(jack);
		
		jack.deposit(8000);
		System.out.println(jack);
		try
		{
		jack.withdraw(10000);
		System.out.println(jack);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		Account jill = BankManager.openCurrentAccount();
		System.out.println(jill);
		
		jill.deposit(3000);
		jill.withdraw(5000);
		System.out.println(jill);
		jill.deposit(10000);
		System.out.println(jill);
		
		jack.transfer(5000, jill);
		System.out.println(jill);
		System.out.println(jill);
		jill.transfer(10000, jack);
		System.out.println(jill);
		System.out.println(jack);
		try
		{
			jack.transfer(5000, jack);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		 System.out.println(jack);
		 ((SavingAccount)jack).addInterest(1);
		 System.out.println(jack);
	}
}
