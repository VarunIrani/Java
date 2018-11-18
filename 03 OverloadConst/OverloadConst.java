import static java.lang.System.*;

class Book {
  int pages;
  String name, author;

  Book() {
    name = "Harry Potter and the Prisoner of Azkaban";
    author = "J.K. Rowling";
    pages = 317;
  }

  Book(String name, String author, int pages) {
    this.name = name;
    this.author = author;
    this.pages = pages;
  }

  void putData() {
    out.printf(" %s\n Written By: %s\n Number of Pages: %s\n", name, author, pages);
  }
}

class OverloadConst {
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 607);
    out.println("BOOK 1");
    b1.putData();
    out.println("BOOK 2");
    b2.putData();
  }
}