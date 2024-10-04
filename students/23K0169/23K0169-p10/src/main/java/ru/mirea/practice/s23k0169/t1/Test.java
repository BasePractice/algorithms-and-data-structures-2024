package ru.mirea.practice.s23k0169.t1;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {

        Student student1 = new Student("Иван", "Иванов", "Программная инженерия", 3, "БК-31");
        Student student2 = new Student("Анна", "Петрова", "Информационные технологии", 2, "БК-21");

        System.out.println("Студент 1:");
        System.out.println("Имя: " + student1.getFirstName());
        System.out.println("Фамилия: " + student1.getLastName());
        System.out.println("Специальность: " + student1.getSpecialty());
        System.out.println("Курс: " + student1.getCourse());
        System.out.println("Группа: " + student1.getGroup());

        System.out.println("\nСтудент 2:");
        System.out.println("Имя: " + student2.getFirstName());
        System.out.println("Фамилия: " + student2.getLastName());
        System.out.println("Специальность: " + student2.getSpecialty());
        System.out.println("Курс: " + student2.getCourse());
        System.out.println("Группа: " + student2.getGroup());

        student1.setCourse(4);
        student2.setGroup("БК-22");

        System.out.println("\nОбновленная информация о студентах:");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
