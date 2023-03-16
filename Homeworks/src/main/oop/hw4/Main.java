package oop.hw4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        MyArray<Integer> array = new MyArray<>();
        MyArray<String> arrayStr = new MyArray<>();
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(2);
        array.add(3);
        arrayStr.add("asdas");
        arrayStr.add("asdas");
        arrayStr.add("aaa");
        arrayStr.add("a");
        arrayStr.add("5");
        arrayStr.add("6");
        System.out.println(Arrays.toString(array.searchingIndexByElem(8)));
        array.add(10, 11);
        array.add(777);
        array.add(888);
        array.add(123);
        array.add(-150);
        array.add(2);
        array.add(555);
        array.add(111, 8);
        array.printArray();
        System.out.println(array.getSize());
        System.out.println(array.get(0));
        System.out.println(array.get(2));
//        array.bubbleSort();
        array.printArray();
        arrayStr.bubbleSort();
        arrayStr.printArray();
        arrayStr.selectionSort();
        arrayStr.printArray();
        array.selectionSort();
        array.printArray();
        array.insertionSort();
        array.printArray();
    }

}
