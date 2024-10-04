package mirea.lab10;

public class Student implements Comparable {
    private String name;
    private String surname;
    private String major;
    private int course;
    private String group;
    private int id;
    private int gpa;

    @Override
    public int compareTo(Object o) {
        return this.gpa - ((Student) o).gpa;
    }

    public Student(String name, String surname, String major, int course, String group, int id, int gpa) {
        this.name = name;
        this.surname = surname;
        this.major = major;
        this.course = course;
        this.group = group;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='"
                + name
                + '\''
                + ", surname='"
                + surname
                + '\''
                + ", major='"
                + major
                + ", course='"
                + '\''
                + course
                + '\''
                + ", group='"
                + group + '\''
                + ", id="
                + id
                + ", GPA="
                + gpa + '}';
    }
}
