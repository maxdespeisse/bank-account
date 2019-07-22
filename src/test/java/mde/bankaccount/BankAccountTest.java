package mde.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

	@Test
	public void shouldDeposit50EuroIntoBankAccount() {
		BankAccount account = new BankAccount(new ConsoleStatementPrinter());

		account.deposit(BigDecimal.valueOf(50));

		assertEquals(BigDecimal.valueOf(50), account.getBalance());
	}

	@Test
	public void shouldWithdraw50EuroFromBankAccount() {
		BankAccount account = new BankAccount(new ConsoleStatementPrinter());

		account.withdraw(BigDecimal.valueOf(50));

		assertEquals(BigDecimal.valueOf(-50), account.getBalance());
	}

}
