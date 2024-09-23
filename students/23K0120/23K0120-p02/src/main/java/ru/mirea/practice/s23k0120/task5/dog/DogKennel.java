package ru.mirea.practice.s23k0120.task5.dog;

import java.util.ArrayList;
import java.util.Arrays;

public class DogKennel extends ArrayList<Dog> {
    public DogKennel() {
        //Default Constructor
    }

    public DogKennel(Dog[] dogs) {
        this.addAll(Arrays.asList(dogs));
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nums));
        DogKennel dogKennel = new DogKennel(new Dog[]{new Dog("Мира", 3)});
        dogKennel.add(new Dog("Мухтар", 5));


        System.out.println(dogKennel);
        System.out.println(dogKennel.get(1).getAgeToHuman());
    }
}
