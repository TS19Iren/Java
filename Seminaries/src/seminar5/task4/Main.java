package seminar5.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Взять набор строк, например,Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
 */
public class Main {
    public static void main(String[] args) {
ex1("Мороз и солнце день чудесный\n" +
        "Еще ты дремлешь друг прелестный\n," +
                " Пора красавица проснись.");
    }
    static void ex1(String s){
        Map<Integer, List<String>> treeMap = new TreeMap<>();
        String[] s1 = s.split("\n");
        for(String s2: s1){
            if(treeMap.containsKey(s2.length())){
                List<String> list = treeMap.get(s2.length());
                list.add(s2);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s2);
                treeMap.put(s2.length(),list);
            }
        }
        System.out.println(treeMap);

    }
}
