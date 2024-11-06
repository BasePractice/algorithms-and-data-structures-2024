package ru.mirea.practice.pr2;

public class Writer {
    private String fullName;
    private String contactEmail;
    private char writerGender;

    public Writer(String fullName, String contactEmail, char writerGender) {
        this.fullName = fullName;
        this.contactEmail = contactEmail;
        this.writerGender = writerGender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public char getWriterGender() {
        return writerGender;
    }

    @Override
    public String toString() {
        return "Writer[fullName=" + fullName + ", contactEmail=" + contactEmail + ", writerGender=" + writerGender + "]";
    }
}
