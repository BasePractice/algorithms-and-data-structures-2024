package ru.mirea.practice.s0000001;

class StudentList {

    private Student head;
    private Student tail;

    public StudentList() {
        head = null;
        tail = null;
    }

    public void addStudent(Student student) {
        if (head == null) {
            head = student;
            tail = student;
        } else {
            tail.next = student;
            student.prev = tail;
            tail = student;
        }
    }

    public void removeStudent(String name) {
        Student current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            Student current = head;
            while (current != null) {
                current.displayAttributes();
                current = current.next;
            }
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
