package seminar2.task3;
/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */
public class Main {
    public static void main(String[] args) {
        String s = "fghhgf";
        String ss = "hfgsajjkad";
        System.out.println(isPalindrom(s));
        System.out.println(isPalindrom(ss));
    }
    static boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        boolean bool = false;
        if(s.equals(sb.reverse().toString())){
            bool = true;
        }else bool = false;
        return bool;
    }

    }

