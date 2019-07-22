package mde.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ConsoleStatementPrinterTest {
	
	StatementPrinter statementPrinter = new ConsoleStatementPrinter();

	@Test
	public void shouldPrintOneWithdrawalOperationToConsole() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		LocalDateTime localDateTime = LocalDateTime.of(2000, 10, 10, 10, 10);

		List<Operation> operations = Arrays.asList(new Operation(OperationType.WITHDRAWAL, localDateTime, BigDecimal.valueOf(99), BigDecimal.valueOf(1)));
		statementPrinter.print(operations);

		assertEquals("Operation type: WITHDRAWAL, Date: 2000-10-10T10:10, Amount: 99, Balance: 1\n", outputStream.toString());
	}

	@Test
	public void shouldPrintOneDepositOperationToConsole() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		LocalDateTime localDateTime = LocalDateTime.of(2000, 10, 10, 10, 10);
		
		List<Operation> operations = Arrays.asList(new Operation(OperationType.DEPOSIT, localDateTime, BigDecimal.valueOf(99), BigDecimal.valueOf(1)));
		statementPrinter.print(operations);
		
		assertEquals("Operation type: DEPOSIT, Date: 2000-10-10T10:10, Amount: 99, Balance: 1\n", outputStream.toString());
	}

}
