public class MyQueue {
    private final int SIZE;
    private int[] queue;
    private int front, rear;

    public MyQueue(int SIZE) {
        this.SIZE = SIZE;
        queue = new int[SIZE];
        //front = ...
        //rear = ...
    }

    // check if the queue is full
    public boolean isFull() {
        return false;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return false;
    }

    // insert elements to the queue
    public void enqueue(int element) {

    }

    // delete element from the queue
    public int dequeue() {
        return 0;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    @Override
    public String toString() {
        return "MyQueue{}";
    }

}


