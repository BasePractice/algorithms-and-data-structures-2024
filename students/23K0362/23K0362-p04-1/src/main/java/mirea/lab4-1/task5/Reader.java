package mirea.lab9.task5;


public class Reader {
    private String name;
    private int libraryCard;
    private String faculty;
    private DateBirth dateOfBirth;
    private String number;

    public Reader(String name, int libraryCard, String faculty, DateBirth dateOfBirth, String number) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public DateBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberBook(int countBook) {
        if (countBook == 1 || (countBook > 19) && (countBook % 10 == 1)) {
            return " книгу";
        } else if (countBook < 5 || (countBook > 19) && (countBook % 10 < 5)) {
            return " книги";
        } else {
            return " книг";
        }
    }

    public void takeBook(int countBook) {
        if (countBook > 0) {
            System.out.println(this.name + " взял " + countBook + getNumberBook(countBook));
        } else if (countBook == 0) {
            System.out.println(this.name + " не взял книг");
        } else  {
            returnBook(Math.abs(countBook));
        }
    }

    public void takeBook(String... book) {
        StringBuilder allNameBooks = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            allNameBooks.append(book[i]);
            if (i != book.length - 1) {
                allNameBooks.append(", ");
            }
        }
        System.out.println(this.name + " взял " + allNameBooks + getNumberBook(book.length));
    }

    public void takeBook(Book... book) {
        StringBuilder allNameBooks = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            allNameBooks.append(book[i].getNameBook());
            if (i != book.length - 1) {
                allNameBooks.append(", ");
            }
        }
        System.out.println(this.name + " взял " + allNameBooks + getNumberBook(book.length));
    }

    public void returnBook(int countBook) {
        if (countBook > 0) {
            System.out.println(this.name + " отдал " + countBook + getNumberBook(countBook));
        } else if (countBook == 0) {
            System.out.println(this.name + " не отдал книг");
        } else  {
            takeBook(Math.abs(countBook));
        }
    }

    public void returnBook(String... book) {
        StringBuilder allNameBooks = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            allNameBooks.append(book[i]);
            if (i != book.length - 1) {
                allNameBooks.append(", ");
            }
        }
        System.out.println(this.name + " отдал " + allNameBooks + getNumberBook(book.length));
    }

    public void returnBook(Book... book) {
        StringBuilder allNameBooks = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            allNameBooks.append(book[i].getNameBook());
            if (i != book.length - 1) {
                allNameBooks.append(", ");
            }
        }
        System.out.println(this.name + " отдал " + allNameBooks + getNumberBook(book.length));
    }

    @Override
    public String toString() {
        return "Reader{" + "name='" + name + '\'' + ", libraryCard=" + libraryCard + ", faculty='" + faculty + '\''
                + ", dateOfBirth=" + dateOfBirth + ", number='" + number + '\'' + '}';
    }
}
