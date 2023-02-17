package hw3.task2;

import java.util.ArrayList;
import java.util.Random;

/*
2.Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>(10);
        Random randNum = new Random();
        for (int i = 0; i <10 ; i++) {
            Integer r = randNum.nextInt(15);
            listInt.add(r);
        }
        System.out.println(listInt);
      ArrayList<Integer> copeList = new ArrayList<Integer>(listInt);
        for (int i = 0; i < copeList.size(); i++) {
            if(copeList.get(i)%2 ==0){
                listInt.remove(copeList.get(i));
            }

        }System.out.println(listInt);
    }
}
