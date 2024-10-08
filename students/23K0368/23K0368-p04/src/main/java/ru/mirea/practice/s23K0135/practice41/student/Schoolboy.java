package ru.mirea.practice.s23K0135.practice41.student;

class Schoolboy extends Undergraduateclass {
    public String classes;
    public String classTecher;

    public Schoolboy(int age, String gender, String name, String classes, String techer) {
        super(age, gender, name, 4.5);
        this.classes = classes;
        this.classTecher = techer;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

    public void setClassTecher(String newClasstecher) {
        this.classTecher = newClasstecher;
    }

    @Override
    public String toString() {
        return super.toString() + "Schoolboy{"
                + "classes='" + classes + '\''
                + ", class_techer='" + classTecher + '\''
                + '}';
    }
}
