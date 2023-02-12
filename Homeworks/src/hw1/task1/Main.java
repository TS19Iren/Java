package hw1.task1;

/*
Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int triangleN = findTriangleN(n);
        int resultSumm = sumOfNumbersfromOneToN(triangleN);
        System.out.println(resultSumm);
        int resultMulty = multyOfNumbersfromOneToN(triangleN);
        System.out.println(resultMulty);
    }

    private static int findTriangleN(int n) {
        int result = (n * (n + 1)) / 2;
        return result;
    }

    private static int sumOfNumbersfromOneToN(int num) {
        int summ = 0;
        for (int i = 1; i < num; i++) {
            summ += i;
        }
        return summ;
    }
    private static int multyOfNumbersfromOneToN(int num) {
        int multy = 1;
        for (int i = 1; i < num; i++) {
            multy *= i;
        }
        return multy;
    }
}
