package ru.mirea.practice.s0000002.practice41.student;

class Student extends Undergraduateclass {
    public String groups;
    public Integer course;

    public Student(int age, String gender, String name, String groups, Integer course) {
        super(age, gender, name, 4.5);
        this.groups = groups;
        this.course = course;
    }

    public void setGroups(String newGroupe) {
        this.groups = newGroupe;
    }

    public void setCourse(Integer newCourse) {
        this.course = newCourse;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{"
                + "groups='" + groups + '\''
                + ", course='" + course + '\''
                + '}';
    }
}
