package hw4.task2;

import java.util.*;

/*
Не обращаться по индексу
Пусть дан LinkedList  с несколькими элементами. Реализуйте метод который вернет "перевернутый список".
 */
public class Main {
    public static void main(String[] args) {
        List<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("bubble");
        myLinkedList.add("double");
        myLinkedList.add("noodle");
        myLinkedList.add("cuddle");
        System.out.println(myLinkedList);
        System.out.println(reverseList(myLinkedList));

    }
    public static List<String> reverseList(List<String> myList){

List<String> reverseList = new LinkedList<>();
        ListIterator<String> iterator = myList.listIterator(myList.size());
        while (iterator.hasPrevious()){
            reverseList.add(iterator.previous());
        }
        return reverseList;

    }
}
