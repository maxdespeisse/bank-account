package mde.bankaccount;

import java.math.BigDecimal;

public class BankAccount {

	BigDecimal balance = BigDecimal.ZERO;

	public BigDecimal getBalance() {
		return this.balance;
	}

	public BankAccount(final BigDecimal initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(final BigDecimal amount) {
		this.balance = this.balance.subtract(amount);
	}

	public void deposit(final BigDecimal amount) {
		this.balance = this.balance.add(amount);
	}

}
