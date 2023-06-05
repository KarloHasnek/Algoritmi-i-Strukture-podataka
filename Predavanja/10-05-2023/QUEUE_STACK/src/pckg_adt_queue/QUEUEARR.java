package pckg_adt_queue;

public class QUEUEARR<E> implements ADTQUEUE<E>{

    private int front;
    private int capacity;
    private static final int CAPACITY = 10;
    private int size;
    private E[] queue;

    public QUEUEARR() {
        this.capacity = CAPACITY;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[capacity];
    }

    public QUEUEARR(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E first() {
        E element = null;

        if (isEmpty()){
            System.out.println("Queue is empty!");
        } else {
            element = queue[front];
        }
        return element;
    }

    @Override
    public void enqueue(E element) {
        if (this.size < this.capacity) {
            System.out.println("Placing new element in the queue...");
            int index = (front + size) % capacity;
            queue[index] = element;
            size++;
            System.out.println("Added " + element + " at the index position: " + index);
        } else {
            System.out.println("The queue is full - nothing to add...");
        }

    }

    @Override
    public E dequeue() {
        E element = null;

        if (isEmpty()){
            System.out.println("Queue is empty!");
        } else {
            element = queue[front];
            queue[front] = null;
            front = (front + 1) % capacity;
            size--;
            System.out.println(element + " has been removed from the queue");
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString(){
        String front = "Front: ";
        String size = "Size: ";
        String rep = "";

        if (isEmpty()){
            size += this.size;
        } else {
            front += this.front;
            size += this.size;
            for (int i = 0; i < capacity; i++) {
                if (i == this.front){
                    rep += " >>[ " + queue[this.front] + " ]<< ";
                } else {
                    rep += "[ " + queue[i] + " ]";
                }
            }
        }

        return size + "\n" + front + "\n" + rep + "\n";
    }

}
