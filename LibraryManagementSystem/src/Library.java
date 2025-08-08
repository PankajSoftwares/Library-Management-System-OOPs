import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    private int bookCounter = 1;
    private int memberCounter = 1;
    private int loanCounter = 1;

    // Add a book
    public void addBook(String title, String author) {
        Book book = new Book(bookCounter++, title, author);
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Remove a book by bookId
    public void removeBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
        System.out.println("Book removed successfully.");
    }

    // Register a member
    public void registerMember(String name, String contact) {
        Member member = new Member(memberCounter++, name, contact);
        members.add(member);
        System.out.println("Member registered successfully.");
    }

    // Borrow Book
    public void borrowBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);
        if (book != null && member != null && book.isAvailable()) {
            book.setAvailable(false);
            Loan loan = new Loan(loanCounter++, book, member, LocalDate.now(), LocalDate.now().plusWeeks(2));
            loans.add(loan);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available or member not found.");
        }
    }

    // Return Book
    public void returnBook(int loanId) {
        for (Loan loan : loans) {
            if (loan.getLoanId() == loanId && !loan.isReturned()) {
                loan.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Loan record not found or book already returned.");
    }

    // Find helper methods
    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) return b;
        }
        return null;
    }

    private Member findMember(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) return m;
        }
        return null;
    }

    // List all books
    public void listBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    // List all members
    public void listMembers() {
        System.out.println("Library members:");
        for (Member member : members) {
            member.displayInfo();
        }
    }

    // List all loans
    public void listLoans() {
        System.out.println("Current loans:");
        for (Loan loan : loans) {
            loan.displayLoanStatus();
        }
    }
}
