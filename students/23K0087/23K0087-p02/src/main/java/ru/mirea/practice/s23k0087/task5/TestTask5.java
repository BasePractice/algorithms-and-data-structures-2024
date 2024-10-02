package ru.mirea.practice.s23k0087.task5;

public abstract class TestTask5 {
    public static void main(String[] args) {
        DogShelter shelter = new DogShelter(4);
        Dog dog1 = new Dog("Шарик", 5);
        Dog dog2 = new Dog("Тима", 3);
        Dog dog3 = new Dog("Тузик", 1);
        Dog[] dogs = {dog1, dog2, dog3};
        shelter.addDogs(dogs);
        
        Dog dog4 = new Dog("Барбос", 2.5f);
        Dog dog5 = new Dog("Белка", 3);
        Dog dog6 = new Dog("Стрелка", 3);
        Dog[] newDogs = {dog4, dog5, dog6};
        shelter.addDogs(newDogs);


        System.out.println("Все собаки в питомнике:");
        for (int i = 0; i < shelter.getSize(); i++) {
            System.out.println(shelter.getDogs()[i].toString());
        }


        System.out.println("Возраст собак в человеческих годах:");
        for (int i = 0; i < shelter.getSize(); i++) {
            System.out.println(shelter.getDogs()[i].getName() + " - " + shelter.getDogs()[i].toHumanAge());
        }

        Dog lucky = new Dog("Лаки", 7);
        System.out.println("Возраст Лаки: " + lucky.getAge());
    }
}
