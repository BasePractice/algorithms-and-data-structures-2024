package mirea.lab17;

public class Student {
    private String name;
    private String school;
    private String group;

    public Student(String name, String school, String group) {
        this.name = name;
        this.school = school;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='"
                + name
                + '\''
                + ", school='"
                + school
                + '\''
                + ", group='"
                + group
                + '\''
                + '}';
    }
}
