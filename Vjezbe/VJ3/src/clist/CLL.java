package clist;

import zadatak1.Node;
import zadatak1.SLL;

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

    public Node<E> getTail() throws NullPointerException{
        if(tail==null){
            System.out.println("Tail is null");
            throw new NullPointerException("Tail is null!");
        } else {
            System.out.println("Tail: " + tail.getElement());
        }
        return tail;
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
            System.out.println("Removing the element: " + element);
            size--;
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;

        if (isEmpty()) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            removeFirst();
        } else {

        }

        return element;
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
        return "CLL [tail=" + (tail != null ? tail.getElement() : "null") + ", size=" + size + "]";
    }

    public void rotate() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            tail = tail.getNext();
            System.out.println("Rotation for one step!");
        }

    }

    @Override
    public void clear() {
        tail = null;
        size = 0;
        System.out.println("List is cleared!");
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E getFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("List is empty - returning null!");
        } else {
            element = tail.getNext().getElement();
        }
        return element;
    }

    @Override
    public E getLast() {
        E element = null;
        if (isEmpty()) {
            System.out.println("List is empty - returning null!");
        } else {
            element = tail.getElement();
        }
        return element;
    }
}

