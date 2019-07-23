import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
  private Borrower borrower;
  private Book book;
  private Library library;

  @Before
  public void setUp() {
    borrower = new Borrower();
    book = new Book("War and Peace", "Leo Tolstoy", "Historical Novel");
    library = new Library(10);
  }

  @Test
  public void collectionStartsOffEmpty() {
    assertEquals(0, borrower.collectionCount());
  }

  @Test
  public void canBorrowBookFromLibrary() {
    borrower.borrowBook(library, book);
    assertEquals(1, borrower.collectionCount());
    assertEquals(0, library.bookCount());
  }
}
