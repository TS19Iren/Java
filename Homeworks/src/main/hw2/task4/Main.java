package hw2.task4;

import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

/*
Реализовать простой калькулятор
 */
public class Main {
    public static void main(String[] args) throws Exception {
        char operation;
        Scanner userScan = new Scanner(System.in);
        writeLog("Начинается работа калькулятора");
        System.out.println("Введите числа: ");

        double a;
        double b;
        a = userScan.nextDouble();
        b = userScan.nextDouble();
        writeLog("Введены числа: "+ a +" "+ b);
        System.out.print("Введите действие:  (+, -, *, /): ");
        operation = userScan.next().charAt(0);
        writeLog("Введен оператор: "+ operation);
        try {
            double result = calc(a,b,operation);
            writeLog("Результат выбранной операции с числами " + a + " и " + b + " это " + result);
            System.out.println("Результат выбранной операции с числами " + a + " и " + b + " это " + result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            writeLog(e.getMessage());
        }
    }
    static double calc(double a, double b, char operation) throws Exception {
            double result = 0;
            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        throw new Exception("Error!На ноль делить нельзя!");
                    } else {
                        result = a / b;
                        break;
                    }
                default:
                    System.out.println("Error! Введите корректный оператор");
                    writeLog("Error! Введите корректный оператор");
            }

        return result;
    }

    static void writeLog(String a) {
        Date date = new Date();
        try (FileWriter test = new FileWriter("testcalc.txt", true)) {
            String curDate = date.toString();
            test.append(curDate).append(" ").append(a).append("\n");
        } catch (Exception e) {
            System.out.println("Было исключение" + e.getMessage());
        }
    }

}



