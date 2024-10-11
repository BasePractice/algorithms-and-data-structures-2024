package ru.mirea.practice.s23L0908.Task1;


public class Student {
    private String FirstName;
    private String LastName;
    private String Speciality;
    private int Course;
    private String Group;
    private int GPA;

    public Student(String FirstName, String LastName, String Speciality, int Course, String Group, int GPA) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Speciality = Speciality;
        this.Course = Course;
        this.Group = Group;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return "Student{ " +
            "First name :" + FirstName +
            ", Last name: " + LastName +
            ", Speciality: " + Speciality +
            ", Course: " + Course +
            ", Group: " + Group +
            ", GPA = " + GPA + "}";
    }
}
