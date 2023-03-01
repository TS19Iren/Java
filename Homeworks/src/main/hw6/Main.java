package hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        final var notebooks = DataGenerator.generate();
        final var sort = new SortingClass(notebooks);
        System.out.println("All notebooks: " + notebooks);
        UserRequest ur = new UserRequest();
        final var map = ur.createMap();
        final var sortedNotebooks = sort.sort(map);
        System.out.println("Filter information: " + sortedNotebooks);
    }
}
