package ru.mirea.practice.s0000001.task1;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5.5), new Rectangle(2.0, 3.0), new Square(4.0)};
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
        }

        Phone phone1 = new Phone("1234567890", "Nokia", 150.0);
        Phone phone2 = new Phone("0987654321", "Samsung");
        Phone phone3 = new Phone(); // Конструктор по умолчанию
        phone1.receiveCall("Иван");
        phone2.receiveCall("Петр");
        phone3.receiveCall("Сергей");
        phone1.sendMessage("111", "222", "333");

        Person person1 = new Person();
        Person person2 = new Person();
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();

        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        matrix1.add(matrix2);
        matrix1.multiplyByScalar(2);
        matrix1.print();

        Reader reader1 = new Reader("Петров В. В.", "001", "Факультет", "01.01.1990", "89001234567");
        reader1.takeBook(3);
        reader1.takeBook("Книга1", "Книга2");
        reader1.returnBook(2);
        reader1.returnBook("Книга3", "Книга4");

        Employer[] employers = {
            new Employer("Иван", "Иванов", 50000),
            new Manager("Петр", "Петров", 60000, 10000)
        };
        for (Employer emp : employers) {
            System.out.println(emp.getIncome());
        }
    }
}
