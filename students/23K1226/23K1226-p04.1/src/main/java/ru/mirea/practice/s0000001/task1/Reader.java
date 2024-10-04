package ru.mirea.practice.s0000001.task1;

class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книг.");
    }

    public void takeBook(String... titles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : titles) {
            System.out.print(title + " ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книг.");
    }

    public void returnBook(String... titles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : titles) {
            System.out.print(title + " ");
        }
        System.out.println();
    }


    public String getFullName() {
        return fullName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }
}
