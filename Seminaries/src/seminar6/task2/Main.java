package seminar6.task2;

import java.util.Arrays;
import java.util.Random;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
 уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = createArray(100,0,24);
        System.out.println(Arrays.toString(array));
    }

    private static Integer[] createArray(int size, int min, int max){
        Integer[] array = new Integer[size];
        Random r = new Random();
        for (int i = 0; i <size ; i++) {
            array[i] = r.nextInt(max - min) + min;
        }
        return array;
    }
}

