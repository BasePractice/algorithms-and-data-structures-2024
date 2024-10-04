package mirea.lab7.p7;

/* Создать статический метод printMagazines(Printable[] printable) в
классе Magazine, который выводит на консоль названия только журналов. */

public class Magazine implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable i : printable) {
            if (i instanceof Magazine) {
                System.out.println();
                i.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
}
