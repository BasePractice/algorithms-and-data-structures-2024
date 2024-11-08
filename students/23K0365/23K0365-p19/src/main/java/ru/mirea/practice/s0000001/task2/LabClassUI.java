package ru.mirea.practice.s0000001.task2;

public class LabClassUI {
    private Student[] idNumber;

    public void setArray(Student... a) throws EmptyStringException {
        this.idNumber = new Student[a.length];
        for (int i = 0; i < a.length; i++) {
            idNumber[i] = a[i];
            if (a[i].getFirstName().isEmpty() || a[i].getSecondName().isEmpty()) {
                throw new EmptyStringException("ERROR!" + " Student number "
                        + i + 1 + " have got uncompleted name");
            }
        }
    }

    public static Student[] sortByGPa(Student[] arr, int low, int high) {
        if (arr.length == 0 | low >= high) {
            return arr;
        }
        int mid = low + (high - low) / 2;
        Student border = arr[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (border.compareStudents(arr[i])) {
                i++;
            }
            while (arr[j].compareStudents(border)) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < i) {
            sortByGPa(arr, low, j);
        }
        if (high > i) {
            sortByGPa(arr, i, high);
        }
        return arr;
    }

    public Student findByName(String name) throws StudentNotFoundException {
        for (Student student : this.idNumber) {
            if (student.getFirstName().equals(name) || student.getSecondName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name " + name + " doesn't exist");
    }

    public Student findByGpa(int gpa) throws StudentNotFoundException {
        for (Student student : this.idNumber) {
            if (student.getGPa() == gpa) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with this GPA: " + gpa + ", doesn't exist");
    }

    public void outArray() {
        for (Student x : this.idNumber) {
            System.out.println(x);
        }
    }

    public Student[] getIDnumber() {
        return idNumber;
    }

    public void setIDnumber(Student[] idNumber) {
        this.idNumber = idNumber;
    }
}
