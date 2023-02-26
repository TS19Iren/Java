package hw5.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    void add(String name, String number) {
        List<String> newPhonebook;
        if (phonebook.containsKey(name)) {
            newPhonebook = phonebook.get(name);
        } else {
            newPhonebook = new ArrayList<>();
        }
        newPhonebook.add(number);
        phonebook.put(name, newPhonebook);
    }

    void printPhonebook(String name){
        System.out.println("Телефонный номер контакта "+ name + " " + phonebook.get(name));
    }
}
