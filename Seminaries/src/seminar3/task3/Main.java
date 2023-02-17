package seminar3.task3;

import java.util.*;

/*
Задание №2.1
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
Задание состоит из двух блоков
Задание №2.2 (если выполнено первое задание)
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>(Arrays.asList("Марс", "Венера", "Плутон", "Юпитер",
                "Сатурн","Марс"));
        Set<String> planetSet = new HashSet<>(arrayList);

        int count = 0;
        for (String a: planetSet) {
            count = Collections.frequency(arrayList, a);
            System.out.println(a +" "+ count);
            if(count>1){
                arrayList.remove(a);
            }

        }
        System.out.println(String.join(", ", arrayList));


    }
}
