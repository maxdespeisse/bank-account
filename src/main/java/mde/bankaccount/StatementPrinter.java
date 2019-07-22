package mde.bankaccount;

import java.util.List;

public interface StatementPrinter {

	public void print(final List<Operation> operations);

}
