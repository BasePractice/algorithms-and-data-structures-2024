package ru.mirea.practice.s0000001.prog1;

import java.time.LocalDateTime;

public class Developer {
    public String name;
    public String group;
    public LocalDateTime startDate;

    Developer(String name, String group, LocalDateTime startDate) {
        this.name = name;
        this.group = group;
        this.startDate = startDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }


    @Override
    public String toString() {
        return "Developer{"
                + "name='" + name + '\''
                + ", group='" + group + '\''
                + ", startDate=" + startDate
                + '}';
    }
}
