package ru.mirea.practice.s23k0755.task1;

abstract class Test {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(10);

        hashTab.add("A", "65");
        hashTab.add("B", "66");
        hashTab.add("C", "67");
        hashTab.add("D", "68");
        hashTab.add("E", "69");
        hashTab.add("F", "70");
        hashTab.add("G", "71");
        hashTab.add("H", "72");
        hashTab.add("I", "73");
        hashTab.add("J", "74");


        hashTab.getInfHashTab();

        System.out.println("\nУдалим С\n");
        hashTab.delete("C");
        hashTab.getInfHashTab();

        System.out.println("\nДобавим T\n");
        hashTab.add("T", "NewElement");
        hashTab.getInfHashTab();

        System.out.println("Поиск по T\n");
        System.out.println(hashTab.lookUp("T"));
    }

}
