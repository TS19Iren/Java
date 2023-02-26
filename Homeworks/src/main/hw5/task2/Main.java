package hw5.task2;

import java.util.*;

/*
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и
выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 Для сортировки использовать TreeMap.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        Map<String, Integer> map = new HashMap<>();

        for (String elem : list) {
            String name = elem.split(" ")[0];
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                int count = map.get(name);
                count += 1;
                map.put(name, count);
            }
        }
        Map<String, Integer> finalMap = new TreeMap<>(new ValueComparator(map));
        finalMap.putAll(map);
        System.out.println("Before: " + map);
        System.out.println("After: " + finalMap);
    }

}
