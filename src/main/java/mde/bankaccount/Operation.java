package mde.bankaccount;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Operation {

	final OperationType type;
	
	final LocalDateTime date;

	final BigDecimal amount;
	
	final BigDecimal balance;

	public Operation(OperationType type, LocalDateTime date, BigDecimal amount, BigDecimal balance) {
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.balance = balance;
	}
	
	public OperationType getType() {
		return type;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}
	
}
