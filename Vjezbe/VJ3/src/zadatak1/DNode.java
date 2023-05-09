package zadatak1;

public class DNode<E> {
    private E element;
    private DNode<E> next;
    private DNode<E> before;
    
    
    public DNode(E element, DNode<E> next, DNode<E> before) {
    this.element = element;
        this.next = next;
        this.before = before;
    }


    public E getElement() {
        return element;
    }

    public DNode<E> getNext() {
        return next;
    }

    public void setNext(DNode<E> next) {
        this.next = next;
    }

    public DNode<E> getBefore() {
        return before;
    }

    public void setBefore(DNode<E> before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "element=" + element +
                ", next=" + next +
                ", before=" + (before != null ? before.getElement() : "null") +
                '}';
    }
}
