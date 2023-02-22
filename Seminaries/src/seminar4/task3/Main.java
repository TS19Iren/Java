package seminar4.task3;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов,
помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = createArray();
        showStack(addToStack(arr));

        addToQueue(arr);

    }
    public static int[]  createArray(){
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;

        }
        return myIntArr;
    }
    public static Stack <Integer> addToStack (int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);

        }
        return stack;
    }
    static void showStack(Stack<Integer> stack){
//        for (int item: stack) {
//            System.out.print(item+" ");
//        }
        while(stack.size()>0){
            System.out.println(stack.pop()+" ");
        }
    }

    public static void addToQueue(int[] arr){
        Queue<Integer> myQueue = new ArrayDeque<>();
        for (int item:arr){
            myQueue.add(item);
        }
        System.out.println(myQueue);

    }
}
