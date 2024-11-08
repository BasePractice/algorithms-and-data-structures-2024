package ru.mirea.practice.s0000001.task1;

public abstract class TesterOfsShapes {
    public static void main(String[] args) {
        ListOfShapes myList = new ListOfShapes();
        Shape a = new Shape("q", 0.1, 11);
        Shape b = new Shape("w", 0.2, 12);
        Shape c = new Shape("e", 0.3, 13);
        myList.addShape(a);
        myList.addShape(b);
        myList.addShape(c);
        //myList.addShape(d);
        //myList.addShape(e);
        myList.printAll();
        myList.fileWrite("/Users/ad/Documents/2 курс/практика/алгоритмы/PW17.file/text.txt");// or any
        ListOfShapes newList = new ListOfShapes();
        //newList.fileInsert("/Users/ad/Documents/2 курс/практика/алгоритмы/PW17.file/text.txt");
        myList.delShape("q");
        myList.printAll();
        newList.printOne("w");
        myList.clearList();
        System.out.println(newList.isEmptryList());
        myList.printAll();
    }
}
