package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Даниил");
        student.setSurname("Абсулов");
        student.setSpeciality("Информатика и вычислительная техника");
        student.setCource(2);
        student.setGroup("КВБО-01-23");

        System.out.println("Студент:\nИмя: "
                            + student.getName()
                            + "\nФамилия: "
                            + student.getSurname()
                            + "\nСпециальность: "
                            + student.getSpeciality()
                            + "\nКурс: "
                            + student.getCource()
                            + "\nГруппа: "
                            + student.getGroup());
    }
}
