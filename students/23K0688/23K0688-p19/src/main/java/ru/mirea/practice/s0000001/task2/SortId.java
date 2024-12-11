package ru.mirea.practice.s0000001.task2;

public class SortId {
    public Student[] idsort(Student[] s) {
        Student temp;
        for (int i = 0;i < s.length - 1;i++) {
            if (s[i].compareTo(s[i + 1]) > 0) {
                temp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = temp;
                for (int j = i;j > 1;j--) {
                    if (s[j].compareTo(s[i - 1]) > 0) {
                        temp = s[i - 1];
                        s[i - 1] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
        return s;
    }

    public Student findStudent(Student[] s,String fio) {
        for (int i = 0;i < s.length;i++) {
            if (s[i].getFio().equals(fio)) {
                return s[i];
            }
            if (i == s.length - 1) {
                throw new RuntimeException("Student with name:" + fio + ", is not found");
            }
        }
        return null;
    }

    public void listStudents(Student[] s) {
        for (int i = 0;i < s.length;i++) {
            if (s[i] != null) {
                System.out.println("N" + (i + 1) + "-" + s[i]);
            }
        }
    }
}
