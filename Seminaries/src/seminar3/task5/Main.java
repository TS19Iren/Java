package seminar3.task5;
/*
Каталог товаров книжного магазина сохранен в виде двумерного

        списка List<ArrayList<String>> так, что на 0й позиции каждого
        внутреннего списка содержится название жанра, а на остальных
        позициях - названия книг. Напишите метод для заполнения данной
        структуры.
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> catalogBooks = new ArrayList<>();
        catalogBooks.add(Arrays.asList("проза", "поэзия", "детектив"));
        catalogBooks.add(Arrays.asList("1", "2", "3"));


    }
}
