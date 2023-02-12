package seminar1.task2;

/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.
 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {3,2,2,3};
        int val = 3;
        //бежим по циклу с начала
        for (int i = 0; i < array.length; i++) {
            //если нашли требуемое значение
            if(val==array[i]){
                //пытаемся его вставить в конец
                for (int j = array.length-1; j >= i; j--) {
                    //если в конце НЕ требуемое значение - вставляем
                    if(array[j]!=val){
                        int temp = array[j];
                        array[j] = val;
                        array[i] = temp;
                        break;
                    }
                    //если это требуемое значение, то смотрим на значение слева от него и т.д
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
