package stack;
public interface STACK <E> {
    
    /**
     * Method that returns actual size of a stack.
     * Size is equal to number of elements.
     * @return number of elements in stack
     */
    int size();

    /**
     * Method that checks if stack is empty.
     * Returns true if empty, otherwise false.
     * @return True or false.
     */
    boolean isEmpty();

    /**
     * Fetch but doesn't remove last element in the stack.
     * @return element or null
     */
    E top();

    /**
     * Fetch and remove last element in the stack.
     * @return element or null
     */
    E pop();

    /**
     * Add the element at the last position in the stack.
     * @param element
     */
    void push(E element);
}
