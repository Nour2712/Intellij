import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    //4. Tilføj addBook() og addMember() til Library klassen:
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }


    //5. Tilføj getters til loans, books og members i Library-klassen.
    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    //6. print en liste over alle bøger i bibioteket - Tilføj metoden public void printBooks():
    public void printBooks() {
        for (Book book : books) {
            IO.println(book);
        }
    }

    //8. printe en liste over alle medlemmer i bibioteket. Tilføj metoden public void printMembers():
    public void printMembers() {
        for (Member member : members) {
            IO.println(member);
        }
    }

    //Opgave 8
    public Book getBook(int bookId) {
        for (Book book : books) {
            if (bookId == book.getId()) {
                return book;
            }
        }
        return null;
    }


    public Member getMember(int memberId) {
        for (Member member : members) {
            if (memberId == member.getMemberId()) {
                return member;
            }
        }
        return null;
    }

    public boolean loanBook(int bookId, int memberId) {
        Book book = getBook(bookId);
        Member member = getMember(memberId);

        if (member == null) {
            // IO.println("Der findes ikke noget medlem med memberId: " + memberId);
            return false;
        }

        if (book == null) {
            // IO.println("Der findes ikke nogen bog med følgende id: " + bookId);
            return false;
        }

        return loanBook(book, member); //Her oprettes et låne objekt
    }

    private boolean loanBook(Book book, Member member) {
        for (Loan loan : loans) {
            if (loan.getBook() == book) {
                IO.println("Bogen er allerede udlånt");
                return false; //bogen er allerede udlånt
            }
        }

        LocalDate borrowedDate = LocalDate.now();
        Loan loan = new Loan(book, member, borrowedDate);
        loans.add(loan);

        return true;
    }

    //Ogave 8 del 7
    public boolean returnBook(int bookId) {
        Book book = getBook(bookId);
        if (book == null) {
            return false;
        }

        for (Loan loan : loans) {
            if (loan.getBook().getId() == bookId) {
                loans.remove(loan);
                return true;
            }
        }
        return false;
    }

    //Opgave 8 del 9: 9. . Der skal kunne ses hvilke bøger et medlem har lånt.
    public ArrayList<Loan> findLoansByMemberId(int memberId) {
        ArrayList<Loan> memberLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.getMember().getMemberId() == memberId) {
                memberLoans.add(loan);
            }
        }
        return memberLoans;

    }
}


