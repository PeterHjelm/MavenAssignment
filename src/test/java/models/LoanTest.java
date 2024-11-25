package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer customer = new Customer("Harry Potter", "Peter", "Hjelm",
				"Vallhamravägen 26", "0703326354", "peter.hjelm1@gmail.com",
				12_321, GenderType.MALE);
		Book book = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);

		Loan loan = new Loan(12_321, customer, book);
		LocalDate dueDate = loan.getDueDate();

		assertEquals(dueDate, loan.getDueDate());
	}
   }
