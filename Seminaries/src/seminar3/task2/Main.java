package seminar3.task2;
/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
//        List<Integer> list = new Random().ints()
//                .limit(10)
//                .collect(Collectors.toList());
        for (int i=0; i<10; i++)
        {
            Random rand = new Random();
            rand.setSeed(System.currentTimeMillis());
            Integer r = rand.nextInt(15);
            arrList.add(r);

        }
        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);

    }

}
