package ru.mirea.practice.s23k0690;

public class Task1 {
    private String firstName;
    private String lastName;
    private String major;
    private String year;
    private String studyGroup;

    Task1(String firstName, String lastName, String major, String enrollmentYear, String studyGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = enrollmentYear;
        this.studyGroup = studyGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public String getEnrollmentYear() {
        return year;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void aetLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setEnrollmentYear(String enrollmentYear) {
        this.year = enrollmentYear;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }
}
