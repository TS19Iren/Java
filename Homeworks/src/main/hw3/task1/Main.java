package hw3.task1;

import java.util.Arrays;

/*
1.Реализовать алгоритм сортировки слиянием
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 6, 2, 3, 4,1,2,55,7,13,21,1,0,-1,3};
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] array, int[] leftPart, int[] rightPart, int leftIndex, int rightIndex) {
        System.out.println("Массив: "+Arrays.toString(array));
        System.out.println("Левая часть: "+Arrays.toString(leftPart));
        System.out.println("Правая часть: "+Arrays.toString(rightPart));
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (leftPart[i] <= rightPart[j]) {
                array[k++] = leftPart[i++];
            } else {
                array[k++] = rightPart[j++];
            }
        }
        while (i < leftIndex) {
            array[k++] = leftPart[i++];
        }
        while (j < rightIndex) {
            array[k++] = rightPart[j++];
        }
    }

    public static void mergeSort(int[] array, int index) {
        System.out.println("Работаем с массивом: "+Arrays.toString(array));
        System.out.println("Индекс: "+index);
        if (index < 2) {
            return;
        }
        int mid = index / 2;
        int[] leftPart = new int[mid];
        int[] rightPart = new int[index - mid];

        for (int i = 0; i < mid; i++) {
            leftPart[i] = array[i];
        }
        for (int i = mid; i < index; i++) {
            rightPart[i - mid] = array[i];
        }
        mergeSort(leftPart, mid);
        mergeSort(rightPart, index - mid);

        merge(array, leftPart, rightPart, mid, index - mid);
    }
}
