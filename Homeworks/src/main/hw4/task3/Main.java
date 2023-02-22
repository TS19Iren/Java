package hw4.task3;

import javax.imageio.stream.ImageInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используя итератор или foreach
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> myList = fillLinkedList(10);
        System.out.println(myList);
        System.out.println(summOfList(myList));
    }

    public static List<Integer> fillLinkedList(int size) {
        List<Integer> myLinkedList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            myLinkedList.add(rand.nextInt(10));
        }
        return myLinkedList;
    }

    public static int summOfList(List<Integer> list) {
        int summ = 0;
        for (int item : list) {
            summ += item;
        }
        return summ;
    }
}
