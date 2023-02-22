package seminar4.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */
public class Main {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        fillArray(arrList);
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);

        long timeStart2 = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        fillArray(linkedList);
        long timeFinish2 = System.currentTimeMillis();
        System.out.println(timeFinish2 - timeStart2);
    }

    public static void fillArray(List<Integer> arrList) {

        for (int i = 0; i < 10000000; i++) {
            arrList.add(i);
        }
    }
}
