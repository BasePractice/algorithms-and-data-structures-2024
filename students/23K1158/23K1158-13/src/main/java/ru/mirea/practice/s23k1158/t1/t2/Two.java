package ru.mirea.practice.s23k1158.t1.t2;

public final class Two {
    private Two() {

    }

    public static void main(String[] args) {
        Persona person1 = new Persona("Кузьма", "Кузя", "Кузьмич");
        Persona person2 = new Persona("Первый", "Петр", null);
        Persona person3 = new Persona("Сидоров", null, "Сидорович");
        Persona person4 = new Persona("Антонов", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}