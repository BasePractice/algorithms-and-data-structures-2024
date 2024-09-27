package ru.mirea.practice.s0000001;


public class Person {
    private final String fullName;
    private final int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "Иванова Мария";
        this.age = 19;
    }

    public void move() {
        System.out.println(fullName + " говорит: \"Я направляюсь к тебе\"");
    }

    public void talk() {
        System.out.println(fullName + " говорит: \"Привет! Меня зовут " + fullName + ", мне " + age + " "+ writeAge(age)+".\"");
    }

    public static void main(String[] args){
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Петров Александр", 21);
        person2.move();
        person2.talk();
    }
    public static String writeAge(int age){
        if (age % 10 == 1 && age % 100 != 11) {
            return "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && (age % 100 < 10 || age % 100 >= 20)) {
            return "года";
        } else {
            return "лет";
        }
    }

}