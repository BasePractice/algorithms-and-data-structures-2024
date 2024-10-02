package mirea.lab4;

/*Создать класс, описывающий сущность компьютер (Computer). Для
описания составных частей компьютера использовать отдельные классы
(Processor, Memory, Monitor). Описать необходимые свойства и методы для
каждого класса. Для названий марок компьютера используйте перечисления
(enum) */

public abstract class Prac4p4 {
    public static void main(String[] args) {
        Processor proc = new Processor("AMD Ryzen 5800X3D", "AM4", 8, 3800);
        Memory mem = new Memory("Kingston 32Gb", "DDR5", 4800);
        Monitor mon = new Monitor("Xiaomi Redmi G27Q", 27, "IPS", "2560x1440", 180);

        Computer comp = new Computer(proc, mem, mon, CompModel.ASUS, "ROG STRIX B550-A GAMING");
        System.out.println(comp.toString());
    }
}
