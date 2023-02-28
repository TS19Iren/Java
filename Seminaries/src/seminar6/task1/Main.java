package seminar6.task1;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами:
{1, 2, 6, 2, 4, 5, 0, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами:
{1, 2, 6, 2, 4, 5, 0, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами:
{1, 2, 6, 2, 4, 5, 0, 3}.  Распечатайте содержимое данного множества.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }
}
