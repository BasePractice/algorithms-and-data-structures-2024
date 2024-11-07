package mirea.lab9.task5;

abstract class Tester {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Игорь И.И.", 12345678, "ИИИ", new DateBirth(30, 7, 2019), "89270010101");
        System.out.println(reader1.toString());
        Book warAndPeaceBook = new Book("War and Peace", "Tolstoy");
        Book napoleonBook = new Book("Napoleon", "Noname");
        Book ww2Book = new Book("WWII", "Stalin");
        Book stalinBook = new Book("Stalin", "Stalin");
        reader1.takeBook(5);
        reader1.takeBook(1);
        reader1.takeBook(212);
        reader1.takeBook(0);
        reader1.takeBook(-1234567);
        reader1.takeBook("War and Peace", "Napoleon", "WWII", "Stalin");
        reader1.takeBook(warAndPeaceBook, napoleonBook, ww2Book, stalinBook);
        reader1.returnBook(5);
        reader1.returnBook(1);
        reader1.returnBook(212);
        reader1.returnBook(0);
        reader1.returnBook(-1234567);
        reader1.returnBook("War and Peace", "Napoleon", "WWII", "Stalin");
        reader1.returnBook(warAndPeaceBook, napoleonBook, ww2Book, stalinBook);
    }
}
