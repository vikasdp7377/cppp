package util;

import entity.Account;
import entity.CurrentAccount;
import entity.SavingAccount;

public class BankManager {

	public static long accNo;
	static {
		accNo = System.currentTimeMillis() % 1000000;
	}

	public static Account openSavingAccount() {
		SavingAccount account = new SavingAccount();
		account.setId(10000000 + ++accNo);

		return account;
	}

	public static Account openCurrentAccount() {
		CurrentAccount account = new CurrentAccount();
		account.setId(20000000 + ++accNo);

		return account;
	}

}
