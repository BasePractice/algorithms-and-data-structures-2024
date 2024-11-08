package ru.mirea.practice.s23k0350.task2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class Stud {
    String name;
    String lname;
    String spec;
    char crs;
    String group;
    GregorianCalendar birth;
    SimpleDateFormat form = new SimpleDateFormat("d/M/yy");

    public Stud(String name, String lname, String spec, char crs, String group, GregorianCalendar birth) {
        this.name = name;
        this.lname = lname;
        this.spec = spec;
        this.crs = crs;
        this.group = group;
        this.birth = birth;
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

    public SimpleDateFormat enabler(String x) {
        if ("long".equals(x)) {
            form = new SimpleDateFormat("День и Месяц: d MMMM, Год:yyyy");
        }
        if ("med".equals(x)) {
            form = new SimpleDateFormat("d MMM, yyyy");
        }
        return form;
    }

    public String toString() {
        return "-Ваш студент-\nИмя: "
                +
                getName()
                + "\nФамилия: "
                + getLname()
                + "\nДата рождения: "
                + form.format(birth.getTime())
                + "\nСпециальность: "
                + getSpec()
                + "\nКурс: "
                + getCrs()
                + "\nГруппа: "
                + getGroup();

    }
}

