import java.time.LocalDate;

public class Loan {
    private int loanId;
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private boolean isReturned;

    public Loan(int loanId, Book book, Member member, LocalDate loanDate, LocalDate dueDate) {
        this.loanId = loanId;
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.isReturned = false;
    }

    public int getLoanId() {
        return loanId;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void returnBook() {
        this.isReturned = true;
        book.setAvailable(true);
    }

    public void displayLoanStatus() {
        System.out.println(
            "Loan ID: " + loanId
            + ", Book: " + book.getTitle()
            + ", Member: " + member.getName()
            + ", Due: " + dueDate
            + ", Returned: " + isReturned
        );
    }
}
