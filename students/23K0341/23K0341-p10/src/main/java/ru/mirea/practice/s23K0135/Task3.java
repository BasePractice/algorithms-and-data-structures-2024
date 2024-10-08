package ru.mirea.practice.s23K0135;

import java.util.Random;

/**
 * Напишите программу, которая объединяет два списка данных о студентах
 * в один отсортированный списках.
 * <br><br>
 * Note: будет использован простейший вариант студента.
 */

public abstract class Task3 {
    public static void main(String[] args) {
        int l1 = 2;
        int l2 = 3;

        SimpleStudent[] list1 = new SimpleStudent[l1];
        SimpleStudent[] list2 = new SimpleStudent[l2];

        list1[0] = new SimpleStudent("Иванов Иван Иванович", new Random().nextDouble() * 2.15 + 2.75);
        list1[1] = new SimpleStudent("Иванова Екатерина Петровна", new Random().nextDouble() * 2.15 + 2.75);

        list2[0] = new SimpleStudent("Петров Петр Валерьевич", new Random().nextDouble() * 2.15 + 2.75);
        list2[1] = new SimpleStudent("Иванов Петр Иванович", new Random().nextDouble() * 2.15 + 2.75);
        list2[2] = new SimpleStudent("Иванов Иван Иванович", new Random().nextDouble() * 2.15 + 2.75);

        SimpleStudent[] finalList = new SimpleStudent[l1 + l2];

        for (int stud = 0; stud < l1 + l2; stud++) {
            if (stud + 1 > l1) {
                finalList[stud] = list2[stud - l2 + 1];
            } else {
                finalList[stud] = list1[stud];
            }
        }

        for (int i = 0; i < l1 + l2; i++) {
            for (int j = i; j < l1 + l2; j++) {
                if (finalList[i].gpa > finalList[j].gpa) {
                    SimpleStudent tmp = finalList[i];
                    finalList[i] = finalList[j];
                    finalList[j] = tmp;
                }
            }
        }

        for (SimpleStudent simpleStudent : finalList) {
            System.out.println(simpleStudent);
        }
    }

    static class SimpleStudent {
        String fullName;
        double gpa;

        SimpleStudent(String fullName, double gpa) {
            this.fullName = fullName;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "{ " + fullName + "; " + gpa + " }";
        }
    }
}
