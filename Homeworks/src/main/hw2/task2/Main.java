package hw2.task2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

/*
2 . Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */
public class Main {
    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int[] arrayNum = new int[]{17, 2, 5, 10, 1, 3, 4, 16};
        System.out.println(Arrays.toString(bubbleSort(arrayNum)));

    }


    static int[] bubbleSort(int[] array) {
        writeLog("Начинается сортировка массива: " + Arrays.toString(array));
        int temp;
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;


                }
                counter++;
                writeLog("Итерация " + counter +", сортируемый массив на данном шаге выглядит: "+ Arrays.toString(array));

            }
        }
        writeLog("Сортировка завершена, массив: "+ Arrays.toString(array));
        return array;
    }
    static void writeLog(String a){
        Date date = new Date();
        

        try (FileWriter test = new FileWriter("test.txt", true)) {
            String curDate = date.toString();
            test.append(curDate).append(" ").append(a).append("\n");
        } catch (Exception e) {
            System.out.println("Было исключение" + e.getMessage());
        }
    }
}
