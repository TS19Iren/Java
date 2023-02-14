package seminar2.task2;

/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 */
public class main {
    public static void main(String[] args) {
        String myStr = "zzzzzxcqazswqaaaaaabbbcddee";
        System.out.println(squeeze(myStr));
    }

    static String squeeze(String myStr) {
        int count = 1;
        String temporary = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < myStr.length() ; i++) {
            if (myStr.charAt(i - 1) == myStr.charAt(i)) {
                temporary = String.valueOf(++count) + myStr.charAt(i);
                if (i == myStr.length() - 1) {
                    temporary = String.valueOf(count) + myStr.charAt(i);
                    sb.append(temporary);
                }
            } else {
                if (count == 1) {
                    temporary = String.valueOf(count) + myStr.charAt(i - 1);
                }
                count = 1;

                if (i == myStr.length() - 1) {
                    temporary += String.valueOf(count) + myStr.charAt(i);

                }
                sb.append(temporary);
            }
        }
        return sb.toString();
    }
}
