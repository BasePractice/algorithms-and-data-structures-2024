package ru.mirea.practice.s0000001;

public final class Main2 {

    private Main2() {}

    public static void main(String[] args) {
        Person person1 = new Employee("Иванов", "Иван", "Иванович");
        Person person2 = new Employee("Петров", "Петр", null);
        Person person3 = new Employee("Сидоров", null, "Сидорович");
        Person person4 = new Employee("Кузнецов", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}
