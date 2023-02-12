package seminar1.task1;

import java.time.LocalDateTime;
import java.util.Scanner;
/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int[] arr1 = new int[]{1, 1, 0, 1, 1, 1,1,0,0,1};
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                count++;

            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        if (max < count) {
            max = count;
        }
        System.out.println("Максимальное количество повторяющихся единиц: " + max);

    }


}
