package clist;

import zadatak1.Node;

public class TestCLL {

    public static void main(String[] args) {
        CLL<Integer> cllist = new CLL<>();
        System.out.println(cllist);
        cllist.addLast(100);
        System.out.println(cllist);
        cllist.removeFirst();
        try{
            Node<Integer> tail = cllist.getTail();
            System.out.println("Tail: " + tail.getElement());
        } catch (NullPointerException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println(cllist);

        cllist.addFirst(200);
        System.out.println(cllist);
        cllist.addFirst(300);
        System.out.println(cllist);
        cllist.addLast(-100);
        System.out.println(cllist);
        cllist.addLast(-2020202);
        System.out.println(cllist);
    }
}
