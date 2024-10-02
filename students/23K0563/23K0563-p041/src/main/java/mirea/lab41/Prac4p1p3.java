package mirea.lab41;

public abstract class Prac4p1p3 {
    public static void main(String[] args) {
        Person created = new Person("Егор Сидоров",18);
        Person def = new Person();
        created.move();
        created.talk();
        def.move();
        def.talk();
    }
}
