package ru.mirea.practice.s23k0350;

public class Student {
    String name;
    String lname;
    String spec;
    char crs;
    String group;

    public Student(String name, String lname, String spec, char crs, String group) {
        this.name = name;
        this.lname = lname;
        this.spec = spec;
        this.crs = crs;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getSpec() {
        return spec;
    }

    public char getCrs() {
        return crs;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setCrs(char crs) {
        this.crs = crs;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        return "-Ваш студент-\nИмя:\n"
                +
                getName()
                + "\n"
                + "Фамилия:\n"
                + getLname()
                + "\n"
                + "Специальность:\n"
                + getSpec()
                + "\n"
                + "Курс:\n"
                + getCrs()
                + "\n"
                + "Группа:\n"
                + getGroup();
    }
}
