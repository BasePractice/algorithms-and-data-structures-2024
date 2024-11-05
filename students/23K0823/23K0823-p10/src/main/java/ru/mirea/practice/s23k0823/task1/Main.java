package ru.mirea.practice.s23k0823.task1;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Иван", "Иванов", "Информатика", 2, "А");
        students[1] = new Student("Анастасия", "Петрова", "Математика", 3, "Б");
        students[2] = new Student("Екатерина", "Смирнова", "Биология", 1, "В");
        students[3] = new Student("Дмитрий", "Кузнецов", "Физика", 4, "Г");
        students[4] = new Student("Светлана", "Лебедева", "Химия", 5, "Д");

        for (Student student : students) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Фамилия: " + student.getSurname());
            System.out.println("Специальность: " + student.getSpecialty());
            System.out.println("Курс: " + student.getCourse());
            System.out.println("Группа: " + student.getGroup());
            System.out.println();
        }
    }
}
