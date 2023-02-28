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
        Notebook notebook1 = new Notebook("black", "HP", 8, 15, "GForce", 10000);
        Notebook notebook2 = new Notebook("grey", "Lenovo", 32, 17, "GForce", 90000);
        Notebook notebook3 = new Notebook("brown", "Sony", 16, 15, "GForce", 40000);
        Notebook notebook4 = new Notebook("green", "Samsung", 32, 14, "GForce", 67000);
        Notebook notebook5 = new Notebook("red", "HP", 64, 17, "GForce", 80000);
        Notebook notebook6 = new Notebook("blue", "Lenovo", 8, 15, "GForce", 12000);

        final var notebooks = Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6);
        final var sort = new SortingClass(notebooks);
        System.out.println("BEFORE: " + notebooks);
        UserRequest ur = new UserRequest();
        final var map = ur.createMap();
        final var sortedNotebooks = sort.sort(map);
        System.out.println("AFTER: " + sortedNotebooks);


    }
}
