package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public void editBook(String isbn, Book updatedBook) {
        if (books.containsKey(isbn)) {
            books.put(isbn, updatedBook);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void listBooks(){
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void findBook(String isbn){
        if (books.containsKey(isbn)) {
            System.out.println(books.get(isbn));
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

}
