package zadatak1;
public class SLLConcrete<E> implements SLL<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    //Konstruktor
    public SLLConcrete(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void addFirst(E element) {
        Node<E> node = new Node<E>(element, head);
        this.head = node;

        if (isEmpty()) {
            this.tail = node;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        
        if (this.isEmpty()) {
            addFirst(element);
        } else {
            Node<E> node = new Node<E>(element, null);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty....");
        } else if (size == 1) {
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            element = this.head.getElement();
            this.head = head.getNext();
            this.size--;
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty...");
        } else if (size == 1) {
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            element = this.tail.getElement();
            Node<E> temp = this.head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            this.tail = temp;
            this.size--;
        }
        return element;
    }

    @Override
    public boolean containsElement(E element) {

        boolean contains = false;
        Node<E> temp = this.head;

        if (isEmpty()) {
            System.out.println("Empty...");
        }
        
        for (int i = 0; i < size; i++) {
            if (element.equals(temp)) {
                contains = true;
                break;
            } else {
                temp = temp.getNext();
            }
        }
        return contains;
    }

    @Override
    public void insertAtPosition(E element, int position) {
        if (position < 0 || position > size + 1){
            System.out.println("Index out of bounds");
            throw new IndexOutOfBoundsException();
        } else if (size == 0 && position == size + 1) {
            addFirst(element);
            size ++;
        } else if (position == size){
            addLast(element);
            size++;
        } else {
            Node<E> newNode = new Node<>(element, null);
            Node<E> temp = head;
            for (int i = 0; i < position-1; i++){
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            System.out.println("added at " + position);
            size ++;
        }
    }

    
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            this.head = null;
        }
    }
    
    @Override
    public E remove(int index) {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty...");
        } else if (size == 1) {
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            element = this.tail.getElement();
            Node<E> temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext(); // temp = element prije removed elementa
            }
            Node<E> temp2 = temp.getNext();
            temp.setNext(temp2); //Element prije pokazuje na element poslije
            temp = temp.getNext();
            temp.setNext(null); // Removed element ne pokazuje na nikoga
            this.size--;
        }
        return element;
    }
    
    @Override
    public E getFirst() {
        E firstElement = this.head.getElement();
        return firstElement;
    }
    
    @Override
    public E getLast() {
        E lastElement = this.tail.getElement();
        return lastElement;
    }
    
    @Override
    public String toString() {
        return "SLLConcrete [head=" + head + ", tail=" + tail + ", size=" + size + "]";
    }
}
