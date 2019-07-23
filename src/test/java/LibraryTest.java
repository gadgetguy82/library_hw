import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
  private Library library;
  private Book book;

  @Before
  public void setUp() {
    library = new Library(10);
    book = new Book("War and Peace", "Leo Tolstoy", "Historical Novel");
  }

  @Test
  public void getNumberOfBooksInCollection() {
    assertEquals(0, library.bookCount());
  }

  @Test
  public void canAddBook() {
    library.addBook(book);
    assertEquals(1, library.bookCount());
  }

  @Test
  public void hasCapacity() {
    assertEquals(10, library.getCapacity());
  }

  @Test
  public void checkStockBeforeAddingBook() {
    library.checkStockSpace(book);
    assertEquals(1, library.bookCount());
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    library.checkStockSpace(book);
    assertEquals(10, library.bookCount());
  }

  @Test
  public void canRemoveBook() {
    library.addBook(book);
    assertEquals(1, library.bookCount());
    library.removeBook(book);
    assertEquals(0, library.bookCount());
  }
}
