import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
  private Book book;

  @Before
  public void setUp() {
    book = new Book("War and Peace", "Leo Tolstoy", "Historical Novel");
  }

  @Test
  public void hasTitle() {
    assertEquals("War and Peace", book.getTitle());
  }

  @Test
  public void getAuthor() {
    assertEquals("Leo Tolstoy", book.getAuthor());
  }

  @Test
  public void getGenre() {
    assertEquals("Historical Novel", book.getGenre());
  }
}
