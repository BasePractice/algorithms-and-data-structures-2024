package ru.mirea.practice.s0000001.task1;

public class Main {
    private Student[] students;

    public Main() {
        // Инициализация студентов и добавление их в массив
        students = new Student[5];
        students[0] = new Schoolboy("Ivan", 15, "Elementary School #1");
        students[1] = new UniversityStudent("Maria", 20, "State University");
        students[2] = new Schoolboy("Anna", 14, "High School #2");
        students[3] = new UniversityStudent("Peter", 22, "Technical University");
        students[4] = new Schoolboy("Sasha", 16, "Secondary School #3");
    }

    public void displayInfo() {
        // Дисплей информации о студентах
        System.out.println("Schoolboys:");
        for (Student student : students) {
            if (student instanceof Schoolboy) {
                student.showInfo();
            }
        }

        System.out.println("University Students:");
        for (Student student : students) {
            if (student instanceof UniversityStudent) {
                student.showInfo();
            }
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.displayInfo();
    }
}
   