package ru.mirea.practice.s0000001.task5;

public class PitomnikOfDogs {
    private int amount=0;
    private Dog[] arr;


    public PitomnikOfDogs(int len){
        this.arr = new Dog[len];
    }

    public PitomnikOfDogs addDog(PitomnikOfDogs prevArr, Dog newOne){
        if(this.amount < prevArr.arr.length){
            prevArr.arr[this.amount]=newOne;
            this.amount+=1;
        }
        else{
            Dog[] newArr = new Dog[prevArr.arr.length+1];

            for(int i =0;i<prevArr.arr.length;i++){
                newArr[i]=prevArr.arr[i];}

            newArr[this.amount]=newOne;
            this.amount+=1;
            prevArr.arr=newArr;
        }
        return prevArr;
    }

    @Override
    public String toString() {
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println("Dog #"+(i+1)+": "+arr[i]);}}
        return "";

    }
}
