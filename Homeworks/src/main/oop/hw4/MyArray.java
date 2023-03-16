package oop.hw4;

import java.util.Arrays;

public class MyArray<E> {
    private E[] innerArray;
    private int defaultSize = 5;
    private int lastIndexAddedElem = 0;

    //конструктор без параметра
    public MyArray() {
        innerArray = ((E[]) new Object[defaultSize]);
    }


    /*конструктор с параметром T[] – конструктор, который проводит инициализацию и
    заполняет массив данными, пришедшими из параметра
    */
    public MyArray(E[] e) {
        innerArray = ((E[]) new Object[e.length]);
        System.arraycopy(e, 0, innerArray, 0, e.length);
    }

    //Вставка в массив
    public void add(E e) {
        if (lastIndexAddedElem == innerArray.length - 1) {
            increaseSize();
        }
        innerArray[lastIndexAddedElem++] = e;

    }

    //    Длина массива
    public int getSize() {

        return innerArray.length;
    }

    //Метод увеличивающий длину массива
    private void increaseSize() {
        E[] biggerArray = ((E[]) new Object[innerArray.length * 2]);
        System.arraycopy(innerArray, 0, biggerArray, 0, innerArray.length);
        innerArray = biggerArray;
    }

    private void increaseSize(int newSize) {
        E[] biggerArray = ((E[]) new Object[newSize + 1]);
        System.arraycopy(innerArray, 0, biggerArray, 0, innerArray.length);
        innerArray = biggerArray;
    }

    //Удаление элемента по индексу
    public void remove(int index) {
        E[] smallerArray = ((E[]) new Object[innerArray.length]);
        if (index == 0) {
            System.arraycopy(innerArray, index + 1, smallerArray, 0, innerArray.length - 1);
        }
        if (index == innerArray.length - 1) {
            System.arraycopy(innerArray, 0, smallerArray, 0, innerArray.length - 2);
        } else {
            System.arraycopy(innerArray, 0, smallerArray, 0, index);
            System.arraycopy(innerArray, index + 1, smallerArray, index, innerArray.length - index - 1);

        }
        innerArray = smallerArray;
        lastIndexAddedElem--;
    }

    //Вывод на печать массива
    public void printArray() {
        System.out.println(Arrays.toString(innerArray));
    }

    //Удаление всех элементов с заданным значением
    public void deleteElem(E elem) {
        E[] copy = (E[]) new Object[innerArray.length];
        int counter = 0;
        for (E e : innerArray) {
            if (e != elem && e != null) {
                copy[counter++] = e;
            }
        }
        innerArray = copy;
        lastIndexAddedElem = counter;
    }

    //поиск минимума
    public E min() {
        int min = Integer.MAX_VALUE;
        E minElem = innerArray[0];
        for (int i = 0; i < innerArray.length; i++) {
            if (innerArray[i] != null && (innerArray[i].hashCode() < min)) {
                min = innerArray[i].hashCode();
                minElem = innerArray[i];
            }
        }
        return minElem;
    }

    // Поиск максимума
    public E max() {
        int max = Integer.MIN_VALUE;
        E maxElem = innerArray[0];
        for (int i = 0; i < innerArray.length; i++) {
            if (innerArray[i] != null && (innerArray[i].hashCode() > max)) {
                max = innerArray[i].hashCode();
                maxElem = innerArray[i];
            }
        }
        return maxElem;
    }

    //Поиск суммы элементов массива
    public Object summ() throws Exception {
        E e = innerArray[0];
        Object summ = null;
        if (e instanceof Integer) {
            summ = 0;
            for (E elem : innerArray) {
                if (elem != null) {
                    summ = Integer.sum((Integer) elem, (Integer) summ);
                }
            }
        } else {
            if (e instanceof Double) {
                summ = 0.0;
                for (E elem : innerArray) {
                    if (elem != null) {
                        summ = Double.sum((Double) elem, (Double) summ);
                    }
                }
            } else if (e instanceof String) {
                summ = "";
                for (E e1 : innerArray) {
                    if (e1 != null) {
                        summ = (String) summ + e1;
                    }
                }
            } else {
                throw new IllegalTypeException();
            }
        }
        return summ;
    }

    //Поиск произведения элементов массива
    public Number multy() throws IllegalTypeException {
        E e = innerArray[0];
        Object multy = 0;
        if (e instanceof Integer) {
            multy = 1;
            for (E elem : innerArray) {
                if (elem != null) {
                    multy = (Integer) elem * (Integer) multy;
                }
            }
        } else {
            if (e instanceof Double) {
                multy = 1.1;
                for (E elem : innerArray) {
                    if (elem != null) {
                        multy = (Double) elem * (Double) multy;
                    }
                }

            } else {
                throw new IllegalTypeException();
            }

        }
        return (Number) multy;
    }

    //Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public Integer[] searchingIndexByElem(E e) {
        Integer[] index = new Integer[innerArray.length];
        int count = 0;
        for (int i = 0; i < innerArray.length; i++) {
            if (innerArray[i] != null && innerArray[i] == e) {
                index[count++] = i;
            }
        }
        if (count == 0) {
            Integer[] indexWithoutNull = new Integer[1];
            indexWithoutNull[0] = -1;
            return indexWithoutNull;
        }
        Integer[] indexWithoutNull = new Integer[count];
        indexWithoutNull[0] = -1;
        for (int i = 0; i < count; i++) {
            indexWithoutNull[i] = index[i];
        }
        return indexWithoutNull;


    }

    //Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
    public boolean isElemInArray(E e) {
        return searchingIndexByElem(e)[0] != -1;
    }

    // Задание значения элементу массива с заданным индексом
    public void add(E value, int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Illegal index value: {" + index + "}");
        }
        if (index > innerArray.length) {
            increaseSize(index);
        }
        innerArray[index] = value;
    }

    //получающий элемент по заданному индексу
    public E get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Illegal index value: {" + index + "}");
        }
        if (index > innerArray.length) {
            throw new ArrayIndexOutOfBoundsException("Illegal index value: {" + index + "}");
        }
        return innerArray[index];
    }
    //Сортировка простыми вставками
//Сортировка простым выбором
//Пузырьковая сортировка
    public void bubbleSort(){
        Sorter<E> sorter = new Sorter<>();
        sorter.bubble(innerArray);
    }
    public void selectionSort(){
        Sorter<E> sorter = new Sorter<>();
        sorter.selection(innerArray);
    }
    public void insertionSort(){
        Sorter<E> sorter = new Sorter<>();
        sorter.insertion(innerArray);
    }

}