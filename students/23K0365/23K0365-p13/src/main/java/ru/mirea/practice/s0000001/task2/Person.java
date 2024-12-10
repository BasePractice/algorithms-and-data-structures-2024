package ru.mirea.practice.s0000001.task2;

public class Person {
    private String firstName = "";
    private String secondName;
    private String thirdName = "";

    public Person(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public Person(String secondName) {
        this.secondName = secondName;
    }

    public String getBack() {
        if (!firstName.isEmpty()) {
            return secondName + firstName.substring(0,2) + thirdName.substring(0,2);
        } else {
            return "Firstname & thirdname not found";
        }
    }
}
