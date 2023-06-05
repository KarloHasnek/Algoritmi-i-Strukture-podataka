package pckg_adt_queue;

public interface ADTQUEUE<E> {
    /**
     * Gives size of the queue
     * @return size
     */
    int size();

    /**
     * Provides first element but does not
     * remove it from the queue
     * @return first element
     */
    E first();

    /**
     * Puts new element at the end
     * of the queue
     * @param element
     */
    void enqueue(E element);

    /**
     * Gives and removes the first element
     * of the queue
     * @return element
     */
    E dequeue();

    /**
     * Check if queue is empty
     * Returns true if empty
     * otherwise false
     * @return true or false
     */
    boolean isEmpty();
}
