public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ConsoleUI consoleUI = new ConsoleUI(library);

    // BOGLISTE:
    Book book1 = new Book("Allan B. Downey", "Think Java", "9781492072508", 1);
    Book book2 = new Book("Rachel Cusk", "Omrids", "9788763851664", 2);
    Book book3 = new Book("Yuval Noah Harari", "Sapiens", "9780062316097", 3);


    // MEDLEMSLISTE
    Member member1 = new Member("Thorkild Hansen", 111);
    Member member2 = new Member("Lise Andersen", 222);


    // Tilføjer bøger og medlemmer til biblioteket:
    library.addMember(member1);
    library.addMember(member2);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);




        consoleUI.run();
    }



}