package hw1.task4;

import java.sql.PreparedStatement;

/*
4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
восстановить выражение до верного равенства. Предложить хотя бы
одно решение или сообщить, что его нет.
 */
public class Main {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        equation = equation.replaceAll(" ", "");
        String[] splitStr = equation.split("=");
        int result = Integer.parseInt(splitStr[1]);
        String textInfo = "Ничего не найдено!";
        for (int i = 0; i <= 9; i++) {
            String s = splitStr[0].replaceAll("\\?", i + "");
            String[] s1 = s.split("\\+");
            if (Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]) == result) {
                textInfo = "Искомая цифра это " + i;
                textInfo += "\nПолученное выражение " + s + " = " + result;
                break;
            }
        }
        System.out.println(textInfo);

    }}
