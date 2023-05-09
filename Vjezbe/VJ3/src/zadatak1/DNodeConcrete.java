package zadatak1;

public class DNodeConcrete <E> implements SLL <E> {

    private DNode<E> head = null;
    private DNode<E> tail = null;
    private int size;

    public DNodeConcrete(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void addFirst(E element) {
        DNode<E> newNode = new DNode<>(element, head, null);
        this.head = newNode;
        if (this.size == 0) {
            this.tail = newNode;
        }
        this.size ++;
    }

    @Override
    public void addLast(E element) {
        
        if (isEmpty()) {
            addFirst(element);
        } else {
        DNode<E> newNode = new DNode<>(element, null, tail);
        tail.setNext(newNode);
        tail = newNode;
        if (this.size == 0) {
            this.head = newNode;
        }
        this.size ++;
        }
    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()){
            System.out.println("nothing to remove");
        } else if (this.size == 1){
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size --;
        } else {
            element = this.head.getElement();
            this.head = this.head.getNext();
            this.head.setBefore(null);
            this.size --;
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if (isEmpty()){
            System.out.println("Nothing to remove");
        } else if (this.size == 1){
            element = this.tail.getElement();
            this.tail = null;
            this.head = null;
            this.size --;
        } else {
            element = this.tail.getElement();
            this.tail = this.tail.getBefore();
            this.tail.setNext(null);
            this.size --;
        }
        return element;
    }

    @Override
    public boolean containsElement(E element) {
        boolean contains = false;
        boolean flag = false;
        if(isEmpty()){
            System.out.println("list is empty, nothing to search.");
        } else {
            DNode<E> temp = this.head;
            while(!contains && !flag) {
                if (element.equals(temp.getElement())){
                    System.out.println("Contains element!");
                    contains = true;
                    flag = true;
                }
                temp = temp.getNext();
                if (temp == null){
                    flag = true;
                }
            }
        }
        return contains;
    }

    @Override
    public void insertAtPosition(E element, int position) {
        if (position < 0 || position > this.size){
            System.out.println("Index out of bounds");
            throw new IndexOutOfBoundsException();
        } else if (this.size == 0 && position == 1){
            addFirst(element);
        } else if (position == this.size){
            addLast(element);
        } else {
            DNode<E> temp1 = this.head;
            DNode<E> temp2 = this.tail;
            for (int i = 0; i < position - 1; i++){
                temp1 = temp1.getNext();
            }
            for (int i = this.size - 1; i > position; i--){
                temp2 = temp2.getBefore();
            }
            DNode<E> newNode = new DNode<>(element, temp2, temp1);
            temp1.setNext(newNode);
            temp2.setBefore(newNode);
            System.out.println();
            this.size++;
        }

    }

    @Override
    public String toString() {
        return "DNodeConcrete{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("List emptied.");
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
            DNode<E> temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext(); // temp = element prije removed elementa
            }
            DNode<E> temp2 = temp.getNext();
            temp.setNext(temp2); //Element prije pokazuje na element poslije
            temp = temp.getNext();
            temp.setNext(null); // Removed element ne pokazuje na nikoga ispred sebe
            temp.setBefore(null); // Removed element ne pokazuje na nikoga iza sebe
            this.size--;
        }
        return element;
    }

    @Override
    public E getFirst() {
        E firstElement = null;
        firstElement = this.head.getElement();
        return firstElement;
    }
    
    @Override
    public E getLast() {
        E lastElement = null;
        lastElement = this.tail.getElement();
        return lastElement;
    }
}
