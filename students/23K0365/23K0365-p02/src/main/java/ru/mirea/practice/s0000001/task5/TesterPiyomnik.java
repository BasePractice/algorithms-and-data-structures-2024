package ru.mirea.practice.s0000001.task5;

public abstract class TesterPiyomnik {
    public static void main(String[] args) {
        PitomnikOfDogs arrDogs = new PitomnikOfDogs(99);//random
        Dog newDog = new Dog("Thomas","Kris",4);

        System.out.format("The %s's human-age is %d\n\n",
                newDog.getName(),newDog.dogToHuman());

        Dog anotherDog=new Dog("Klinton","Alex",9);
        Dog anotherDog1=new Dog("Bobik","Alex",9);
        Dog anotherDog2=new Dog("Sobaka","Alex",9);

        System.out.println("A name of random dog is "+ anotherDog1.getName()+"\n");

        arrDogs=arrDogs.addDog(arrDogs,newDog);
        arrDogs=arrDogs.addDog(arrDogs,anotherDog);
        arrDogs=arrDogs.addDog(arrDogs,anotherDog1);
        arrDogs=arrDogs.addDog(arrDogs,anotherDog2);

        System.out.println(arrDogs);
    }
}
