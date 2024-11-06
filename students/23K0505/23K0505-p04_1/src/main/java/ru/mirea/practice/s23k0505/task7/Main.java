package ru.mirea.practice.s23k0505.task7;

public abstract class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов Иван Иванович", 19, 4.3f);
        Student student2 = new Student("Соколов Петр Петрович", 18, 4.8f);
        Student student3 = new Student("Стрижов Андрей Владимирович", 19, 3.2f);
        Pupil pupil1 = new Pupil("Смирнова Анастасия Сергеевна", 14, 4.5f);
        Pupil pupil2 = new Pupil("Чижиков Василий Ильич", 14, 2.3f);
        Learner[] learners;
        learners = new Learner[]{student1, pupil1, student2, student3, pupil2};

        for (Learner learner : learners) {
            if (learner instanceof Pupil) {
                System.out.println(learner);
            }
        }
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                System.out.println(learner);
            }
        }

        for (Learner learner : learners) {
            learner.study();
        }
    }
}
