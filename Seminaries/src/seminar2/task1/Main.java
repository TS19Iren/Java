package seminar2.task1;
/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */

import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        char a = 'a';
        char b = 'b';

        System.out.println(createStr(n, a, b));
    }

    static String createStr(int n, char a, char b) {
        StringBuilder sb = new StringBuilder();
        char temp = b;
        for (int i = 0; i < n; i++) {
            if (temp == a) {
                sb.append(b);
                temp = b;
            } else {
                sb.append(a);
                temp = a;
            }

            }
            return sb.toString();
        }
    }
