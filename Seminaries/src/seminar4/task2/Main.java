package seminar4.task2;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Main {
    public static void main(String[] args) {
programm();


    }

    public static void programm() {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> myLinkedList = new LinkedList<>();
        while (true) {
            String data = iScanner.nextLine();
            String[] arr = data.split("~");
            if(arr[0].equals("print")){
                System.out.println(myLinkedList.remove(Integer.parseInt(arr[1])));
            }
            else{
                myLinkedList.add(Integer.parseInt(arr[1]), arr[0]);
            }
        }
    }
}
