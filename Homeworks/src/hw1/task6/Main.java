package hw1.task6;
/*
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class Main {
    public static void main(String[] args) {
int a = 3;
int b = 2;
int result = aInBDegree(a,b);
        System.out.println(result);

    }
    static int aInBDegree(int a, int b){
        if (b==0)
            return 1;
        return aInBDegree(a,b-1)*a;
    }
}
