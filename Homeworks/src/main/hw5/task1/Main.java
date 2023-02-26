package hw5.task1;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ирина", "23232546");
        phonebook.printPhonebook("Ирина");
        phonebook.add("Ирина", "213551321");
        phonebook.add("Алексей", "213551321");
        phonebook.printPhonebook("Алексей");
        phonebook.printPhonebook("Ирина");
    }
}
