package main.hw1.task3;

import java.util.Scanner;
/*
Реализовать простой калькулятор
 */

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        int operationNumber;
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Введите числа: ");
        a = userNumber.nextDouble();
        b = userNumber.nextDouble();
        System.out.println("Выберите номер операции: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        operationNumber = userNumber.nextInt();
        double result = 0;
        switch (operationNumber) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error!На ноль делить нельзя!");
                    break;
                } else {
                    result = a / b;
                    break;
                }

            default:
                System.out.println("Error! Введите корректный оператор");
        }
        System.out.println("Результат выбранной операции с числами " + a + " и " + b + " это " + result);

    }


}
