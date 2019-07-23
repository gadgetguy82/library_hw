import java.util.ArrayList;

public class Library {
  private ArrayList<Book> collection;
  private int capacity;

  public Library(int capacity) {
    this.collection = new ArrayList<Book>();
    this.capacity = capacity;
  }

  public int bookCount() {
    return this.collection.size();
  }

  public void addBook(Book book) {
    this.collection.add(book);
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void checkStockSpace(Book book) {
    if (bookCount() < this.capacity) {
      addBook(book);
    }
  }
}
