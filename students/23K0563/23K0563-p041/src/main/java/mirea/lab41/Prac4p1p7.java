package mirea.lab41;

/* Создать суперкласс Учащийся и подклассы Школьник и Студент.
Создать массив объектов суперкласса и заполнить этот массив объектами.
Показать отдельно студентов и школьников */

public abstract class Prac4p1p7 {
    public static void main(String[] args) {
        Learner[] a = new Learner[3];
        a[0] = new Student("Сидоров Егор", 18, "sidorov.e.a@edu.mirea.ru", "RTU MIREA", "KABO-01-23", "Automatics");
        a[1] = new Schoolboy("Ivan Ivanov", 16, "ivanivanov@mail.ru", "School #1363", "9A");
        a[2] = new Schoolboy("Maks Maksbetov", 13, "N/A", "School # 1420", "6B");
        for (Learner i : a) {
            if (i.getClass().getSimpleName() == "Schoolboy") {
                System.out.println("Школьник " + i.toString());
            } else {
                System.out.println("Студент" + i.toString());
            }
        }
    }
}
