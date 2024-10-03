package ru.mirea.practice.s23k0093;

class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine) item).getName());
            }
        }
    }
}