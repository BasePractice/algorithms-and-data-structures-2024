package ru.mirea.practice.s29k0112;

public final class TestArrayList {
    private TestArrayList() {

    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("один");
        myList.add("два");

        System.out.println("Элементы:");

        MyIterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Размер: " + myList.size());
    }
}
