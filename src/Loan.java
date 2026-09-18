import java.time.LocalDate;

public class Loan {

    final private Book book;
    final private Member member;
    final private LocalDate borrowedDate;

    public Loan(Book book, Member member, LocalDate borrowedDate) {
        this.book = book;
        this.member = member;
        this.borrowedDate = borrowedDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public boolean isOverdue() {
        LocalDate today = LocalDate.now();
        return today.isAfter(getDueDate());
    }

    public String toString() {
        return String.format("""
                %s
                %s
                Afleveringsfrist: %s
                """, book, member, getDueDate());
    }
}
