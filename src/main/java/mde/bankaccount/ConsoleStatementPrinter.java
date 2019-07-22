package mde.bankaccount;

import java.util.List;

public class ConsoleStatementPrinter implements StatementPrinter {

	public void print(final List<Operation> operations) {
		operations.stream().forEach(operation -> {
			System.out.format("Operation type: %s, Date: %s, Amount: %s, Balance: %s%n", operation.getType(),
					operation.getDate(), operation.getAmount(),
					operation.getBalance());
		});
	}

}
