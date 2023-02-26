package seminar5.task2;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же.
(Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorph("paper","title"));

    }
    public static boolean isIsomorph(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {

            Map<Character, Character> map = new HashMap<>();
            char[] firstStr = a.toCharArray();
            char[] secondStr = b.toCharArray();

            for (int i = 0; i < firstStr.length - 1; i++) {
                if (map.containsKey(firstStr[i])) {
                    if (map.get(firstStr[i]) != secondStr[i]) return false;

                } else {
                    map.put(firstStr[i], secondStr[i]);
                }
            }
        }
        return false;
    }

}
