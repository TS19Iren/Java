package hw4.task1;

import java.util.LinkedList;
import java.util.Queue;

/*
Реализуйте очередь с помощью LinkedList со следующими методаим:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя его
 */
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.first());
        System.out.println(queue);

    }
}
