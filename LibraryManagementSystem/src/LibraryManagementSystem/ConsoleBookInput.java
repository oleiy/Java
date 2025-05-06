package LibraryManagementSystem;

import java.util.Scanner;

public class ConsoleBookInput implements BookInput{

    Scanner scanner = new Scanner(System.in);

    @Override
    public Book readBook() {
        System.out.println("Enter book ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        return new Book(isbn, author, title);
    }
}
