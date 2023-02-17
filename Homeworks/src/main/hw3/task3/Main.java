package hw3.task3;

import java.util.ArrayList;
import java.util.Random;

/*
3.Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое этого списка.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(10);
        Random rand = new Random();
        //заполнение списка целочисленными произвольными значениями
        for (int i = 0; i < 10; i++) {
            Integer r = rand.nextInt(20);
            numList.add(r);

        }
        System.out.println(numList);
        System.out.println(findMax(numList));
        System.out.println(findMin(numList));
        System.out.println(findArithmeticMean(numList));

    }

    static int findMax(ArrayList<Integer> numList) {
        //переменная которую принимаем за максимальное значение
        int max = numList.get(0);
        //в цикле поэлементно сравниваем максимальное значение с iым элементом
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) > max) {
                max = numList.get(i);
            }
        }
        return max;
    }

    static int findMin(ArrayList<Integer> numList){
        int min = numList.get(0);
        //в цикле поэлементно сравниваем максимальное значение с iым элементом
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) < min) {
                min = numList.get(i);
            }
        }
        return min;
    }

    static double findArithmeticMean(ArrayList<Integer> numList){
        int size = numList.size();
        int summ = 0;
        for (int i = 0; i < size; i++) {
            summ = summ+numList.get(i);
        }
        return summ/size;
    }
}
