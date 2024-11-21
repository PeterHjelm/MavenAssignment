package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
	Book bookTest = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);
	assertEquals(12983, bookTest.getID());
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book bookTest = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);
		assertNotEquals(14483, bookTest.getID());
	}
	}


