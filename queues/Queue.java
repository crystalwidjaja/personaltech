package queues;
import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;
    // create Queue
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  
            this.head = this.tail = tail;
        else {  
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }
    // returns head
    public LinkedList<T> getHead() {
        return this.head;
    }
    // returns tail
    public LinkedList<T> getTail() {
        return this.tail;
    }
    // iterator
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current; 

    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }

    // Does next element exists
    public boolean hasNext() {
        return current != null;
    }

    // returns data object & advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

class QueueManager<T> {
    // queue data
    private final String name; 
    private int count = 0;
    public final Queue<T> queue = new Queue<>(); // queue object

    // Queue Constructor
    public QueueManager(String name) {
        this.name = name;
    }

    // Queue Constructor
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    // Print Array
    public void addList(T[]... seriesOfObjects)
    {
        for (T[] objects: seriesOfObjects)
            for (T data : objects)
            {
                this.queue.add(data);
                this.count++;
                this.printQueue();
            }
    }
  // Print Queue
    public void printQueue() {
        System.out.println(this.name + " count: " + count);
        System.out.print(this.name + " data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
}