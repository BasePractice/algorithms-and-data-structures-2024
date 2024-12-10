package mirea.lab17;

public abstract class Prac17p2 {
    public static void main(String[] args) {
        List<Student> students = new List<Student>();
        students.add(new Student("Egor Sidorov", "RTU Mirea", "KABO-01-23"));
        students.add(new Student("Not Egor Sidorov", "Not RTU Mirea", "1111"));
        students.add(new Student("Hihihi huhuhu", "School 3", "9B"));
        students.pr();
        System.out.println(students.isEmpty());
        students.remove();
        students.pr();
        students.clr();
        System.out.println(students.isEmpty());
    }
}
