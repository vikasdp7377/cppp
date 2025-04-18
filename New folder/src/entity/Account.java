package entity;

import exception.IllegalAccountException;
import exception.InsufficieantFundException;

public abstract class Account {

	long id;
	protected double balance;

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount) throws InsufficieantFundException;

	public void transfer(double amount, Account that) throws IllegalAccountException {
		if (this == that) {
			throw new IllegalAccountException("Both account are  same ");
		}
		this.withdraw(amount);
		that.deposit(amount);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	
}
