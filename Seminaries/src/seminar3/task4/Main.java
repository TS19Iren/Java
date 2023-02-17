package seminar3.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
Задание №3
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Марс", "1", "Плутон", "2",
                "Сатурн","1"));
        System.out.println(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            try{
                Integer.parseInt(arrayList.get(i));
                arrayList.remove(arrayList.get(i));
            }
            catch(NumberFormatException e){

            }
        }
        System.out.println(arrayList);
    }
}
