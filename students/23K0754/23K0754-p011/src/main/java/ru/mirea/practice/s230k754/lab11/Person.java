package ru.mirea.practice.s230k754.lab11;

import java.util.Date;


public class Person {
    private String name;
    private Date startTask;
    private Date endTask;

    public Person(String name) {
        this.name = name;
    }

    public void setStartTask() {
        this.startTask = new Date();
    }

    public String getStartTask() {
        return startTask.toString();
    }

    public void setEndTask() {
        this.endTask = new Date();
    }

    public String getEndTask() {
        return endTask.toString();
    }

    public String getName() {
        return name;
    }


}
