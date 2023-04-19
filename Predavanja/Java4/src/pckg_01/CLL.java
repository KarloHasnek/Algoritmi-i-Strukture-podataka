package pckg_01;

public class CLL<E> implements SLL<E> {

    private Node<E> tail;
    private int size;

    public CLL() {
        tail = null;
        this.size = 0;
        System.out.println("Created an empty list!");
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(E element) {
        if (isEmpty()) {
            System.out.println("Adding element to first position...");
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else{
            Node<E> newNode = new Node<>(element, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (isEmpty()) {
            System.out.println("Adding element to last position...");
            tail = new Node<>(element, null);
            tail.setNext(tail);
            size++;
        } else {
            addFirst(element);
            System.out.println("Using addFirst to implement addLast!!!");
            tail = tail.getNext();
        }
    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            Node<E> fst = tail.getNext();
            tail.setNext(fst.getNext());
            fst.setNext(null);
            element = fst.getElement();
            System.out.println("Removing the first element: " + element);
            size--;
        }
        return element;
    }

    @Override
    public E removeLast() {
    }

    @Override
    public boolean containsElement(E element) {
        boolean isContained = false;
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else { 
            for (int i = 0; i < size; i++) {
                if (element.equals(tail.getElement())) {
                    isContained = true;
                    break;
                } else {
                    rotate();
                }
            }
        }
        return isContained;
    }

    @Override
    public void insertAtPosition(E element, int position) {
    }


    @Override
    public String toString() {
        return "CLL [tail=" + tail.getElement() + ", size=" + size + "]";
    }


    /**
    * Method that rotates tail in one direction
    */
    public void rotate() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            tail = tail.getNext();
            System.out.println("Rotation for one step!");
        }

    }
}
