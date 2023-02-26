package seminar5.task1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    public void add(String num, String surname){
        map.put(num, surname);
    }
    public void print(String name){
//        for (String passport: map.keySet()){
//        if(map.get(passport).equals(name)){
//            System.out.println(passport+ map.getValue());
//        }
        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(name)){
                System.out.println(entry);
            }
        }
    }
}
