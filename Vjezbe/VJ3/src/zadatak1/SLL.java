package zadatak1;


public interface SLL<E>{
    /**
     * return the size of the list
     * that is the number of actual elements in
     * the list
     * @return size of the list
     */
    int size();

    /**
     * return if list is empty
     * true if empty, and false if not
     * @return empty or not
     */
    boolean isEmpty();

    /**
     * add new element at the beggining of
     * the list
     */
    void addFirst(E element);

    /**
     * add new element at the end of the
     * list
     */
    void addLast(E element);

    /**
     * clear whole list
     * 
     */
    void clear();

    /**
     * removing first element from the list
     * list size is decrementing for one
     * @return element from first position, null if there is no elements
     */
    E removeFirst();

    /**
     * removing the last element from the list
     * list size is decremented for one
     * @return element from last position, null if there is no elements
     */
    E removeLast();

    /**
     * removing chosen element from the list
     * list size is decremented for one
     * @return removed element, null if there is no elements
     */
    E remove(int index);

    /**
     * Returns true if contains elements, and
     * false ig doesn't
     * @return true if contains
     */
    boolean containsElement(E element);

    /**
     * Returns the first element in this list 
     *
     */
    E getFirst();

    /**
     * Returns the last element in this list 
     *
     */
    E getLast();

    /**
     * Insert element at desired postion
     * @throws IndexOutOfBoundsException if position out of bounds
     */

    void insertAtPosition(E element, int position);
}
