package hw4.task1;
/*
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя его
 */
import java.util.LinkedList;
import java.util.List;


public class MyQueue {
    private List<Integer> queue;


    public MyQueue() {
        this.queue = new LinkedList<Integer>();
    }

    public void enqueue(int item) {
        this.queue.add(item);
    }

    public Integer dequeue(){
        return this.queue.remove(0);
    }
    public Integer first(){
        return this.queue.get(0);
    }

public String toString(){
        return this.queue.toString();
}
}
