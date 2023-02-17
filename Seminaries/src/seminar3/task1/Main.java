package seminar3.task1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
public class Main {
    public static void main(String[] args) {
Object s  = new Object();
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        ArrayList<String> arrList = new ArrayList <String>(Arrays.asList(s1,s2,s3,s4,s5,s6));
        for (int i = 0; i < arrList.size()-1; i++) {
            for (int j = 1; j <arrList.size(); j++) {
                System.out.printf("%s экв %s : %b\n",
                        arrList.get(i), arrList.get(j),arrList.get(i).equalsIgnoreCase(arrList.get(j)));
                System.out.printf("%s == %s : %b\n",
                        arrList.get(i), arrList.get(j),arrList.get(i)==arrList.get(j));
            }
        }

    }
}
