package ru.mirea.practice.s23k0505.task5;

public abstract class Tester {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        String[] names = {"Шарик", "Арчибальд", "Жужа"};
        int[] ages = {1, 2, 3};
        kennel.addDog("Мохнатый", 7);
        kennel.addDogs(names, ages);
        System.out.println(kennel);

        kennel.ageDogToHuman();
        System.out.println(kennel);
    }
}
