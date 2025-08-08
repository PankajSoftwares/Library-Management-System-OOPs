import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Register Member");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. List Books");
            System.out.println("7. List Members");
            System.out.println("8. List Loans");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                }
                case 2 -> {
                    System.out.print("Enter book ID to remove: ");
                    int bookId = sc.nextInt();
                    library.removeBook(bookId);
                }
                case 3 -> {
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter contact info: ");
                    String contact = sc.nextLine();
                    library.registerMember(name, contact);
                }
                case 4 -> {
                    System.out.print("Enter book ID to borrow: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter member ID: ");
                    int memberId = sc.nextInt();
                    library.borrowBook(bookId, memberId);
                }
                case 5 -> {
                    System.out.print("Enter loan ID to return: ");
                    int loanId = sc.nextInt();
                    library.returnBook(loanId);
                }
                case 6 -> library.listBooks();
                case 7 -> library.listMembers();
                case 8 -> library.listLoans();
                case 9 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
