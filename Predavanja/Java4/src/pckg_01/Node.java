package pckg_01;

public class Node<E>{

    private E element;
    private Node<E> next;

    public Node(E element, Node next){
        this.element = element;
        this.next = next;
    }

    public E getElement(){
        return this.element;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node nextNode){
        this.next = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}