package zadatak1;

public class TestDLL {

    public static void main(String[] args) {

        DNodeConcrete<Integer> dlist = new DNodeConcrete<>();
        dlist.addLast(100);
        dlist.addLast(200);
        dlist.addLast(300);
        System.out.println(dlist);
        dlist.addFirst(30);
        dlist.addFirst(20);
        dlist.addFirst(10);
        System.out.println(dlist);
        //dlist.insertAtPosition(3, -1000);
        //System.out.println(dlist);
        //dlist.insertAtPosition(0, 25000);
        //dlist.insertAtPosition(dlist.size(), -25000);
        System.out.println(dlist);
        dlist.remove(0);
        System.out.println(dlist);
        dlist.remove(dlist.size() - 1);
        System.out.println(dlist);
        dlist.remove(3);
        System.out.println(dlist);
        dlist.clear();
        System.out.println(dlist);
        System.out.println("List contains 200: " + dlist.containsElement(200));
        System.out.println("List contains -300: " + dlist.containsElement(-300));

    }
}

// POPRAVITI REMOVE I CONTAINS ELEMENT -> DNODECONCRETE