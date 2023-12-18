// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Book {
  protected String title;
  protected String author;
  protected int pages;
  protected int year;

  public Book(String title, String author, int pages, int year) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    this.year = year;
  }

  public void diplayInfo(String title, String author, int pages, int year) {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Pages: " + pages);
    System.out.println("Year: " + year);
  }
}

class FictionBook extends Book {
  private String genre;

  public FictionBook(String title, String author, int pages, int year, String genre) {
    super(title, author, pages, year);
    this.genre = genre;
  }
}

class NonFictionBook extends Book {
  private String topic;

  public NonFictionBook(String title, String author, int pages, int year, String topic) {
    super(title, author, pages, year);
    this.topic = topic;
  }
}

class Main {
  public static void main(String[] args) {
    FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 218, 1925, "Fantasy");
    NonFictionBook nonFictionBook = new NonFictionBook("To Kill a Mockingbird", "Harper Lee", 281, 1960, "Classic");

    fictionBook.diplayInfo(fictionBook.title, fictionBook.author, fictionBook.pages, fictionBook.year);
    Systems.out.println();
    nonFictionBook.diplayInfo(nonFictionBook.title, nonFictionBook.author, nonFictionBook.pages, nonFictionBook.year);
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}