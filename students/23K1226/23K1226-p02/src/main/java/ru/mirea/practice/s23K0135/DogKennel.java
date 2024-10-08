package ru.mirea.practice.s23K0135;

class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int size) {
        dogs = new Dog[size];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        }
    }

    public Dog[] getDogs() {
        return dogs;
    }
}
