import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
  private Borrower borrower;
  private Book book;

  @Before
  public void setUp() {
    borrower = new Borrower();
    book = new Book("War and Peace", "Leo Tolstoy", "Historical Novel");
  }

  @Test
  public void collectionStartsOffEmpty() {
    assertEquals(0, borrower.collectionCount());
  }

  @Test
  public void canBorrowBook() {
    borrower.borrowBook(book);
    assertEquals(1, borrower.collectionCount());
  }
}
