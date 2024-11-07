package ru.mirea.practice.s0000001.task7;

public final class StudentTester {

    private StudentTester() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        // Создаем массив учащихся
        Student[] students = new Student[7];

        // Заполняем массив школьниками и студентами
        students[0] = new SchoolStudent("Ярополк", 16, "Школа №57");
        students[1] = new UniversityStudent("Радмила", 20, "Московский Государственный Университет (МГУ)");
        students[2] = new SchoolStudent("Станислава", 14, "Школа №179");
        students[3] = new UniversityStudent("Всеслав", 22, "Московский Физико-Технический Институт (МФТИ)");
        students[4] = new SchoolStudent("Милолика", 17, "Школа №1535");
        students[5] = new UniversityStudent("Ратибор", 21, "Российский Университет Дружбы Народов (РУДН)");
        students[6] = new UniversityStudent("Власта", 19, "Московский Технический Университет Связи и Информатики (МИРЭА)");

        // Выводим школьников
        System.out.println("Школьники:");
        for (Student student : students) {
            if ("Школьник".equals(student.getType())) {
                System.out.println(student);
            }
        }

        // Отдельно выводим студентов
        System.out.println("\nСтуденты:");
        for (Student student : students) {
            if ("Студент".equals(student.getType())) {
                System.out.println(student);
            }
        }
    }
}