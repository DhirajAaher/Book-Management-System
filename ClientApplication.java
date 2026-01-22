package BookManagementSystem;

import java.util.Scanner;

public class ClientApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookService a = new BookServiceImpl();

        int ch;

        do {
            System.out.println("\n======= Book Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Count of Books");
            System.out.println("6.Update Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter BookId, BookName, AuthorName, Price");
                    int bookId = sc.nextInt();
                    String bookName = sc.next();
                    String author = sc.next();
                    double price = sc.nextDouble();

                    Book book = new Book(bookId, bookName, author, price);
                    a.addBook(book);
                    break;

                case 2:
                    a.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Enter BookId to search: ");
                    int id = sc.nextInt();
                    a.searchBook(id);
                    break;

                case 4:
                    System.out.print("Enter BookId to delete: ");
                    int deleteId = sc.nextInt();
                    a.deleteBook(deleteId);
                    break;

                case 5:
                    a.countBook();
                    break;
                    
                case 6:
                	System.out.println("Enter id to update book:");
                	int updateId=sc.nextInt();
                	a.updateBook(updateId);
                	break;
                case 0:
                    System.out.println("Exiting Book Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    
            }

        } while (ch != 0);

        sc.close();
    }
}
