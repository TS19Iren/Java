package seminar1.task3;

/*
Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
 */

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"ролксааыы", "ролkjkjhkhkiсывы", "тролллф", "гномы"};
        String pref = "рол";
String res = findPref(pref,array);
        System.out.println(res);
    }

    private static String findPref(String pref, String[] array) {
        int maxLength = 0;
        String result = "";
        for (String s : array) {
            if (s.startsWith(pref)) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    result = s;
                }
            }
        }
        return result;
    }
}

