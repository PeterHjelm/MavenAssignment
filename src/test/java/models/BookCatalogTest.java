package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
	BookCatalog bc = new BookCatalog();
	bc.addBook(book1);

	assertSame(book1, bc.getBookArray()[0]);
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		BookCatalog bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);

		bc.addBook(book1);
		bc.findBook("Learning Java");
		assertSame(book1, bc.getBookArray()[0]);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
			Book book1 = new Book(1, "Learning Java", "", "", "", 0);
			bc.addBook(book1);
			try {
			bc.findBook("LearniNG JaVA");
			assertEquals(book1, bc.getBookArray()[0]);
			}
			catch (BookNotFoundException e) {
				fail ("Book not found Exception should not have been thrown");
			}
    }

	//G
	@Test
	public void testFindBookWithExtraSpaces()  {
	Book book1 = new Book(1, "Learning Java", "", "", "", 0);
	bc.addBook(book1);
        try {
            bc.findBook(" Learning Java ");
			assertEquals(book1, bc.getBookArray()[0]);
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() {
//	Book book1 = new Book(1, "Learning Java", "", "", "", 0);
//	bc.addBook(book1);
//
//	Exception exception = (BookNotFoundException.class, () -> {
//		bc.findBook("Learning to Rule the programming world");
//	});
//
//	assertEquals();
//	assertEquals("Book not found", exception.getMessage());
//        try {
//            bc.findBook("Learning to Rule in coding");
//        } catch (BookNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals(book1, bc.getBookArray()[0]);
//
//	if (book1 != bc.getBookArray()[0]) throw new BookNotFoundException();

	}

}
