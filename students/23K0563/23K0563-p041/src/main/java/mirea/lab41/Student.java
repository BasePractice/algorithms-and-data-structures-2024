package mirea.lab41;

public class Student extends Learner {
    private String university;
    private String group;
    private String major;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String fullname, int age, String email, String university, String group, String major) {
        super(fullname, age, email);
        this.university = university;
        this.group = group;
        this.major = major;
    }
}
