package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
	Book bookTest1 = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);
	Book bookTest2 = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);
	assertEquals(bookTest1, bookTest2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book bookTest1 = new Book(12983, "Harry Potter", "J.K Rowling", "1387384648DD", "Magic", 399);
		Book bookTest2 = new Book(12332, "Hairy Brother", "K.J Bowling", "1387384648DD", "Romance", 698);
		assertNotEquals(bookTest1, bookTest2);
	}
	}


