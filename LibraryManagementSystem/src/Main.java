import LibraryManagementSystem.Book;
import LibraryManagementSystem.ConsoleBookInput;
import LibraryManagementSystem.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        ConsoleBookInput bookInput = new ConsoleBookInput();
        Book book = bookInput.readBook();
        library.addBook(book);
        System.out.println("Listing all book in library");
        library.listBooks();

    }
}