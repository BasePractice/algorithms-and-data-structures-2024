package mirea.lab6.p3;

public class Animal implements Nameable {
    private String name;
    private String kind;
    private int age;
    private char gender;

    public Animal(String name, String kind, int age, char gender) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='"
                + name
                + '\''
                + ", kind='"
                + kind
                + '\''
                + ", age="
                + age
                + ", gender="
                + gender
                + '}';
    }
}
