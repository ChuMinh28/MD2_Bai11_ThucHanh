package thuchanh3;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(79);
        queue.enqueue(9);
        queue.enqueue(25);
        queue.dequeue();

        queue.enqueue(22);
        queue.dequeue();
        queue.enqueue(54);
        queue.enqueue(63);
        queue.enqueue(89);
        queue.enqueue(836);
    }
}
