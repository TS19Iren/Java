package hw1.task2;

/*
Вывести все простые числа от 1 до 1000
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                if (result.length() == 0)
                    result.append(i);
                else
                    result.append(", ").append(i);
            }
            count = 0;
        }
        System.out.println(result);
    }


}
