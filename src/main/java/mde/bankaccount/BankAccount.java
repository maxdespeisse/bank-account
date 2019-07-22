package mde.bankaccount;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	BigDecimal balance = BigDecimal.ZERO;
	
	final List<Operation> operations = new ArrayList<Operation>();
	
	final StatementPrinter statementPrinter;

	public BankAccount(final StatementPrinter statementPrinter) {
		this.statementPrinter = statementPrinter;
	}
	
	public void withdraw(final BigDecimal amount) {
		this.balance = this.balance.subtract(amount);

		recordOperation(OperationType.WITHDRAWAL, amount);
	}

	public void deposit(final BigDecimal amount) {
		this.balance = this.balance.add(amount);
		
		recordOperation(OperationType.DEPOSIT, amount);
	}
	
	public BigDecimal getBalance() {
		return this.balance;
	}
	
	public void printStatement() {
		statementPrinter.print(this.operations);
	}
	
	private void recordOperation(final OperationType operationType, final BigDecimal amount) {
		final Operation withdrawal = new Operation(operationType, LocalDateTime.now(), amount, this.balance);
		this.operations.add(withdrawal);
	}

}
