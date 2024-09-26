package ru.mirea.practice.s0000001.task4;
public class Shop{
    private String brand;
    private String CPU;
    private int price;
    private String GPU;

    public Shop(String brand, String CPU, int price, String GPU) {
        this.brand = brand;
        this.CPU = CPU;
        this.price = price;
        this.GPU = GPU;
    }

    public String getBrand() {
        return brand;
    }

    public String getCPU() {
        return CPU;
    }

    public int getPrice() {
        return price;
    }

    public String getGPU() {
        return GPU;
    }

    public Shop[] addComp(Shop[] arr, Shop newOne){
        int len=arr.length;
        Shop[] newArr = new Shop[len+1];
        for(int i =0;i<len;i++){
            newArr[i]=arr[i];
        }
        newArr[-1]=newOne;
        return newArr;
    }

    public void delComp(){
        System.out.print("Deleted: "+toString());
    }

    public void findExactByPrice(int priceMax, int priceMin){
        if(priceMin<=this.price && this.price<=priceMax){
                System.out.print("Ur option: "+toString());}
    }


    @Override
    public String toString(){
        return "Brand is "+brand+" with CPU - "
                +CPU+" and GPU - "
                +GPU+". Price is "+price;
    }

}